package com.vproject.study.algorithms.bitmanipulation;

public class IsPowerTwo {
    public static boolean isPowerTwo(final int number) {
        if (number <= 0) { return false; }
        return (number & (number  - 1)) == 0;
    }

    public static void main(String[] args) {

    }
}
