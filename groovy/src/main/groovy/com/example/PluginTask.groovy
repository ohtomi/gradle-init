package com.example

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class PluginTask extends DefaultTask {

    def filePath
    def fileContent

    @TaskAction
    def greet() {
        println "Hello world! value=${project.hello.value}"

        def file = project.file(filePath)
        file.parentFile.mkdirs()
        file.write "content: ${fileContent}"
        println "file created. path: ${file}"
    }

}
