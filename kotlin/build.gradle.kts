import org.gradle.jvm.tasks.Jar
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.dokka.gradle.LinkMapping


buildscript {
    extra["kotlin_version"] = "1.0.3"
    extra["dokka_version"] = "0.9.9"

    repositories {
        gradleScriptKotlin()
        jcenter()
    }

    dependencies {
        classpath(kotlinModule("gradle-plugin"))
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:${extra["dokka_version"]}")
    }
}

apply {
    plugin("kotlin")
    plugin("org.jetbrains.dokka")
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

tasks.withType<DokkaTask> {
    moduleName = "com.example"
    outputFormat = "javadoc"
    outputDirectory = "${buildDir.absolutePath}/javadoc"
    linkMappings = java.util.ArrayList(listOf(LinkMapping().apply {
        dir = "src/main/kotlin"
        url = "https://github.com/ohtomi/gradle-xxx-plugin/blob/master/src/kotlin"
        suffix = "#L"
    }))
    sourceDirs = files("src/main/kotlin")
}
