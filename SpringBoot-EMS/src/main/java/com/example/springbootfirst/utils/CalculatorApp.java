package com.example.springbootfirst.utils;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose operation: add, subtract, multiply, divide, or exit");
            String op = scanner.nextLine();

            if (op.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter second number: ");
            int b = Integer.parseInt(scanner.nextLine());

            try {
                switch (op.toLowerCase()) {
                    case "add":
                        System.out.println("Result: " + calc.add(a, b));
                        break;
                    case "subtract":
                        System.out.println("Result: " + calc.subtract(a, b));
                        break;
                    case "multiply":
                        System.out.println("Result: " + calc.multiply(a, b));
                        break;
                    case "divide":
                        System.out.println("Result: " + calc.divide(a, b));
                        break;
                    default:
                        System.out.println("Unknown operation");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
