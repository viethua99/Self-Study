package com.vproject.study.algorithms.searches;

import com.vproject.study.utils.SearchAlgorithm;

public class IterativeBinarySearch implements SearchAlgorithm {

    @Override
    public int search(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            final int median = (left + right) >>> 1;

            if (key == array[median]) {
                return median;
            } else if (key < array[median]) {
                right = median - 1;
            } else {
                left = median + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        final IterativeBinarySearch iterativeBinarySearch = new IterativeBinarySearch();
        int[] initialNumbers = {2, 4, 6, 8, 10, 10, 14};
        int targetValue = 8;
        int firstIndexForBinarySearch = iterativeBinarySearch.search(initialNumbers, targetValue);
        System.out.println("Binary Search: index = " + firstIndexForBinarySearch);
    }
}
