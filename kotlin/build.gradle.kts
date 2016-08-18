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
    compile(kotlinModule("stdlib"))
    compile(kotlinModule("gradle-plugin-api"))
    compile("org.jetbrains.kotlin:gradle-api:1.6")
}

tasks.withType<Jar> {
    baseName = "gradle-xxx-plugin-kotlin"
}
