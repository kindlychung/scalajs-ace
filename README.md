scalajs-ace
===============

Static types for the [Ace](http://ace.c9.io/) editor for [Scala.js](http://www.scala-js.org/) programs. Forked from here: https://github.com/scalawarrior/scalajs-ace

Usage
-----

Add the following to your sbt build definition:


Share this release:


```scala
    resolvers += "jitpack" at "https://jitpack.io"

	libraryDependencies += "com.github.kindlychung" % "scalajs-ace" % "0.2"
```

then enjoy Ace in Scala.js!

```scala
import com.scalawarrior.scalajs.ace.ace
    val editor = ace.edit("mathinput")
    editor.setOptions(js.Dynamic.literal(enableBasicAutocompletion = true))
    var langTools = ace.require("ace/ext/language_tools");
    editor.setTheme("ace/theme/monokai")
    editor.getSession().setMode("ace/mode/scala")
    val texString = editor.getValue()
    println(texString)
```
