package com.vproject.study.algorithms.bitmanipulation;

public class SumWithoutArithmeticOperators {
    // 6    0110
    // 7    0111
    // 13   1101


    // 6^7  0001
    // 6&7  0110

    // 1100
    // 0001
    public static int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }

        int sum = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sum, carry);
    }

    public static void main(String[] args) {
        int sum = getSum(6, 7);
        System.out.println(sum);
    }
}
