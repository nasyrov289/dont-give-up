package com.company.beecrowd;

/*
Считайте два целых значения, в данном случае переменные A и B.
После этого вычислите сумму между ними и присвойте ее переменной SOMA. Запишите значение этой переменной.
*/


import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(String.format("SOMA = %d", a + b));
    }
}
