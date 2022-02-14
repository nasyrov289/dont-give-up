package com.company.beecrowd;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfEmployees = scan.nextInt();
        int workedHours = scan.nextInt();
        double perHour = scan.nextDouble();
        System.out.println(String.format("NUMBER = %d\nSALARY = U$ %.2f", numberOfEmployees, workedHours * perHour));
    }
}
