plugins {
  kotlin("jvm") version "1.4.10"
  id("com.diffplug.spotless") version "5.7.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

spotless {
  kotlin {
    target("**/*.kt")
    ktlint("0.39.0").userData(mapOf("indent_size" to "2"))
    trimTrailingWhitespace()
    endWithNewline()
  }
}
