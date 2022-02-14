package com.company.codewars;

public class Kata_BasicMathematicalOperations {
    public static void main(String[] args) {
        System.out.println(basicMath("34", 3, 4));
    }

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/": {
                if (v2 == 0)
                    throw new IllegalArgumentException("Division by zero");
                return v1 / v2;
            }
            default:
                throw new IllegalArgumentException("Unknown operation: " + op);
        }
    }
}
