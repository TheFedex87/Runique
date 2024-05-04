import com.android.build.api.dsl.LibraryExtension
import it.thefedex87.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryComposeConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("runique.android.library")

                val extension = extensions.getByType<LibraryExtension>()
                configureAndroidCompose(extension)
            }
        }
    }
}