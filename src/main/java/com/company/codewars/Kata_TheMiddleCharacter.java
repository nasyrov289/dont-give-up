package com.company.codewars;

public class Kata_TheMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getTheMiddleCharacter("test"));
    }

    public static String getTheMiddleCharacter(String word) {
        int middleCharacter = word.length() / 2;
        if (word.length() % 2 == 0) {
            return String.format("%s%s", word.charAt(middleCharacter - 1), word.charAt(middleCharacter));
        } else {
            return String.format("%s", word.charAt(middleCharacter));
        }
    }
}
