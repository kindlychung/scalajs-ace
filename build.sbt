lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "Scala.js Ace"

normalizedName := "scalajs-ace"

version := "0.0.1-SNAPSHOT"

organization := "com.scalawarrior"

scalaVersion := "2.11.7"

//crossScalaVersions := Seq("2.10.4", "2.11.5")

libraryDependencies +=
  "org.scala-js" %%% "scalajs-dom" % "0.8.2"

//jsDependencies +=
//  "org.webjars" % "jquery" % "2.1.3" / "2.1.3/jquery.js"
//
//publishTo <<= (version) { version: String =>
//  val repoInfo =
//    if (version.trim.endsWith("SNAPSHOT"))
//      ("amateras snapshots" -> "/home/groups/a/am/amateras/htdocs/mvn-snapshot/")
//    else
//      ("amateras releases" -> "/home/groups/a/am/amateras/htdocs/mvn/")
//  Some(Resolver.ssh(
//    repoInfo._1,
//    "shell.sourceforge.jp",
//    repoInfo._2) as(System.getProperty("user.name"), (Path.userHome / ".ssh" / "id_rsa").asFile) withPermissions("0664"))
//}
