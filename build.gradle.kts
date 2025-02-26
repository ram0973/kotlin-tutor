plugins {
    kotlin("jvm") version "2.1.0"
    //kotlin("multiplatform") version "2.1.10"
}

group = "org.ram0973"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(23)
    // macosArm64("native") {  // on macOS
    // linuxArm64("native") { // on Linux
    //mingwX64("native") {  // on Windows
    //    binaries {
    //        executable()
    //    }
    //}
}

//tasks.withType<Wrapper> {
    //gradleVersion = "8.10.2"
    //distributionType = Wrapper.DistributionType.BIN
//}