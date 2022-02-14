package com.company.beecrowd;

import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        double mayorAB = (a + b + Math.abs(a - b)) / 2.0;
        double mayorABC = (mayorAB + c + Math.abs(mayorAB - c)) / 2.0;
        System.out.println(String.format("%.0f eh o maior", mayorABC));
    }
}
