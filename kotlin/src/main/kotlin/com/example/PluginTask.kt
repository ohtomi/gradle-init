package com.example

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction


open class PluginTask() : DefaultTask() {

    var filePath: String = ""
    var fileContent: String = ""

    @TaskAction
    fun greet() {
        val hello = project.property("hello") as PluginConfiguration
        println("Hello world! value=${hello.value}")

        val file = project.file(filePath)
        file.parentFile.mkdirs()
        file.writeText("content: ${fileContent}")
        println("file created. path: ${file}")
    }

}
