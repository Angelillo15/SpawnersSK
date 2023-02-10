plugins {
    id("java")
}

group = "es.angelillo15.spsk"
version = parent?.version ?: "undefined"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.19-R0.1-SNAPSHOT")
    compileOnly(project(":SpawnersSK-API"))
}

tasks.processResources {
    filesMatching("plugin.yml") {
        expand("version" to (parent?.version ?: project.version))
    }
}