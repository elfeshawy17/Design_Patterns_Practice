# 🏗️ Design Patterns Practice

<div align="center">

![Design Patterns Banner](https://img.shields.io/badge/Design%20Patterns-Practice-blue?style=for-the-badge)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=for-the-badge)](http://makeapullrequest.com)

</div>

## 📖 Overview

Welcome to my Design Patterns Practice repository! This project showcases implementations of classic software design patterns, organized by category and accompanied by detailed explanations and practical examples. Each pattern is implemented to solve a specific problem, demonstrating the pattern's practical application in real-world scenarios.

### Why Design Patterns?

> "Design patterns represent the best practices used by experienced object-oriented software developers. They are solutions to general problems that software developers faced during software development."

## 🔍 Repository Structure

```
Design-Patterns-Practice/
├── creational/
│   ├── singleton/ ✅
│   ├── factory/ 📝
│   ├── abstract_factory/ 📝
│   ├── builder/ 📝
│   └── prototype/ 🔄
├── structural/ (coming soon)
│   ├── adapter/
│   ├── composite/
│   ├── proxy/
│   └── ...
└── behavioral/ (coming soon)
    ├── strategy/
    ├── observer/
    ├── command/
    └── ...
```

Each pattern directory contains:
- `problem_statement.md`: Clear description of the problem being solved
- `solution/src/`: Complete source code implementation
- `README.md`: Comprehensive explanation with diagrams, code examples, and usage guidelines

## 🏆 Implemented Patterns

### Creational Patterns

| Pattern | Description | Status |
|---------|-------------|--------|
| [Singleton](creational/singleton/solution/README.md) | Ensures a class has only one instance | ✅ |
| [Factory Method](creational/factory/solution/README.md) | Creates objects without specifying exact class | 📝 Planned |
| [Abstract Factory](creational/abstract_factory/solution/README.md) | Creates families of related objects | 📝 Planned |
| [Builder](creational/builder/solution/README.md) | Constructs complex objects step by step | 📝 Planned |
| [Prototype](creational/prototype/solution/README.md) | Creates new objects by copying existing ones | 🔄 In Progress |

### Coming Soon

- **Structural Patterns**: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy
- **Behavioral Patterns**: Chain of Responsibility, Command, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Git

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/elfeshawy17/DesignPatternsPractice.git
   cd DesignPatternsPractice
   ```

2. Explore a specific pattern:
   ```bash
   cd creational/singleton
   ```

3. Run the example:
   ```bash
   cd solution
   javac Main.java
   java Main
   ```

## 🤝 Contributing

While this is primarily a personal learning project, constructive feedback and suggestions are welcome! If you'd like to contribute:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-improvement`)
3. Commit your changes (`git commit -m 'Add some amazing improvement'`)
4. Push to the branch (`git push origin feature/amazing-improvement`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
