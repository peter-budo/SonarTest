// Top-level build file where you can add configuration options common to all sub-projects/modules.
@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
  alias(libs.plugins.androidApplication) apply false
  alias(libs.plugins.kotlinAndroid) apply false
  alias(libs.plugins.sonarqube) apply false
  alias(libs.plugins.androidLibrary) apply false
}
true // Needed to make the Suppress annotation work for the plugins block


sonar {
  properties {
    property("sonar.projectKey", "MY_PROJECT_KEY")
    property("sonar.host.url", "https://sonarqube.devops.COMPANY")
    property("sonar.projectName", "MY_PROJECT_NAME")
    property("sonar.gradle.skipCompile", "true")
  }
}
