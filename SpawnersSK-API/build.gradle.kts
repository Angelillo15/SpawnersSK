plugins {
    id("java")
    id("net.kyori.blossom") version "1.3.1"
    id("org.ajoberstar.grgit") version "4.1.0"
}

group = "es.angelillo15.spsk"
version = parent?.version ?: "undefined"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.19-R0.1-SNAPSHOT")
    compileOnly("net.byteflux:libby-bukkit:1.1.5")
}

blossom {
    replaceTokenIn("src/main/java/es/angelillo15/spsk/api/Constants.java")
    replaceToken("{version}", project.version)
    replaceToken("{git-commit}",  grgit.head().abbreviatedId ?: "undefined")
}