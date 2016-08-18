package com.example

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class PluginTask() : DefaultTask() {

    var filePath: String = ""
    var fileContent: String = ""

    @TaskAction
    fun greet() {
        println("Hello world! value=${project.convention.getPlugin<PluginConfiguration>(PluginConfiguration::class.java).value}")

        val file = project.file(filePath)
        file.parentFile.mkdirs()
        file.writeText("content: ${fileContent}")
        println("file created. path: ${file}")
    }

}
