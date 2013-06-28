/*
Copyright (c) 2013 Robby, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/
import java.io.File

import sbt._

/**
 * @author <a href="mailto:robby@k-state.edu">Robby</a>
 */
object ProjectHelper {

  def transitiveDependencies(projectInfos : Vector[ProjectInfo]) = {
    var piMap = Map[String, ProjectInfo]()
    var depTrans = Map[String, Set[String]]()
    for (pi <- projectInfos) {
      piMap = piMap + (pi.name -> pi)
      depTrans = depTrans + (pi.name -> pi.dependencies.map(_.name).toSet)
    }
    var changed = true
    while (changed) {
      changed = false
      for ((pi, piDep) <- depTrans.toSeq) {
        var newPiDep = piDep
        for (pi2 <- piDep) {
          newPiDep = newPiDep ++ piMap(pi2).dependencies.map(_.name)
        }
        if (newPiDep.size != piDep.size) {
          changed = true
          depTrans = depTrans + (pi -> newPiDep)
        }
      }
    }
    depTrans
  }

  def dotDependency(args : Seq[String], projectInfos : Vector[ProjectInfo]) {
    val filename =
      args match {
        case Seq(file) => file
        case _         => "project-dependency.dot"
      }
    val depTrans = transitiveDependencies(projectInfos)
    import java.io._
    val f = new File(filename)
    val fw = new FileWriter(f)
    try {
      val pw = new PrintWriter(fw)
      pw.println("digraph G {")
      for (pi <- projectInfos.reverse) {
        pw.println("  \"" + pi.name + "\" [shape=\"box\"]")
        val deps = pi.dependencies.map(_.name)
        for (pi2Name <- deps.toSet -- deps.flatMap(depTrans(_)))
          pw.println("  \"" + pi.name + "\" -> \"" + pi2Name + "\"")
      }
      pw.println("}")
      println("Project dependency graph written to: " + f.getCanonicalPath)
    } finally fw.close
  }

  def makeDistH(
    p : String => Boolean, isCustomPath : Boolean, buildDir : File) {
    import ProjectInfo._

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
        IO.copyDirectory(new File(pi.baseDir, "src/main/scala"), testSrcDir)
        IO.copyDirectory(new File(pi.baseDir, "src/main/java"), testSrcDir)
        IO.copyDirectory(new File(pi.baseDir, "src/main/resources"), testSrcDir)
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
}