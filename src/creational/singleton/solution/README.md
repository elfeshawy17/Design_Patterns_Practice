# Singleton Package

This package contains implementations of the Singleton design pattern for the **Log Level Controller**, a component designed to manage a single, consistent logging level (`DEBUG`, `INFO`, `WARN`, `ERROR`) across a multi-threaded application. Each implementation ensures a single instance, thread safety (where applicable), immutability of the logging level, global access, and extensibility for future logging settings.

## Directory Structure
- **Location**: `DesignPatternsPractice/creational/singleton/solution/`
- **Source Files**: `src/`
    - `LogLevel.java`: Enum defining logging levels (`DEBUG`, `INFO`, `WARN`, `ERROR`).
    - `EagerSingleton.java`: Eager Initialization Singleton implementation.
    - `LazySingleton.java`: Lazy Initialization Singleton implementation.
    - `LazySyncSingleton.java`: Lazy Synchronization Singleton implementation.
    - `DoubleCheckLockingSingleton.java`: Double-Check Locking Singleton implementation.
    - `EnumSingleton.java`: Enum Singleton implementation.
    - `main.java`: Main class to demonstrate usage of all Singleton variants.

## Setup and Execution
### Compilation
Compile all Java files in the `src/` directory:
```bash
javac creational/singleton/solution/src/*.java
```

### Running
Run the `main` class to see the demonstration of all Singleton variants:
```bash
java -cp creational/singleton/solution/src creational.singleton.solution.src.main
```

The `main.java` file instantiates each Singleton variant and prints their logging level and format to verify functionality and single-instance behavior.

## Singleton Variants

### 1. Eager Initialization Singleton (`EagerSingleton.java`)
- **Description**: The instance is created at class loading time, ensuring immediate availability.
- **Pros**:
    - Simple and straightforward implementation.
    - Inherently thread-safe due to static initialization by the JVM.
- **Cons**:
    - Instance is created even if not used, potentially wasting resources.
    - No lazy loading, which may impact startup time for heavy initialization.

### 2. Lazy Initialization Singleton (`LazySingleton.java`)
- **Description**: The instance is created only when `getInstance()` is first called.
- **Pros**:
    - Lazy loading saves resources if the Singleton is not needed.
    - Simple implementation for single-threaded applications.
- **Cons**:
    - Not thread-safe; multiple threads may create multiple instances if accessed concurrently.

### 3. Lazy Synchronization Singleton (`LazySyncSingleton.java`)
- **Description**: Extends Lazy Initialization by adding `synchronized` to `getInstance()`, ensuring thread safety.
- **Pros**:
    - Thread-safe, guaranteeing a single instance in a multi-threaded environment.
    - Retains lazy loading benefits.
- **Cons**:
    - Synchronization on every `getInstance()` call introduces performance overhead, even after initialization.

### 4. Double-Check Locking Singleton (`DoubleCheckLockingSingleton.java`)
- **Description**: Uses double-check locking to reduce synchronization overhead, checking for `null` twice—once outside and once inside a `synchronized` block.
- **Pros**:
    - Thread-safe with lazy loading.
    - Reduces synchronization overhead by only locking during initialization.
- **Cons**:
    - More complex implementation.
    - Requires `volatile` (missing in the current code) to ensure proper visibility in multi-threaded environments (Java 5+).

### 5. Enum Singleton (`EnumSingleton.java`)
- **Description**: Uses a Java `enum` to implement the Singleton pattern, leveraging JVM guarantees.
- **Pros**:
    - Simplest and most concise implementation.
    - Inherently thread-safe and prevents multiple instances, even with reflection or serialization.
- **Cons**:
    - No lazy loading control (initialized when the enum is first accessed).
    - Less flexible for complex initialization logic.

## Design Decisions and Assumptions
- **Package Structure**: All classes are in `creational.singleton.solution.src` for simplicity, but ideally, each variant should be in its own subpackage (e.g., `creational.singleton.solution.src.eager_initialization_singleton`) for better organization.
- **Immutability**: `logLevel` and `logFormat` fields are `final` to ensure immutability after initialization.
- **Extensibility**: Added `logFormat` field (default: `"TEXT"`) to support future logging settings (e.g., `JSON`, `XML` formats).
- **Hardcoded Configuration**: Logging level is hardcoded to `INFO`, as specified in the problem.
- **Thread Safety**:
    - `EagerSingleton` and `EnumSingleton` are inherently thread-safe.
    - `LazySyncSingleton` and `DoubleCheckLockingSingleton` are thread-safe with synchronization.
    - `LazySingleton` is not thread-safe, intended for single-threaded use or as a precursor to thread-safe variants.
- **Main Class**: The `main.java` file demonstrates all variants, printing their logging level and format to verify behavior.

