package com.example.task2.utils;

public class RandomStringGenerator {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(ALPHABET.charAt(RandomNumberGenerator.getRandomNumber(0, ALPHABET.length())));
        return sb.toString();
    }
}
