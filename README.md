# Computer Application

This Java application demonstrates an object-oriented model of different types of computers, specifically **laptops** and **desktop computers**. The project uses inheritance to share common properties (e.g., processor and RAM) across all computer types while allowing each subclass to define unique attributes.

## Table of Contents

- [Overview](#overview)
- [Purpose](#purpose)
- [Features](#features)
- [Class Structure](#class-structure)
- [Example Code](#example-code)

---

## Overview

This application models basic specifications of computers, including general attributes like **processor** and **RAM** (inherited by all computer types) and specific attributes unique to each type. For example, **laptops** have a weight attribute, while **desktops** have a case type attribute. This design showcases the use of inheritance and encapsulation in object-oriented programming.

## Purpose

This project serves as a **learning exercise** in:
- Object-oriented design principles, particularly **inheritance** and **encapsulation**.
- Using **getters** and **setters** to manage attributes.
- Demonstrating the flexibility of polymorphism by creating instances of subclasses with specific attributes.

## Features

- **Inheritance and Reusability**: Uses a base `Ordenador` class for common computer properties, which is extended by specific types (e.g., `Portatil`, `Sobremesa`).
- **Encapsulated Attributes**: Each computer attribute is private and accessed through getter and setter methods.
- **Polymorphic Design**: Allows for creation of different types of computers with specific characteristics.

## Class Structure

- **`Ordenador`**: Base class representing a generic computer with attributes for processor type and RAM size.
- **`Portatil`**: Represents a laptop with an additional attribute for weight.
- **`Sobremesa`**: Represents a desktop computer with an additional attribute for case type.
- **`Main`**: Demonstrates creating instances of `Portatil` and `Sobremesa`, setting various attributes, and displaying the results.

### Example Code

The following code creates and configures instances of `Portatil` and `Sobremesa`:

```java
import recursos.*;

public class Main {
    public static void main(String[] args) {
        Portatil portatil = new Portatil();
        portatil.setProcesador("Intel i5");
        portatil.setRAM(8);
        portatil.setPeso(2.5);

        Sobremesa sobremesa = new Sobremesa();
        sobremesa.setProcesador("AMD Ryzen 7");
        sobremesa.setRAM(16);
        sobremesa.setCaja("Mid-Tower");

        // Example output (not implemented in the example):
        System.out.println("Laptop Processor: " + portatil.getProcesador() + ", RAM: " + portatil.getRAM() + "GB, Weight: " + portatil.getPeso() + "kg");
        System.out.println("Desktop Processor: " + sobremesa.getProcesador() + ", RAM: " + sobremesa.getRAM() + "GB, Case: " + sobremesa.getCaja());
    }
}
