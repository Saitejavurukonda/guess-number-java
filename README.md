# Guess the Number Game (Java)

## Project Overview

This project is a simple **console-based Java game** where the computer generates a random number between **1 and 100**, and the player tries to guess the number. The program gives hints such as **Hot** or **Cold** depending on how close the guess is to the actual number.

This project is useful for beginners to understand core **Java programming concepts** like loops, conditional statements, user input, and random number generation.

---

## Game Rules

* The computer generates a random number between **1 and 100**
* The player enters a number as a guess
* If the guess is **exactly equal** to the generated number → the player wins
* If the guess is within **±10 range** of the number → output **Hot**
* If the guess is **more than 10 away** from the number → output **Cold**
* The player has **unlimited attempts** until the correct number is guessed

---

## Technologies Used

* Java
* Scanner Class (User Input)
* Random Class (Random Number Generation)
* Conditional Statements (`if`, `else if`, `else`)
* While Loop
* Math.abs() Method

---

## Project Structure

Guess-Number-Java
│
├── GuessGame.java
└── README.md

---

## How to Run the Project

### Step 1: Compile the Program

```
javac GuessGame.java
```

### Step 2: Run the Program

```
java GuessGame
```

---

## Example Output

```
Enter your guess: 20
Cold

Enter your guess: 45
Hot

Enter your guess: 50
Correct! You guessed the number.
```

---

## Learning Outcomes

By completing this project, you will learn:

* Java program structure
* Taking input from users using Scanner
* Random number generation
* Using loops for repeated execution
* Applying conditional logic
* Building a simple console game

---

## Author

Saiteja Vurukonda
B.Tech CSE -IoT Student

GitHub: https://github.com/Saitejavurukonda
