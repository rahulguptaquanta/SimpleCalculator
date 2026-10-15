package com.internship.calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("================================");
        System.out.println("      SIMPLE CALCULATOR");
        System.out.println("================================");

        while (continueCalculating) {
            double firstNumber = readNumber(scanner, "Enter the first number: ");
            double secondNumber = readNumber(scanner, "Enter the second number: ");

            System.out.print("Choose an operator (+, -, *, /): ");
            String operatorInput = scanner.next().trim();

            if (operatorInput.length() != 1 || "+-*/".indexOf(operatorInput.charAt(0)) == -1) {
                System.out.println("Invalid operator. Please choose +, -, *, or /.");
            } else {
                char operator = operatorInput.charAt(0);

                if (operator == '/' && secondNumber == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    double result = calculate(firstNumber, secondNumber, operator);
                    System.out.println("Result: " + formatNumber(firstNumber) + " "
                            + operator + " " + formatNumber(secondNumber) + " = "
                            + formatNumber(result));
                }
            }

            System.out.print("Do you want to calculate again? (yes/no): ");
            String answer = scanner.next().trim();
            continueCalculating = answer.equalsIgnoreCase("yes")
                    || answer.equalsIgnoreCase("y");
            System.out.println();
        }

        System.out.println("Thank you for using Simple Calculator!");
        scanner.close();
    }

    private static double readNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }

            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
    }

    private static double calculate(double firstNumber, double secondNumber, char operator) {
        switch (operator) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            default:
                throw new IllegalArgumentException("Unsupported operator");
        }
    }

    private static String formatNumber(double number) {
        if (Double.isFinite(number) && number == Math.rint(number)
                && number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
            return Long.toString((long) number);
        }
        return Double.toString(number);
    }
}
