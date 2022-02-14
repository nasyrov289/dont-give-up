package com.company.beecrowd;

import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int productId1 = scan.nextInt();
        int productAmount1 = scan.nextInt();
        double productPrice1 = scan.nextDouble();
        int productId2 = scan.nextInt();
        int productAmount2 = scan.nextInt();
        double productPrice2 = scan.nextDouble();
        double totalAmount1 = productPrice1 * productAmount1;
        double totalAmount2 = productPrice2 * productAmount2;
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", totalAmount1 + totalAmount2));
    }
}
