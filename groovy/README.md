# gradle-xxx-plugin-groovy

## Description
Sample Gradle Plugins in Groovy.

## Requirements
- Gradle 3.0

## How to use
```groovy
// build.gradle
buildscript {
    dependencies {
        classpath files('gradle-xxx-plugin-groovy.jar')
    }
}

apply plugin: 'com.github.ohtomi.gradle-xxx-plugin.groovy'

hello {
    value = 'extensions-value'
}

task greeting(type: com.example.PluginTask) {
    filePath = "$buildDir/greeting.txt"
    fileContent = 'Hello, world'
}
```

```bash
$ gradle --daemon greeting
:greeting
Hello world! value=extensions-value
file created. path: /Users/ohtomi/localrepo/gradle-xxx-plugin/testproject/build/greeting.txt

BUILD SUCCESSFUL

Total time: 0.786 secs
```

## How to build
```bash
$ gradle --daemon jar
```

## Contributing
1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D

## License
MIT
