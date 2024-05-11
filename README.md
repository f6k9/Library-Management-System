# 📚 Library Cost & Inventory Calculator

A Java-based application designed to manage daily library book entries and dynamically calculate operational costs and discounts based on book classifications. This project demonstrates core Object-Oriented Programming (OOP) principles in Java.

---

## 🛠️ Key Technical Concepts Demonstrated
* **Inheritance & Polymorphism:** Utilizes a base `Book` class extended by specialized subclasses (`Children`, `Motivational`, `Biographies`) to dynamically alter behavior at runtime.
* **Method Overriding:** Dynamically applies distinct categorization discount rules (e.g., 15% off for Children's literature, 10% for Motivational books) by overriding core processing methods.
* **Object Mapping:** Simulates data collection using object arrays mapped dynamically based on user runtime evaluation (`instanceof`).

---

## ⚙️ Architecture Overview

The system processes data using a modular class structure:
* `Book.java`: The foundational superclass governing universal properties like title and purchase cost.
* `Children.java` & `Motivational.java`: Subclasses that override cost evaluation to process specific discount rates automatically.
* `Biographies.java`: A subclass inheriting standard operational attributes.
* `LibraryManagementSystem.java`: The central execution controller handling user runtime console input, data processing, and day-end cost analysis reporting.

---

## 🚀 How To Run

### Prerequisites
* Java Development Kit (JDK) 8 or higher installed.
* Any standard Java-supported IDE (NetBeans, IntelliJ IDEA, VSCode) or command-line compiler.

### Execution via Command Line
1. Clone the repository:
   ```bash
   git clone [https://github.com/f6k9/Library-Management-System.git](https://github.com/f6k9/Library-Management-System.git)
