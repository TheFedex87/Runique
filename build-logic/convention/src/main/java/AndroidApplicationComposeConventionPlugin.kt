import com.android.build.api.dsl.ApplicationExtension
import it.thefedex87.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidApplicationComposeConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("runique.android.application")

            val extensionFunction = extensions.getByType<ApplicationExtension>()
            configureAndroidCompose(extensionFunction)
        }
    }
}