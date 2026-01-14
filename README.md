# Hytale Color API 🎨

[![Release](https://img.shields.io/github/v/release/BartuAbiHD/hytale-color-api?include_prereleases)](https://github.com/BartuAbiHD/hytale-color-api/releases)
[![JitPack](https://jitpack.io/v/BartuAbiHD/hytale-color-api.svg)](https://jitpack.io/#BartuAbiHD/hytale-color-api)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A lightweight and efficient library designed for Hytale mod developers to easily colorize chat messages. This API automatically parses standard Minecraft-style color codes (e.g., `&a`, `&e`, `&c`) into Hytale's native `Message` objects.

## ✨ Features
- Supports all standard Minecraft color codes (`&0` - `&f`).
- Includes message reset code (`&r`) support.
- Fully compatible with the Hytale `Message` API.
- Extremely simple implementation and high performance.

## 🚀 Installation

Follow the steps below according to your build system to include the library in your project.

### Maven
Add the repository and dependency to your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>[https://jitpack.io](https://jitpack.io)</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.BartuAbiHD</groupId>
        <artifactId>hytale-color-api</artifactId>
        <version>v1.0.0</version>
    </dependency>
</dependencies>

```

### Gradle (Groovy)

Add this to your `build.gradle`:

```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url '[https://jitpack.io](https://jitpack.io)' }
    }
}

dependencies {
    implementation 'com.github.BartuAbiHD:hytale-color-api:v1.0.0'
}

```

### Gradle (Kotlin DSL)

Add this to your `build.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url = uri("[https://jitpack.io](https://jitpack.io)") }
    }
}

dependencies {
    implementation("com.github.BartuAbiHD:hytale-color-api:v1.0.0")
}

```

## 📖 Usage Example

Simply call the `ChatColor.parse()` method to transform strings with color codes into Hytale Message objects.

```java
import me.bartuabihd.hytaleutils.ChatColor;
import com.hypixel.hytale.server.core.universe.PlayerRef;

public class MyMod {
    public void welcomePlayer(PlayerRef player) {
        // Create a colorized string using & codes
        String text = "&d[Server] &aWelcome to the server, &e" + player.getName() + "!";
        
        // Parse and send as a Hytale Message object
        player.sendMessage(ChatColor.parse(text));
    }
}

```

## 🤝 Contributing

Contributions are welcome! Feel free to open a **Pull Request** or report bugs via the **Issues** tab.

## 📄 License

This project is licensed under the **MIT License**.

```
