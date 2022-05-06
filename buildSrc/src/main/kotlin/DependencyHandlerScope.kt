import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.implementationKtorClient(version: String) = Dependency.apply {
    implementationKtorClientCore(version)
    implementationKtorClientCIO(version)
}

fun DependencyHandlerScope.implementationAndroid(
    coreVersion: String,
    lifecycleVersion: String,
    appcompatVersion: String,
    materialVersion: String,
    constraintVersion: String,
) = Dependency.apply {
    implementationAndroidLifecycle(lifecycleVersion)
    implementationAndroidCore(coreVersion)
    implementationAndroidAppcompat(appcompatVersion)
    implementationAndroidMaterial(materialVersion)
    implementationAndroidConstraint(constraintVersion)
}

// Jetpack Compose
// https://developer.android.com/jetpack/compose/setup
fun DependencyHandlerScope.implementationCompose(
    composeUiVersion: String,
    composeActivityVersion: String,
    composeNavigationVersion: String,
    composeAccompanistVersion: String,
) = Dependency.apply {
    implementationComposeUi(version = composeUiVersion)
    implementationComposeActivity(version = composeActivityVersion)
    implementationComposeNavigation(version = composeNavigationVersion)
    implementationComposeAccompanist(version = composeAccompanistVersion)
}

fun DependencyHandlerScope.testImplementationJunit(version: String) = Dependency.apply {
    testImplementationJunit(version)
}
