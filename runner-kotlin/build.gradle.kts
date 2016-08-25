import com.example.PluginConfiguration
import com.example.PluginTask


buildscript {
    extra["kotlin_version"] = "1.0.3"

    repositories {
        gradleScriptKotlin()
    }

    dependencies {
        classpath(kotlinModule("gradle-plugin"))
        classpath(files("../kotlin/build/libs/gradle-xxx-plugin-kotlin.jar"))
    }
}

apply {
    plugin("kotlin")
    plugin("com.github.ohtomi.gradle-xxx-plugin.kotlin")
}


repositories {
    gradleScriptKotlin()
    jcenter()
}

dependencies {
    compile(kotlinModule("stdlib", extra["kotlin_version"] as String))
}


val hello = project.extensions.getByName("hello") as PluginConfiguration
hello.value = "extensions-value"

task("greeting", PluginTask::class) {
    filePath = "${buildDir.absolutePath}/greeting.txt"
    fileContent = "Hello, world"
}
