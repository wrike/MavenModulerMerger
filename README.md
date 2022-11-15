## Description

Maven module merger allows you to merge maven modules into one big module.
For more information, please check out the generated JavaDoc.

## How to open JavaDoc

You can generate JavaDoc with maven.

```shell
mvn -P GenerateJavaDoc javadoc:javadoc
```

After that, you can open the generated JavaDoc.

```shell
open target/site/apidocs/index.html #open this file in browser
```

## How to build the project

You can build the project with maven:
```shell
mvn clean install
```

## How to create a standalone jar file

You can create a standalone executable jar, which will contain all dependencies.
```shell
mvn -P JarWithDependencies clean install
```
Then you can run the jar file.
```shell
cd target
java -jar maven_modules_merger-*-jar-with-dependencies.jar modulesList pathToProjectRoot pathToOutputFile mergeMode 
```
