import org.gradle.kotlin.dsl.DependencyHandlerScope

object Dependency {

    fun DependencyHandlerScope.implementationKtorClientCIO(version: String) {
        add("implementation", "io.ktor:ktor-client-cio:$version")
    }

    fun DependencyHandlerScope.implementationKtorClientCore(version: String) {
        add("implementation", "io.ktor:ktor-client-core:$version")
    }

    fun DependencyHandlerScope.implementationAndroidLifecycle(version: String) {
        add("implementation", "androidx.lifecycle:lifecycle-runtime-ktx:$version")
    }

    fun DependencyHandlerScope.testImplementationJunit(version: String) {
        add("implementation", "junit:junit:$version")
    }

    fun DependencyHandlerScope.implementationAndroidCore(version: String) {
        add("implementation", "androidx.core:core-ktx:$version")
    }

    fun DependencyHandlerScope.implementationAndroidAppcompat(version: String) {
        add("implementation", "androidx.appcompat:appcompat:$version")
    }

    fun DependencyHandlerScope.implementationAndroidMaterial(version: String) {
        add("implementation", "com.google.android.material:material:$version")
    }

    fun DependencyHandlerScope.implementationAndroidConstraint(version: String) {
        add("implementation", "androidx.constraintlayout:constraintlayout:$version")
    }

    fun DependencyHandlerScope.implementationComposeUi(version: String) {
        add("implementation", "androidx.compose.ui:ui:$version")
        add("implementation", "androidx.compose.ui:ui-tooling:$version")
        // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
        add("implementation", "androidx.compose.foundation:foundation:$version")
        // Material Design
        add("implementation", "androidx.compose.material:material:$version")
        // Material design icons
        add("implementation", "androidx.compose.material:material-icons-core:$version")
        add("implementation", "androidx.compose.material:material-icons-extended:$version")
    }

    fun DependencyHandlerScope.implementationComposeActivity(version: String) {
        add("implementation", "androidx.activity:activity-compose:$version")
    }

    fun DependencyHandlerScope.implementationComposeNavigation(version: String) {
        add("implementation", "androidx.navigation:navigation-compose:$version")
    }

    fun DependencyHandlerScope.implementationComposeAccompanist(version: String) {
        add("implementation", "com.google.accompanist:accompanist-pager:$version")
        add("implementation", "com.google.accompanist:accompanist-pager-indicators:$version")
    }
}
