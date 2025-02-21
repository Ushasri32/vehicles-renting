# Vehicle Rental System - Java Concepts Demonstration

This repository demonstrates various Object-Oriented Programming (OOP) concepts in Java such as Inheritance, Encapsulation, Overloading, and Overriding, using a simple Vehicle Rental System as an example.

## Table of Contents

- [Introduction](#introduction)
- [Concepts Demonstrated](#concepts-demonstrated)
  - [Inheritance](#inheritance)
  - [Encapsulation](#encapsulation)
  - [Overloading](#overloading)
  - [Overriding](#overriding)
- [Code Explanation](#code-explanation)
- [Usage](#usage)

## Introduction

The code provides an example of a simple vehicle rental system where different types of vehicles (Bike, Car) are managed. It showcases OOP principles such as inheritance (base and child classes), encapsulation (getters and setters for private data), method overloading (same method with different parameters), and method overriding (modifying inherited behavior).

## Concepts Demonstrated

### Inheritance

The `VehicleBase` class is the parent class, and `Bike` and `Car` are subclasses that inherit the behavior of the parent class. The base class method `vehi()` is inherited by both subclasses. The `Bike` and `Car` classes also have their own specific methods.

### Encapsulation

The `VehicleDetails` class demonstrates encapsulation by hiding the internal data (`name`, `vehicle_r`, `amt`) with private access modifiers. Public getter and setter methods are used to access and modify the values of these variables.

### Overloading

The `VehicleRentals` class demonstrates method overloading, where the same method `rent()` is defined multiple times with different parameter types (integer and double). This allows the method to be called in different ways depending on the arguments passed.

### Overriding

The `VehicleRentalBase` class defines the base behavior for renting vehicles (`tworents()` and `threerents()` methods). The `Example` class overrides the `tworents()` method to provide custom behavior for renting two-wheelers.

## Code Explanation

The code consists of the following components:

1. **Inheritance**: 
   - The `Bike` and `Car` classes extend `VehicleBase`, inheriting its `vehi()` method.
   - The `Bike` class has a specific method `bi()`, and the `Car` class has a specific method `ca()`.

2. **Encapsulation**:
   - `VehicleDetails` stores vehicle information (`name`, `vehicle_r`, and `amt`) and uses setters and getters to modify and access these values.

3. **Overloading**:
   - The `VehicleRentals` class defines three overloaded `rent()` methods to handle different rental types:
     - Renting a two-wheeler.
     - Renting a two-wheeler and a four-wheeler.
     - Renting a four-wheeler.

4. **Overriding**:
   - The `Example` class overrides the `tworents()` method of the `VehicleRentalBase` class to modify its functionality.

## Usage

1. Clone this repository to your local machine.
2. Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
3. Run the `Vehicle` class to see the demonstration of the different OOP concepts.

```bash
git clone https://github.com/yourusername/vehicle-rental-system.git
cd vehicle-rental-system
# Open in IDE or run with Java compiler
```

### Expected Output:

```plaintext
It is a bike
vehicle
It is a car
vehicle
Ravi
Car
1000
Renting a two-wheeler vehicle
Renting a two-wheeler and a four-wheeler vehicle
Renting a four-wheeler vehicle
Two-wheeler rent
Three-wheeler rent
Two-wheeler (overridden)
```
