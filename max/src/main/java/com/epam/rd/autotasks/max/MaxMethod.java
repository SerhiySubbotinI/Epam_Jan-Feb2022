package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        int maximum = -2147483648;
        for (int value : values) {
            if (maximum < value) {
                maximum = value;
            }
            System.out.println(maximum);
        }
        return maximum;
    }
}