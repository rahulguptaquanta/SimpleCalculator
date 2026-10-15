# Simple Calculator Program

A beginner-friendly Java console application that performs basic arithmetic operations on two numbers.

## Features

- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`*`)
- Division (`/`)
- Validates numeric input
- Rejects unsupported operators
- Prevents division by zero
- Allows repeated calculations until the user exits
- Displays whole-number results without unnecessary decimal places

## Requirements

- Java JDK 8 or later
- A terminal or Java IDE such as VS Code, IntelliJ IDEA, or Eclipse

## Project Structure

```text
SimpleCalculator/
├── docs/
│   └── EXPLANATION.md
├── src/
│   └── com/
│       └── internship/
│           └── calculator/
│               └── SimpleCalculator.java
├── .gitignore
└── README.md
```

## Run the Program

Open a terminal in the project folder and compile the Java file:

```bash
javac -d out src/com/internship/calculator/SimpleCalculator.java
```

Run the program:

```bash
java -cp out com.internship.calculator.SimpleCalculator
```

## Example

```text
================================
      SIMPLE CALCULATOR
================================
Enter the first number: 20
Enter the second number: 5
Choose an operator (+, -, *, /): /
Result: 20 / 5 = 4
Do you want to calculate again? (yes/no): no

Thank you for using Simple Calculator!
```

## Error Handling

- If a number is entered incorrectly, the program asks for a valid number.
- If an unsupported operator is entered, an error message is shown.
- If division by zero is attempted, the program displays an error instead of calculating the result.
