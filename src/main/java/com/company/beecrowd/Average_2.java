package com.company.beecrowd;

import java.util.Scanner;

public class Average_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double avgGrade = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5);

        System.out.println(String.format("MEDIA = %.1f", avgGrade));
    }
}
