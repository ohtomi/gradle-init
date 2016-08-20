package com.example

import org.gradle.api.Plugin
import org.gradle.api.Project


class PluginMain() : Plugin<Project> {

    override fun apply(project: Project) {
        project.extensions.create<PluginConfiguration>("hello", PluginConfiguration::class.java)
    }
}
