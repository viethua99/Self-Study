package com.vproject.study.util;

public class StudyUtil {
    public static void printArray(int[] array) {
        StringBuilder indices = new StringBuilder("Array Index: ");
        StringBuilder values = new StringBuilder("Array Value: ");

        for (int index = 0; index < array.length; index++) {
            indices.append(String.format("%-3d", index));
            values.append(String.format("%-3d", array[index]));
        }

        System.out.println(indices.toString().trim());
        System.out.println(values.toString().trim());
    }
}
