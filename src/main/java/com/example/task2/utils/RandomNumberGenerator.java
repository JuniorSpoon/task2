package com.example.task2.utils;

import java.util.Random;

public class RandomNumberGenerator {

    public static int getRandomNumber(int lowInclusive, int HighExclusive) {
        Random r = new Random();
        return r.nextInt(HighExclusive - lowInclusive) + lowInclusive;
    }
}
