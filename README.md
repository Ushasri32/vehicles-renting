# Vehicle Management System

This Java program demonstrates key Object-Oriented Programming (OOP) principles like **Inheritance**, **Encapsulation**, **Polymorphism (Overloading and Overriding)**, and **Multithreading**. The program simulates a basic vehicle management system where users can interact with vehicles such as bikes and cars, manage vehicle rentals, and perform various actions in a multithreaded environment.

## Features and Demonstrations

### 1. **Inheritance**
- Demonstrates the concept of inheritance where the `Bike` and `Car` classes inherit from a common base class `VehicleBase`.
- Each subclass (`Bike` and `Car`) has its own specific method, while also inheriting the `vehi()` method from the base class.

### 2. **Encapsulation**
- The `VehicleDetails` class encapsulates the details of a vehicle (e.g., name, type, rental amount).
- Getter and setter methods are used to provide controlled access to these private fields, ensuring that the details of a vehicle are accessed and modified safely.

### 3. **Polymorphism**
#### 3.1 **Method Overloading**
- The `VehicleRentals` class demonstrates method overloading by defining multiple `rent()` methods with different parameters.
- This showcases how a method name can be reused, but with different parameter types or numbers, allowing for different behaviors.

#### 3.2 **Method Overriding**
- The `VehicleRentalBase` class defines a method `tworents()` which is overridden in the `Example` class.
- This demonstrates runtime polymorphism, where a subclass method can provide a different implementation than its superclass method.

### 4. **Multithreading**
- The `VehicleActionsThread` class extends `Thread` and demonstrates how threads can be used for performing different vehicle rental actions in parallel.
- It simulates the rental process for different vehicle types (Car and Bike), with actions being performed asynchronously.

### 5. **Exception Handling**
- The program demonstrates **exception handling** using `try-catch` blocks. It includes handling for `ArrayIndexOutOfBoundsException` and `ArithmeticException` to catch runtime errors and provide meaningful error messages.

## Code Structure

### Classes:
- `VehicleBase`: A base class for vehicles, demonstrating inheritance.
- `Bike` and `Car`: Subclasses of `VehicleBase` to represent specific vehicle types.
- `VehicleDetails`: Demonstrates encapsulation with private fields and public getters and setters.
- `VehicleRentals`: Demonstrates method overloading with different rent methods.
- `VehicleRentalBase`: Base class for rental methods, showcasing method overriding.
- `Example`: A subclass of `VehicleRentalBase` that overrides the `tworents()` method.
- `VehicleActionsThread`: Demonstrates multithreading by performing vehicle actions asynchronously.
- `Vehicle`: The main class that demonstrates the functionality of all the above classes.

## Usage Instructions

1. **Clone the Repository**
   To use this code locally, clone this repository to your machine:

   ```bash
   git clone https://github.com/yourusername/vehicle-management-system.git
   ```

2. **Compile and Run the Code**
   - Open the `Vehicle.java` file in your preferred IDE or text editor.
   - Compile and run the `Vehicle.java` file to see the demonstrations of inheritance, encapsulation, polymorphism, and multithreading in action.

3. **Expected Output**
   Upon running the program, you should see outputs similar to the following:
   - Messages from the `Bike` and `Car` classes demonstrating inheritance.
   - Vehicle details such as name, type, and rental amount, accessed using getter methods.
   - Overloaded and overridden methods for vehicle rental actions.
   - Threads running concurrently, showing multithreading behavior.
   - Exceptions caught and handled gracefully.

## Example Output:

```text
vehicle
It is a bike
vehicle
It is a car
Ravi
Car
1000
Renting a two-wheeler vehicle
Renting a two-wheeler and a four-wheeler vehicle
Renting a four-wheeler vehicle
Two-wheeler rent
Three-wheeler rent
Two-wheeler (overridden)
Starting threads...
Performing actions for: Car
Renting Car...
Performing actions for: Bike
Renting Bike...
Exception caught: Index 3 out of bounds for length 3
Exception caught: / by zero
```

