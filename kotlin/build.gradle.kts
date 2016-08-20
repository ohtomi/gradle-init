import org.gradle.jvm.tasks.Jar


buildscript {
    extra["kotlin_version"] = "1.0.3"

    repositories {
        maven {
            setUrl("https://repo.gradle.org/gradle/repo")
        }
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${extra["kotlin_version"]}")
        classpath(kotlinModule("gradle-plugin"))
    }
}

repositories {
    gradleScriptKotlin()
    jcenter()
}

apply {
    plugin("kotlin")
}

dependencies {
    compile(kotlinModule("stdlib", extra["kotlin_version"] as String))
    compile(kotlinModule("gradle-plugin-api"))
    compile("org.jetbrains.kotlin:gradle-api:1.6")
}


//val stdlibModule = project.configurations.compile.resolvedConfiguration.firstLevelModuleDependencies.filter { it.moduleName == "kotlin-stdlib" }.single()
//val stdlibJars = stdlibModule.allModuleArtifacts.map { it.file.toURI().toString() }

tasks.withType<Jar> {
    baseName = "gradle-xxx-plugin-kotlin"
//    from(stdlibJars)
}
