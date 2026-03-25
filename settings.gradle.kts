rootProject.name = "Darkhax-TestProject"

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        maven {
            url = file("F:/Minecraft/Darkhax-Minecraft-Mod-Conventions/build/local-repo").toURI()
        }
        maven {
            name = "Fabric"
            url = uri("https://maven.fabricmc.net/")
        }
    }
}

include("common", "neoforge", "fabric")