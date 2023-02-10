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
    compileOnly("com.github.Carleslc.Simple-YAML:Simple-Yaml:1.8.3")
    compileOnly("com.github.Angelillo15:ConfigManager:1.4")
    compileOnly("com.github.hamza-cskn.obliviate-invs:core:4.1.10")
    compileOnly("com.github.hamza-cskn.obliviate-invs:advancedslot:4.1.10")
    compileOnly("com.github.hamza-cskn.obliviate-invs:pagination:4.1.10")
    compileOnly("com.github.hamza-cskn.obliviate-invs:configurablegui:4.1.10")
    compileOnly("com.google.code.gson:gson:2.10.1")
    compileOnly("net.byteflux:libby-bukkit:1.1.5")
    compileOnly("ru.vyarus:yaml-config-updater:1.4.2")
}

tasks.processResources {
    filesMatching("plugin.yml") {
        expand("version" to (parent?.version ?: project.version))
    }
}