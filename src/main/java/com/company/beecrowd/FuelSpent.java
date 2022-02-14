package com.company.beecrowd;

import java.util.Scanner;

public class FuelSpent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int spentTripTime = scan.nextInt();
        int averageSpeed = scan.nextInt();

        double spentLiterPerKm = spentTripTime / 12.0;
        System.out.println(String.format("%.3f", spentLiterPerKm * averageSpeed));
    }
}
