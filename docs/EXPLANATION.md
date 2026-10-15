# Project Explanation

## Objective

The objective of this project is to build a simple interactive calculator in Java that performs addition, subtraction, multiplication, and division on two user-provided numbers.

## How It Works

1. The program displays a welcome message.
2. It asks the user to enter two numbers.
3. It asks the user to choose an arithmetic operator.
4. It validates the operator and checks whether division by zero is being attempted.
5. It performs the selected calculation and prints the result.
6. It asks whether the user wants to perform another calculation.
7. It exits when the user answers no.

## Java Concepts Used

- `Scanner` for console input
- `while` loop for repeated calculations and input validation
- `switch` statement for arithmetic operations
- Methods to separate number input, calculation, and result formatting
- Conditional statements for error handling

## Supported Operations

| Operator | Operation |
| --- | --- |
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |

## Validation

The program rejects non-numeric input and unsupported operators. It also prevents division by zero and displays a clear message when an invalid operation is entered.
