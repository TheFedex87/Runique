plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.runique.jvm.ktor)
}

android {
    namespace = "it.thefedex87.run.network"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
}