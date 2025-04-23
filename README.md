# Blockbench Model Reader

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![Maven Central](https://img.shields.io/maven-central/v/me.rochblondiaux/blockbenchmodelreader)](https://search.maven.org/artifact/me.rochblondiaux/blockbenchmodelreader)
[![Javadoc](https://javadoc.io/badge2/me.rochblondiaux/blockbenchmodelreader/javadoc.svg)](https://javadoc.io/doc/me.rochblondiaux/blockbenchmodelreader)
![GitHub Issues or Pull Requests](https://img.shields.io/github/issues/rochblondiaux/blockbenchmodelreader)
![GitHub Forks](https://img.shields.io/github/forks/rochblondiaux/blockbenchmodelreader)
![GitHub Stars](https://img.shields.io/github/stars/rochblondiaux/blockbenchmodelreader)

A simple library to read Blockbench models in Java.

## Why?

There is no open-source and maintained library to read Blockbench models in Java.

This library aims to fill this gap.
I'll try to keep it up-to-date with the latest Blockbench versions.

## Installation

### Maven

Add this dependency to your `pom.xml` file:

```xml

<dependency>
    <groupId>me.rochblondiaux</groupId>
    <artifactId>blockbenchmodelreader</artifactId>
    <version>1.3</version>
</dependency>
```

### Gradle

Add this dependency to your `build.gradle` file:

```groovy
implementation 'me.rochblondiaux:blockbenchmodelreader:1.3'
```

## Usage

The library provides an interface called `BlockBenchModelReader` class to read Blockbench models.

You can use the `#reader()` static method to create a new instance of the reader.

Here is an example of how to read a model:

```java
import me.rochblondiaux.blockbench.model.BlockBenchModel;

public static void main(String[] args) {
    Path path = Path.of("/my/path/model.bbmodel");
    try {
        BlockBenchModel model = BlockBenchModelReader.reader().read(path);
    } catch (Exception e) {
        throw new RuntimeException("Error while reading the model", e);
    }
}
```

## Contributing

Contributions are always welcome!

I don't really have a specific guideline for contributions, but please make sure to follow the general code style of the
project.

If you want to contribute, please fork the repository and create a pull request.

## Contributors

- [@rochblondiaux](https://www.github.com/rochblondiaux)
- [MrLarkyy](https://github.com/MrLarkyy)

## Contact

If you want to contact me you can reach me at:

Email: **contact@roch-blondiaux.com**

Discord: **kiwix**

