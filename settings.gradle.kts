pluginManagement {
    repositories {
        google()        // ✅ REQUIRED (THIS FIXES YOUR ERROR)
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()        // ✅ REQUIRED
        mavenCentral()
    }
}

rootProject.name = "nelanudi"
include(":app")