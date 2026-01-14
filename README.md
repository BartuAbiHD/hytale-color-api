# Hytale Color API 🎨

[![Release](https://img.shields.io/github/v/release/BartuAbiHD/hytale-color-api?include_prereleases)](https://github.com/BartuAbiHD/hytale-color-api/releases)
[![JitPack](https://jitpack.io/v/BartuAbiHD/hytale-color-api.svg)](https://jitpack.io/#BartuAbiHD/hytale-color-api)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Hytale mod geliştiricileri için mesajları kolayca renklendirmeyi sağlayan hafif bir kütüphane. Bu API sayesinde standart Minecraft renk kodlarını (`&a`, `&e`, `&c` vb.) Hytale'in `Message` objesine otomatik olarak dönüştürebilirsiniz.

## ✨ Özellikler
- Standart renk kodlarını (`&0`-`&f`) destekler.
- Mesaj sıfırlama (`&r`) desteği.
- Hytale `Message` API ile tam uyumlu.
- Kullanımı son derece basit ve hızlı.

## 🚀 Kurulum

Kütüphaneyi projenize dahil etmek için kullandığınız yapı sistemine göre aşağıdaki adımları izleyin.

### Maven
`pom.xml` dosyanıza önce depoyu (repository), sonra bağımlılığı (dependency) ekleyin:

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
