# 🚀 Object-Oriented Programming (OOP) Exercises - Session 1

![Language](https://img.shields.io/badge/Language-Java%20%7C%20C%2B%2B%20%7C%20Python-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![University](https://img.shields.io/badge/University-HCMUT-red?style=for-the-badge)

This repository hosts the solutions for **CO2039 - Advanced Programming** in-class exercises. The project demonstrates core OOP principles implemented across three languages: **Java, C++, and Python**, allowing for a comparative study of syntax and logic.

##  👨‍💻 Author
<a href="https://github.com/daonguyenhp">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=700&size=30&duration=3000&pause=1000&color=BD5EF2&center=false&vCenter=true&width=600&lines=NGUYEN+DANG+GIA+DAO;DAO+NGUYEN;KEM+DA" alt="Typing SVG" />
</a>

* 🏫 **School:** Ho Chi Minh City University of Technology (HCMUT)
* 🌱 **Focus:** Computer Science, Computer Vision (ViT), Large Language Models (LLMs).
* 📫 **Contact:** [dao.nguyenhp2311@hcmut.edu.vn](mailto:dao.nguyenhp2311@hcmut.edu.vn)

## 📂 Project Structure

| Exercise | Class Name | Key Concepts |
| :--- | :--- | :--- |
| **Exercise 1** | `Car` | Basic Encapsulation, Constructors, Getters/Setters |
| **Exercise 2** | `Laptop` | **Constructor Chaining**, Code Reusability, Overloading |
| **Exercise 3** | `Library System` | Object Composition, Array/List Management, Business Logic |

---

## 📝 Detailed Description

### 1. 🚗 Exercise 1: Car Class (Encapsulation)
A fundamental class designed to demonstrate data hiding and object initialization.
- **Attributes:**
  - `brand` (String): The manufacturer of the car.
  - `model` (String): The specific model name.
  - `year` (int): Manufacturing year.
- **Key Features:**
  - **Encapsulation:** All attributes are `private` and accessed via public Getters/Setters.
  - **Constructors:** Includes both a Default Constructor (with placeholder values) and a Parameterized Constructor.

### 2. 💻 Exercise 2: Laptop Class (Constructor Chaining)
Focuses on optimizing object creation by reusing constructor logic (DRY Principle - Don't Repeat Yourself).
- **Attributes:**
  - `brand` (String), `model` (String), `price` (double).
- **Implementation Strategy:**
  - **Java:** Uses `this(...)` to call the main constructor from the default one.
  - **C++:** Uses **Delegating Constructors** in the initialization list.
  - **Python:** Uses **Default Arguments** in `__init__` to handle both cases efficiently.

### 3. 📚 Exercise 3: Library Management System (Bonus)
A mini-system simulating real-world library operations, combining multiple objects and business logic.
- **Classes:**
  - `Book`: Represents a book with `title`, `author`, `ISBN`, `price`, and `stock`. Includes logic to reduce stock when borrowed.
  - `Library`: Manages a collection of books using dynamic arrays (`ArrayList` in Java, `vector` in C++, `list` in Python).
- **Operations:**
  - **Add Books:** Add new book objects to the system.
  - **Search:** Case-insensitive search by Title or Author.
  - **Borrow:** Checks availability (`stock > 0`) and updates inventory automatically.

---

## 🛠️ How to Run

### ☕ Java
```bash
# Compile
javac InClassExercise1/Car.java

# Run
java InClassExercise1.Car
```

### 🚀 C++
```bash
# Compile
g++ main.cpp -o main

# Run
./main
```

### 🐍 Python
```bash
python main.py
```
