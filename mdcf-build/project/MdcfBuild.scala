/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

import sbt._
import Keys._
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

  import ProjectInfo._

  lazy val mdcf =
    Project(
      id = "mdcf",
      settings = mdcfSettings ++
        Seq(makeDistTask, depDotTask, printPisTask),
      base = file(".")) aggregate (
        lib, util, pilar, konkrit,
        dmlAst, dmsCore, dmsExample, dmsTest,
        dmlMatching, dmlMatchingExt, dmlMatchingTest) settings (
          name := "MDCF")

  final val scalaVer = "2.10.2"
    
  lazy val mdcfSettings = Defaults.defaultSettings ++ Seq(
    organization := "SAnToS Laboratory",
    artifactName := {
      (config : ScalaVersion, module : ModuleID, artifact : Artifact) =>
        artifact.name + (
          artifact.classifier match {
            case Some("sources") => "-src"
            case Some("javadoc") => "-doc"
            case _               => ""
          }) + "." + artifact.extension
    },
    fork := true,
    scalaVersion := scalaVer,
    scalacOptions ++= Seq("-target:jvm-1.7"),
    libraryDependencies += "org.scala-lang" % "scala-actors" % scalaVer,
    libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVer,
    libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVer,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.10-M4" % "test",
    testOptions += Tests.Argument(TestFrameworks.JUnit, "-v", "-s", "-a"))

  lazy val lib = toSbtProject(libPI)
  lazy val util = toSbtProject(utilPI)
  lazy val pilar = toSbtProject(pilarPI)
  lazy val konkrit = toSbtProject(konkritPI)
  lazy val dmsCore = toSbtProject(dmsCorePI)
  lazy val dmlAst = toSbtProject(dmlAstPI)
  lazy val dmsExample = toSbtProject(dmsExamplePI)
  lazy val dmsTest = toSbtProject(dmsTestPI)
  lazy val dmlMatching = toSbtProject(dmlMatchingPI)
  lazy val dmlMatchingExt = toSbtProject(dmlMatchingExtPI)
  lazy val dmlMatchingTest = toSbtProject(dmlMatchingTestPI)

  def toSbtProject(pi : ProjectInfo) : Project =
    Project(
      id = pi.id,
      settings = mdcfSettings,
      base = pi.baseDir).
      dependsOn(pi.dependencies.map { p =>
        new ClasspathDependency(new LocalProject(p.id),
          Some("test->test;compile->compile;test->compile"))
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
    dmlMatchingExtPI, dmsExamplePI, dmsTestPI)

  import ProjectHelper._

  val depDot = InputKey[Unit]("dep-dot", "Print project dependency in dot.")
  val depDotTask = depDot := {
    val args : Seq[String] = Def.spaceDelimited("<file>").parsed
    dotDependency(args, projectInfos)
  }

  val printPis = TaskKey[Unit]("print-pis", "Print all project infos.")
  val printPisTask = printPis := {
    projectInfos.foreach(println)
  }

  val makeDist = InputKey[Unit]("make-dist", "Make distribution.")
  val makeDistTask = makeDist := {
    val args : Seq[String] = Def.spaceDelimited("[<result-dir>]").parsed
    val currFile = new File("build")
    val (parentDir, isCustomPath) = args match {
      case Seq(path) =>
        val f = new File(path)
        (new File(path), f.getAbsolutePath != currFile.getAbsolutePath)
      case _ => (currFile, false)
    }
    makeDistH({ _.indexOf(" Test") < 0 }, isCustomPath, parentDir)
  }
}
