plugins {
  id("de.qualersoft.robotframework")
}

version = "0.0.1"

repositories {
  mavenLocal()
  mavenCentral()
}

tasks.register<de.qualersoft.robotframework.gradleplugin.tasks.LibdocTask>("libdocRun") {
  libdoc {
    outputFile.set(file("libdoc.html"))
    libraryOrResourceFile = "src/test/robot/test.robot"
  }
}
