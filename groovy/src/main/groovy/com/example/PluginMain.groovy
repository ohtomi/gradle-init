package com.example

import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginMain implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('hello') << {
            println 'Hello world'
        }
    }

}
