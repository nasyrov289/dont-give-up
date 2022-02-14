package com.company.beecrowd;

import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int money = scan.nextInt();

        System.out.println(money);
        System.out.printf("%d nota(s) de R$ 100,00%n", money / 100);
        int aux = money % 100;
        System.out.printf("%d nota(s) de R$ 50,00%n", aux / 50);
        aux %= 50;
        System.out.printf("%d nota(s) de R$ 20,00%n", aux / 20);
        aux %= 20;
        System.out.printf("%d nota(s) de R$ 10,00%n", aux / 10);
        aux %= 10;
        System.out.printf("%d nota(s) de R$ 5,00%n", aux / 5);
        aux %= 5;
        System.out.printf("%d nota(s) de R$ 2,00%n", aux / 2);
        aux %= 2;
        System.out.printf("%d nota(s) de R$ 1,00%n", aux);
    }
}
