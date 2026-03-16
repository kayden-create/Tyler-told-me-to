# Tyler-told-me-to

## Requirements

- Java 21 (LTS) is required to build and run this project.
	- Install a JDK (Temurin/Adoptium, OpenJDK, or your preferred distribution).
	- Ensure `JAVA_HOME` points to the JDK installation and `java -version` reports a 21.x runtime.

## Quick build & test

```powershell
mvn -U clean test
```

If your CI uses GitHub Actions or another runner, make sure the runner is configured to use Java 21.