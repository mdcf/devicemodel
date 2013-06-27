/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

import sbt._
import Keys._
import eu.henkelmann.sbt._
import scala.collection.mutable.ArrayBuffer
import java.net.URLClassLoader
import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.FileReader
import java.io.FileWriter
import java.io.OutputStreamWriter
import java.io.PrintWriter
import java.security._
import java.util.Properties
import java.util.StringTokenizer
import java.io.StringWriter

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object MdcfBuild extends Build {
  final val BUILD_FILENAME = "BUILD"
  final val PRELUDE_DIR = "codebase/sireum-core.prelude/"
  final val CORE_DIR = "codebase/sireum-core/"
  final val DML_DIR = "codebase/mdcf-devicemodel/"

  var projectInfos = Vector[ProjectInfo]()

  lazy val mdcf =
    Project(
      id = "mdcf",
      settings = mdcfSettings ++ Seq(
        makeDistTask,
        depDotTask,
        printPisTask),
      base = file(".")) aggregate (
        lib, util, pilar, konkrit,
        dmlAst, dmsCore, dmsExample,
        dmlMatching, dmlMatchingExt) settings (
          name := "MDCF")

  final val scalaVer = "2.10.2"

  lazy val mdcfSettings = Defaults.defaultSettings ++ Seq(
    organization := "SAnToS Laboratory",
    artifactName := { (config : ScalaVersion, module : ModuleID, artifact : Artifact) =>
      artifact.name + (
        artifact.classifier match {
          case Some("sources") => "-src"
          case Some("javadoc") => "-doc"
          case _               => ""
        }) + "." + artifact.extension
    },
    parallelExecution in Test := false,
    scalaVersion := scalaVer,
    publishArtifact in (Compile, packageDoc) := false,
    publishArtifact in (Test, packageBin) := true,
    publishArtifact in (Test, packageDoc) := false,
    publishArtifact in (Test, packageSrc) := true,
    scalacOptions ++= Seq("-target:jvm-1.7"),
    libraryDependencies += "org.scala-lang" % "scala-actors" % scalaVer,
    libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVer,
    libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVer,
    libraryDependencies += "org.scalatest" %% "scalatest" % "2.0.M5b" % "test",
    testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oD"),
    testListeners <<= (target, streams).map((t, s) => Seq(new JUnitXmlTestsListener(t.getAbsolutePath)))
  )

  lazy val lib = toSbtProject(libPI)
  lazy val util = toSbtProject(utilPI)
  lazy val pilar = toSbtProject(pilarPI)
  lazy val konkrit = toSbtProject(konkritPI)
  lazy val dmsCore = toSbtProject(dmsCorePI)
  lazy val dmlAst = toSbtProject(dmlAstPI)
  lazy val dmsExample = toSbtProject(dmsExamplePI)
  lazy val dmlMatching = toSbtProject(dmlMatchingPI)
  lazy val dmlMatchingExt = toSbtProject(dmlMatchingExtPI)

  def toSbtProject(pi : ProjectInfo) : Project =
    Project(
      id = pi.id,
      settings = mdcfSettings,
      base = pi.baseDir).
      dependsOn(pi.dependencies.map { p =>
        new ClasspathDependency(new LocalProject(p.id), None)
      } : _*).
      settings(name := pi.name)

  val libPI = new ProjectInfo("Sireum Lib", PRELUDE_DIR, Seq())
  val utilPI = new ProjectInfo("Sireum Util", PRELUDE_DIR, Seq(),
    libPI)
  val pilarPI = new ProjectInfo("Sireum Pilar", CORE_DIR, Seq(),
    libPI, utilPI)
  val konkritPI = new ProjectInfo("Sireum Konkrit", CORE_DIR, Seq(),
    libPI, utilPI, pilarPI)

  val dmlAstPI = new ProjectInfo("MDCF DML AST", DML_DIR, Seq(),
    libPI)
  val dmsCorePI = new ProjectInfo("MDCF DMS Core", DML_DIR, Seq(),
    libPI, utilPI, dmlAstPI)
  val dmsExamplePI = new ProjectInfo("MDCF DMS Example", DML_DIR, Seq(),
    libPI, utilPI, dmsCorePI, dmlAstPI)
  val dmsTestPI = new ProjectInfo("MDCF DMS Test", DML_DIR, Seq(),
    libPI, utilPI, dmsCorePI, dmlAstPI, dmsExamplePI)
  val dmlMatchingPI = new ProjectInfo("MDCF DML Matching", DML_DIR, Seq(),
    libPI, utilPI, pilarPI, konkritPI, dmsCorePI, dmlAstPI)
  val dmlMatchingExtPI = new ProjectInfo("MDCF DML Matching Extension", DML_DIR, Seq(),
    libPI, utilPI, pilarPI, konkritPI, dmsCorePI, dmlAstPI, dmlMatchingPI)
  val dmlMatchingTestPI = new ProjectInfo("MDCF DML Matching Test", DML_DIR, Seq(),
    libPI, utilPI, pilarPI, konkritPI, dmsCorePI, dmlAstPI, dmlMatchingPI,
    dmlMatchingExtPI, dmsExamplePI)

  /**
   * @author <a href="mailto:robby@k-state.edu">Robby</a>
   */
  case class ProjectInfo(name : String, dir : String,
                         depFeatures : Seq[String],
                         dependencies : ProjectInfo*) {
    projectInfos = projectInfos.:+(this)
    val id = name.toLowerCase.replace(" ", "-")
    val baseDir = file(dir + id)
    lazy val (libFiles, srcFiles, licensesFiles) = {
      val libs = ArrayBuffer[File]()
      val srcs = ArrayBuffer[File]()
      val licenses = ArrayBuffer[File]()

        def mineFiles(dir : File) {
          if (dir.exists) {
            for (f <- dir.listFiles) {
              if (f.isDirectory)
                mineFiles(f)
              else {
                val fName = f.getName
                if (fName.endsWith("-src.jar") || fName.endsWith("-src.zip"))
                  srcs += f
                else if (fName.endsWith(".jar"))
                  libs += f
                else if (fName.endsWith("-license.txt"))
                  licenses += f
              }
            }
          }
        }
      mineFiles(baseDir / "lib")
      mineFiles(baseDir / "elib")
      mineFiles(baseDir / "target")
      (libs, srcs, licenses)
    }

    def toDot(seen : scala.collection.mutable.Set[String], pw : PrintWriter) {
      if (seen.contains(name)) return

      seen += name
      pw.println("  \"" + name + "\" [shape=\"box\"]")
      for (pi <- dependencies)
        pw.println("  \"" + name + "\" -> \"" + pi.name + "\"")
    }

    override def toString = {
        def h(t : Traversable[Object]) =
          if (t.isEmpty) "None"
          else "\n" + t.foldLeft("")((s, o) => s + "* " + o.toString + "\n")
      s"""
Project Name:         $name
Project Directory:    $dir
Feature Dependencies: ${h(depFeatures)}
Project Dependencies: ${h(dependencies.map(_.name))}
Library Files:        ${h(libFiles)}
Source Files:         ${h(srcFiles)}
License Files:        ${h(licensesFiles)}
      """
    }
  }

  val depDot = InputKey[Unit]("dep-dot", "Print project dependency in dot.")
  val depDotTask = depDot := {
    val args : Seq[String] = Def.spaceDelimited("<file>").parsed
    ProjectHelper.dotDependency(args, projectInfos)
  }

  val printPis = TaskKey[Unit]("print-pis", "Print all project infos.")
  val printPisTask = printPis := {
    projectInfos.foreach(println)
  }

  def makeDistH(
    p : String => Boolean, isCustomPath : Boolean, parentDir : File) {
    val buildDir = new File(parentDir, "build")
    val libDir = new File(buildDir, "lib")
    val srcDir = new File(buildDir, "src")
    val licDir = new File(buildDir, "licenses")
    val testSrcDir = new File(buildDir, "test/src")
    libDir.mkdirs
    srcDir.mkdirs
    licDir.mkdirs
    testSrcDir.mkdirs
    for (pi <- projectInfos) {
      if (p(pi.name)) {
        for (libF <- pi.libFiles)
          IO.copyFile(libF, new File(libDir, libF.getName), true)
        for (srcF <- pi.srcFiles)
          IO.copyFile(srcF, new File(srcDir, srcF.getName), true)
      } else {
        IO.copyDirectory(new File(pi.baseDir, "src/test/scala"), testSrcDir)
        IO.copyDirectory(new File(pi.baseDir, "src/test/java"), testSrcDir)
        IO.copyDirectory(new File(pi.baseDir, "src/test/resources"), testSrcDir)
      }
      for (licF <- pi.licensesFiles)
        IO.copyFile(licF, new File(licDir, licF.getName), true)
    }
    if (isCustomPath)
      IO.copyFile(new File("build/build.xml"), new File(buildDir, "build.xml"))
  }

  val makeDist = InputKey[Unit]("make-dist", "Make core distribution.")
  val makeDistTask = makeDist := {
    val args : Seq[String] = Def.spaceDelimited("[<result-parent-dir>]").parsed
    val currFile = new File(".")
    val (parentDir, isCustomPath) = args match {
      case Seq(path) =>
        val f = new File(path)
        (new File(path), f.getAbsolutePath != currFile.getAbsolutePath)
      case _ => (new File("."), false)
    }
    makeDistH({ _.indexOf(" Test") < 0 }, isCustomPath, parentDir)
  }
}
