package com.company.beecrowd;

import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String employeeName = scan.nextLine();
        double sellerSalary = scan.nextDouble();
        double totalSold = scan.nextDouble();

        System.out.println(String.format("TOTAL = R$ %.2f", sellerSalary + (totalSold * 0.15)));
    }
}
