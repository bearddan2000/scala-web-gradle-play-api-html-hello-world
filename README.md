# scala-web-gradle-play-api-html-hello-world

## Description
A call to playframework web api
with a value and readers html file.

## Tech stack
- scala
- gradle
  - play

## Docker stack
- gradle:jdk11

## To run
`sudo ./install.sh -u`
End points
- http://localhost
- curl -X PUT localhost/message
- curl -X PUT localhost/John

## To stop (optional)
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Code based on](https://www.baeldung.com/java-intro-to-the-play-framework)
- [Gradle build code based on](https://gradle.github.io/playframework/#dependency_configurations)
