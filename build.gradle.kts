plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "4.0.4"
}

group = "es.angelillo15.spsk"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
    maven("https://repo.codemc.io/repository/maven-public/")
    maven("https://repo.alessiodp.com/releases/")
    maven("https://repo.nookure.com/repository/maven-public/")
}

tasks.shadowJar {
    relocate("es.angelillo15.configmanager", "es.angelillo15.spsk.libs.config.manager")
    relocate("org.yaml.snakeyaml", "es.angelillo15.spsk.libs.snakeyaml")
    relocate("org.simpleyaml", "es.angelillo15.spsk.libs.simpleyaml")
    relocate("es.angelillo15.glow", "es.angelillo15.spsk.libs.glow")
    relocate("net.kyori.adventure", "es.angelillo15.spsk.libs.adventure")
    relocate("mc.obliviate", "es.angelillo15.spsk.libs.obliviate")
    relocate("com.zaxxer.hikari", "es.angelillo15.spsk.libs.hikari")
    relocate("com.google.common", "es.angelillo15.spsk.libs.google.common")
    relocate("com.google.gson", "es.angelillo15.spsk.libs.google.gson")
    relocate("com.google.thirdparty", "es.angelillo15.spsk.libs.google.thirdparty")
    relocate("com.google.errorprone", "es.angelillo15.spsk.libs.google.errorprone")
    relocate("com.google.j2objc", "es.angelillo15.spsk.libs.google.j2objc")
    relocate("javax.annotation", "es.angelillo15.spsk.libs.javax.annotation")
    relocate("org.checkerframework", "es.angelillo15.spsk.libs.checkerframework")
    relocate("net.byteflux.libby", "es.angelillo15.spsk.libs.libby")
    relocate("ru.vyarus.yaml.updater", "es.angelillo15.spsk.libs.yaml-config-updater")
}

dependencies {
    implementation(project(":SpawnersSK-API"))
    implementation(project(":SpawnersSK-Bukkit"))
    implementation("com.github.Carleslc.Simple-YAML:Simple-Yaml:1.8.3")
    implementation("com.github.Angelillo15:ConfigManager:1.4")
    implementation("com.github.hamza-cskn.obliviate-invs:core:4.1.10")
    implementation("com.github.hamza-cskn.obliviate-invs:advancedslot:4.1.10")
    implementation("com.github.hamza-cskn.obliviate-invs:pagination:4.1.10")
    implementation("com.github.hamza-cskn.obliviate-invs:configurablegui:4.1.10")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("net.byteflux:libby-bukkit:1.1.5")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

allprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://repo.codemc.io/repository/maven-public/")
        maven("https://repo.alessiodp.com/releases/")
        maven("https://repo.nookure.com/repository/maven-public/")
        maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
        maven("https://oss.sonatype.org/content/repositories/snapshots")
        maven("https://oss.sonatype.org/content/repositories/central")
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    dependencies {
        compileOnly("org.projectlombok:lombok:1.18.24")
        annotationProcessor("org.projectlombok:lombok:1.18.24")
    }
}