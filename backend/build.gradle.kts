plugins {
    java
    id("org.springframework.boot") version "2.6.1"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

allprojects {
    version = "1.0"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin="java")
    apply(plugin="org.springframework.boot")
    apply(plugin="io.spring.dependency-management")
}

dependencies {
    implementation(project(":contextA"))
    implementation(project(":contextB"))

    implementation("org.springframework.boot:spring-boot-starter-web")
}