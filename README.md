# 🎯 Number Guessing Game (GUI)

A **Java Swing-based Number Guessing Game** where the player tries to guess a randomly generated number between 1 and 100 within limited attempts.

This project features a **graphical user interface (GUI)** with score tracking, attempts counter, and multiple rounds.

---

## 🖼️ Game Preview

![Game UI](https://via.placeholder.com/600x300?text=Number+Guessing+Game+GUI)

---

## 📌 Features

* 🎲 Random number generation (1–100)
* 🔢 User input via GUI
* 🔁 "New Round" functionality
* ❤️ Limited attempts (5 per round)
* 🏆 Score and wins tracking
* ⚡ Instant feedback (Too High / Too Low / Correct)
* 🖥️ Clean and simple interface

---

## 🛠 Technologies Used

* Java
* Java Swing (GUI)
* Event Handling (ActionListener)

---

## ▶️ How to Run

1. Open terminal / command prompt
2. Navigate to project folder
3. Compile the program:

   ```
   javac NumberGameGUI.java
   ```
4. Run the program:

   ```
   java NumberGameGUI
   ```

---

## 🎮 How to Play

1. Enter a number between **1 and 100**
2. Click **"Guess"**
3. Get feedback:

   * Too High 🔼
   * Too Low 🔽
   * Correct ✅
4. You have **5 attempts per round**
5. Click **"New Round"** to play again

---

## 💻 Sample Gameplay Logic

* If guess < number → "Too Low"
* If guess > number → "Too High"
* If correct → Increase score & wins

---

## 📊 Game Info Display

* Attempts left
* Score
* Wins

---

## 📁 File Structure

* `NumberGameGUI.java` → Main game file

---

## 👨‍💻 Author

-Wonkar M. Gaykwad

---

## 🚀 Project Purpose

This project was developed as part of an internship task to demonstrate:

* GUI development using Java Swing
* Event-driven programming
* Game logic implementation
* User interaction handling

---

## 🔥 Future Improvements

* Add difficulty levels (Easy/Medium/Hard)
* Add sound effects 🎵
* Add timer ⏱️
* Improve UI design

---
