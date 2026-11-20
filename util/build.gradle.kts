plugins {
    java
    id("io.spring.dependency-management") version "1.1.7"
}

val springBootVersion = "4.1.0"

group = "com.ai.loan.origination.system.util"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:$springBootVersion"))
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
