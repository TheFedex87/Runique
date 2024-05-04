plugins {
    alias(libs.plugins.runique.android.feature.ui)
}

android {
    namespace = "it.thefedex87.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}