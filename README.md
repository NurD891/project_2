# 🧮 Project Report: Console Calculator  

## 📌 1. Introduction  
This project is a simple **console-based calculator** that allows users to perform arithmetic operations and additional mathematical functions.  

The calculator supports:  
✅ Addition (`+`), Subtraction (`-`), Multiplication (`*`), Division (`/`), Modulus (`%`)  
✅ Power calculation (`power()`), Square root (`sqrt()`), Absolute value (`abs()`), Rounding (`round()`)  
✅ Calculation history to track previous operations  
✅ **Error handling** for invalid inputs and division by zero  
✅ A **user-friendly interface** with clear prompts  

---

## ⚙️ 2. Features  

| Feature               | Description |
|-----------------------|------------|
| **Basic Operations**  | `+`, `-`, `*`, `/`, `%` |
| **Power Calculation** | `2 ^ 3` → Returns `8.0` |
| **Square Root**       | `sqrt 25` → Returns `5.0` |
| **Absolute Value**    | `abs -10` → Returns `10.0` |
| **Rounding**         | `round 4.7` → Returns `5.0` |
| **Calculation History** | Users can type `history` to view past calculations |
| **Graceful Error Handling** | Handles invalid inputs & division by zero |

---

## 🔧 3. Design Choices  

- Implemented using **Java** with the `Scanner` class for user input handling.  
- Used **`Math.pow()`**, **`Math.sqrt()`**, **`Math.abs()`**, and **`Math.round()`** for mathematical operations.  
- Stored calculation history using **`ArrayList<String>`** to allow users to review previous results.  

---

## ⚠️ 4. Challenges Encountered  

### ❌ **Handling Invalid Inputs**  
- The program needed to detect non-numeric inputs and unexpected symbols.  
- Implemented **error handling** using `try-catch` to prevent crashes.  

### ❌ **Parsing User Input Correctly**  
- Users enter expressions as **strings**, so we had to **split and parse** them dynamically.  

### ❌ **Handling Division by Zero**  
- If a user enters `10 / 0`, the program correctly **throws an exception** and displays an error message instead of crashing.  

---

## 🚀 5. Running the Program  

### **💻 How to Compile & Run:**  
```sh
javac Main.java
java Main
