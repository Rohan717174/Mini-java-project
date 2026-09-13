# 🔐 CipherForge — Personalized Java Password Generator

A lightweight, clean, and customizable Command Line Interface (CLI) application built in **Java**. 

Unlike standard password generators that produce completely random strings, **CipherForge** allows users to blend personal identifiers (such as a name and favorite color) with dynamically generated random character padding on both sides to create secure yet memorable passwords.

---

## ✨ Features

- **Personalized Password Structure:** Combines user inputs (Name + Favorite Color) with randomized padding.
- **Dual-Sided Random Padding:** Dynamically splits the requested random character count between the front and back of the password string.
- **Input Sanitization:** Automatically strips out spaces using regex (`\s+`) to prevent invalid password formatting.
- **Efficient Memory Usage:** Utilizes Java's `StringBuilder` class for efficient string manipulation inside loops.
- **Modular Code Design:** Built using clean Object-Oriented Programming (OOP) practices with separate driver (`main`) and business logic methods.

---

## 🛠️ Tech Stack & Concepts Used

- **Language:** Java (JDK 8+)
- **Core Concepts:** 
  - `java.util.Scanner` for interactive CLI input
  - `java.util.Random` for pseudo-random character selection
  - `StringBuilder` for mutable string concatenation
  - Method modularity & regex sanitization

---

## ⚙️ How It Works

1. The program accepts user input for **Name**, **Favorite Color**, and total **Random Character Count**.
2. Inputs are sanitized to remove whitespace.
3. The random length is split using `Math.ceil()` and `Math.floor()`:
   $$\text{Front Length} = \lceil \text{Random Length} / 2 \rceil$$
   $$\text{Back Length} = \lfloor \text{Random Length} / 2 \rfloor$$
4. Two random character sequences are generated from a pool of uppercase letters, lowercase letters, numbers, and special symbols (`!@#$%^&*`).
5. The final password pattern is constructed:
   ```text
   [ Front Random ] + [ Name ] + [ Favorite Color ] + [ Back Random ]
