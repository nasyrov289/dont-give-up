package com.company.beecrowd;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble();
        double PI = 3.14159;
        double triangle = 0.5 * (a * c);
        double circle = Math.pow(c, 2) * PI;
        double trapezoid = 0.5 * (a + b) * c;
        double square = Math.pow(b, 2);
        double rectangle = a * b;

        System.out.println(String.format("TRIANGULO: %.3f\n" +
                "CIRCULO: %.3f\n" +
                "TRAPEZIO: %.3f\n" +
                "QUADRADO: %.3f\n" +
                "RETANGULO: %.3f", triangle, circle, trapezoid, square, rectangle));
    }
}
