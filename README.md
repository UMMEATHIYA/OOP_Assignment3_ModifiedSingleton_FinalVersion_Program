# Assignment3 Project

This project implements the Singleton design pattern with a maximum of three instances for the `Assignment3` class. It includes both lazy and eager Singleton implementations.

## Table of Contents

- [Lazy Singleton Implementation](#lazy-singleton-implementation)
- [Eager Singleton Implementation](#eager-singleton-implementation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Output for modified singleton class is as follows: -

![image](https://github.com/UMMEATHIYA/OOP_Assignment3_Lazy-Eager_Singleton-Concept/assets/43459908/3caa8d81-e399-4937-b1bc-88616cb98cf9)

## Lazy Singleton Implementation

The `LazySingletonAssignment3` class implements the Singleton design pattern with lazy initialization. It allows a maximum of three instances to be created.

## Eager Singleton Implementation

The `EagerSingletonAssignment3` class implements the Singleton design pattern with eager initialization. It also allows a maximum of three instances to be created.

## Usage

To use the Singleton implementations, you can follow these steps:

1. Include the respective class file in your project.
2. Call the `getInstance()` method to obtain an instance of the class.

Example usage:

```java
// Lazy Singleton
LazySingletonAssignment3 instance1 = LazySingletonAssignment3.getInstance();
LazySingletonAssignment3 instance2 = LazySingletonAssignment3.getInstance();
LazySingletonAssignment3 instance3 = LazySingletonAssignment3.getInstance();
LazySingletonAssignment3 instance4 = LazySingletonAssignment3.getInstance(); // Maximum instances reached, will return null

// Eager Singleton
EagerSingletonAssignment3 instance1 = EagerSingletonAssignment3.getInstance();
EagerSingletonAssignment3 instance2 = EagerSingletonAssignment3.getInstance();
EagerSingletonAssignment3 instance3 = EagerSingletonAssignment3.getInstance();
EagerSingletonAssignment3 instance4 = EagerSingletonAssignment3.getInstance(); // Maximum instances reached, will return null




