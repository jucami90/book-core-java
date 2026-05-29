# AGENTS.md

## Project Overview

A Java learning/reference project following the **Core Java** book (Cay Horstmann). Each source file is a standalone program demonstrating a specific Java concept. There is no production application, API, or shared state between files.

## Java Version & Language Features

This project uses **Java 24+ preview features** (implicit classes, JEP 463/477):

- **No class declaration** — files use top-level `void main()` instead of `public static void main(String[] args)`
- **`IO.println()` / `IO.readln()`** — use the `java.io.IO` implicit import, NOT `System.out.println()` or `Scanner`
- **No explicit imports** — implicit classes auto-import `java.io.IO`, `java.util.Arrays`, `java.math.BigInteger`, etc.
- **No package declarations** — files live in the unnamed package

When adding new files, follow this pattern (see `src/Chapter3_Fundamentals/HelloWorld.java`):
```java
void main() {
    IO.println("output here");
}
```

## Project Structure

```
src/
  Chapter3_Fundamentals/       # Chapter-based folders matching the book
    Arrays.java   # One concept per file, named after the concept
```

- **No build tool** (no Maven/Gradle) — this is an IntelliJ IDEA module (`CoreJava.iml`)
- **Source root**: `src/` (configured in `CoreJava.iml`)
- Each `.java` file is an independent, runnable program

## Running Files

Run any file directly via IntelliJ or command line:
```sh
java --enable-preview src/Chapter3_Fundamentals/HelloWorld.java
```

There are no tests, no CI, and no build step.

## Conventions When Adding New Code

1. **One concept per file** — create a new `.java` file for each topic (e.g., `Generics.java`, `Streams.java`)
2. **Organize by chapter** — place files in `src/ChapterN/` matching the book structure
3. **Use inline comments** to explain concepts, especially edge cases (see `IntegerTypes.java` for overflow examples, `ControlFlow.java` for switch expression variants)
4. **Prefer `IO.readln()`** for interactive input over `Scanner` (see `Arrays.java` line 24)
5. **Block scoping** — use bare `{}` blocks to isolate multi-step examples within a single `main()` (see `Arrays.java` lottery section)
6. **Keep files self-contained** — no cross-file dependencies, no shared utilities

