val snapshotVersion : String? = System.getenv("COMPOSE_SNAPSHOT_ID")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        snapshotVersion?.let {
            println("https://androidx.dev/snapshots/builds/$it/artifacts/repository/") 
            maven { url = uri("https://androidx.dev/snapshots/builds/$it/artifacts/repository/") }
        }

        google()
        mavenCentral()
    }
}
rootProject.name = "Labs20262-Gr02"
include(
    ":Lab2-Services",
    ":core:data",
    ":core:data-testing",
    ":core:domain",
    ":core:domain-testing",
    ":core:designsystem",
    ":tv",
    ":wear",
    ":glancewidget"
)
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
