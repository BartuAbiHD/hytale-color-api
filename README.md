# hytale-color-api

Maven:

<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.hypixel.hytale</groupId>
        <artifactId>Server</artifactId>
        <version>1.0.0</version>
        <scope>provided</scope>
    </dependency>
</dependencies>

Gradle (Groovy) (build.gradle):

dependencyResolutionManagement {
     repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
     repositories {
           mavenCentral() maven {
               url 'https://jitpack.io'
           }
     }
}


dependencies {
     implementation 'com.github.BartuAbiHD:hytale-color-api:v1.0.0'
}

Gradle (Kotlin DSL) (build.gradle.kts):

dependencyResolutionManagement {
      repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
      repositories {
           mavenCentral() maven {
                 url = uri("https://jitpack.io")
           }
      }  
}

dependencies {
        implementation("com.github.BartuAbiHD:hytale-color-api:v1.0.0")
}
