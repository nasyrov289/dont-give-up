package com.company.codewars;

import java.util.Base64;

public class Ascii {
//    public static char getChar(int c) {
//    }

    public static void main(String[] args) {
        String originalString = "1313";
        String encodeToString = Base64.getEncoder().encodeToString(originalString.getBytes());
        byte[] decodedBytes = Base64.getDecoder().decode(encodeToString);
        String decodedString = new String(decodedBytes);
        System.out.println(encodeToString);
        System.out.println(decodedString);
    }
}
