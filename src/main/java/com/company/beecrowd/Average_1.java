package com.company.beecrowd;
/*
Считайте два значения с плавающей запятой двойной точности A и B, соответствующие двум оценкам учащихся. После этого рассчитайте среднее значение учащегося, учитывая, что оценка А имеет вес 3,5, а оценка В имеет вес 7,5. Каждая оценка может быть от нуля до десяти, всегда с одной цифрой после запятой. Не забудьте напечатать конец строки после результата, иначе вы получите «Ошибка представления». Не забывайте про пробелы до и после знака равенства.
*/

import java.util.Scanner;
import java.util.concurrent.*;

public class Average_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        double a = scan.nextDouble();
//        double b = scan.nextDouble();
        double a = 5.0;
        double b = 7.1;
        System.out.println(String.format("MEDIA = %.5f", (3.5 * a + 7.5 * b) / (3.5 + 7.5)));
    }
}
