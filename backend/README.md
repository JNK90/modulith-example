# Backend

The Java + Spring Boot backend uses Gradle to define a [root project]("src") und multiple subprojects ([contextA]("contextA/src/") & [contextB]("contextB/src/")).

Each subproject represents a module. The root project wraps all modules and enables to build a single jar artifact. Also it defines global dependencies that each module must implement to work right (e.g. spring-boot-starter-web). See [build.gradle.kts]("build.gradle.kts") and [settings.gradle.kts]("settings.gradle.kts") for details. 

Each context has it's own build file to define dependencies, only used by itself. Additionally we use Java 9 modules to exaclty define which elements of a module can be seen and called by other modules. This should prevent deep coupling between modules.

To invert dependencies between modules you could implement the observer pattern (e.g. RxJava) to.