package com.company.codewars;

import com.sun.management.GarbageCollectionNotificationInfo;

import java.util.Arrays;

public class Kata_CalculateAverage {
    public static void main(String[] args) {
        System.out.println(find_average(new int[]{1, 1, 1}));
//        System.out.println(find_averageWithStream(new int[]{1, 1, 1}));
    }

    public static double find_average(int[] array) {
        final long startTime = System.currentTimeMillis();
        double sum = 0.0;
        for (int num :
                array) {
            sum += num;
        }
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));

        return sum / array.length;
    }

    public static double find_averageWithStream(int[] array) {
        final long startTime = System.currentTimeMillis();

        double v = Arrays.stream(array).average().orElse(0);
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
        return v;
    }
}
