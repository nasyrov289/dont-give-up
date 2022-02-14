package com.company.beecrowd;
/*
Прочитать два целочисленных значения. После этого,
вычислить произведение между ними и сохранить результат в переменной с именем PROD.
Распечатайте результат, как в примере ниже.
Не забудьте напечатать конец строки после результата,
в противном случае вы получите сообщение «Ошибка представления».
*/

import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(String.format("PROD = %d", a * b));
    }
}
