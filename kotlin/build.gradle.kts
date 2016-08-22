import org.gradle.jvm.tasks.Jar


buildscript {
    extra["kotlin_version"] = "1.0.3"

    repositories {
        gradleScriptKotlin()
    }

    dependencies {
        classpath(kotlinModule("gradle-plugin"))
    }
}

apply {
    plugin("kotlin")
}


repositories {
    gradleScriptKotlin()
    jcenter()
}

dependencies {
    compile(kotlinModule("stdlib", extra["kotlin_version"] as String))
    compile("org.jetbrains.kotlin:gradle-api:1.6")
}


//val stdlibModule = project.configurations.compile.resolvedConfiguration.firstLevelModuleDependencies.filter { it.moduleName == "kotlin-stdlib" }.single()
//val stdlibJars = stdlibModule.allModuleArtifacts.map { it.file.toURI().toString() }

tasks.withType<Jar> {
    baseName = "gradle-xxx-plugin-kotlin"
//    from(stdlibJars)
}
