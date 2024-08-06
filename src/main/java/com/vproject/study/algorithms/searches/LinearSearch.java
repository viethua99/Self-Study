package com.vproject.study.algorithms.searches;

import com.vproject.study.utils.SearchAlgorithm;

public class LinearSearch implements SearchAlgorithm {

    @Override
    public int search(int[] array, int key) {
        for (int index = 0; index < array.length; index++) {
            if (key == array[index]) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] initialNumbers = {2, 4, 6, 8, 10, 10, 14};
        int targetValue = 8;

        LinearSearch linearSearch = new LinearSearch();
        final int index = linearSearch.search(initialNumbers, targetValue);

        System.out.println("Binary Search: index = " + index);

    }
}
