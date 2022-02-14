package com.company.beecrowd;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int distance = scan.nextInt();
        System.out.println(String.format("%d minutos", distance * 2));
    }
}
