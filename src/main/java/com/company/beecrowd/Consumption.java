package com.company.beecrowd;

import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalDistance = scan.nextInt();
        double totalFuelSpent = scan.nextDouble();

        System.out.println(String.format("%.3f km/l", totalDistance / totalFuelSpent));
    }
}
