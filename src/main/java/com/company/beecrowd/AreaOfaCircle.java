package com.company.beecrowd;

import java.util.Scanner;

public class AreaOfaCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();

        final double PI = 3.14159;
        System.out.println(String.format("A=%.4f", PI * Math.pow(radius, 2)));
    }
}
