package com.company.beecrowd;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        double PI = 3.14159;
        double sphereVolume = (4.0/3.0)*PI*Math.pow(radius,3);
        System.out.println(String.format("VOLUME = %.3f",sphereVolume));
    }
}
