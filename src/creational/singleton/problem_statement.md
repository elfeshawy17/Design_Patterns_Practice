# Singleton Pattern Practice Problem

## Problem Statement: Global Log Level Controller

Design a **Log Level Controller** for a multi-threaded application to manage a single, consistent logging level (DEBUG, INFO, WARN, ERROR) across all components. The controller must ensure one instance exists, be thread-safe, provide global access, and maintain an unchangeable logging level set at initialization.

### Requirements
1. **Single Instance**: Guarantee only one Log Level Controller instance exists.
2. **Thread Safety**: Ensure safe access by multiple threads concurrently.
3. **Efficient Initialization**: Initialize the logging level (hardcoded as `INFO`) efficiently, supporting lazy initialization where applicable.
4. **Global Access**: Allow easy access from any part of the application.
5. **Immutable Level**: Prevent changes to the logging level after initialization.
6. **Variants**: Implement using:
    - Eager Initialization Singleton
    - Lazy Initialization Singleton
    - Lazy Synchronization Singleton
    - Double-Check Locking Singleton
    - Enum Singleton
7. **Extensibility**: Support adding new logging settings (e.g., log format) without altering the Singleton structure.

### Constraints
- Use a Java `enum` for log levels: `DEBUG`, `INFO`, `WARN`, `ERROR`.
- Hardcode the initial level as `INFO`.
- Provide methods: `getLogLevel()` and `isDebugEnabled()`.
- Use only standard Java libraries (no external dependencies).
- Follow the directory structure:
    - `main.java`: Demonstrates usage.
    - Other `.java` files for implementations (e.g., `LogLevel.java`, Singleton variants).
    - `README.md`: Documents setup and variant comparison.

### Deliverables
- Implement all Singleton variants in `solution/src/`.
- Include `README.md` in `solution/` with:
    - Compilation and run instructions.
    - Comparison of pros and cons of each Singleton variant.
    - Design assumptions.

### Evaluation
- **Correctness**: Ensures single instance and thread safety.
- **Efficiency**: Optimizes initialization and access.
- **Code Quality**: Clear, modular, maintainable code.
- **Adherence**: Meets all requirements, including extensibility.

### Notes
- Use `java.lang.Thread` for concurrency handling if needed.
- Handle edge cases: concurrent initialization, rapid access.