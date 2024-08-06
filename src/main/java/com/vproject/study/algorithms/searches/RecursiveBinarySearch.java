package com.vproject.study.algorithms.searches;

import com.vproject.study.utils.SearchAlgorithm;

public class RecursiveBinarySearch implements SearchAlgorithm {

    @Override
    public int search(int[] array, int key) {
        return executeSearch(array, key, 0, array.length - 1);
    }

    private int executeSearch(final int[] array, final int key, final int left, final int right) {
        if (right < left) {
            return -1;
        }

        final int median = (left + right) >>> 1;

        if (key == array[median]) {
            return median;
        } else if (key < array[median]) {
            return executeSearch(array, key, left, median - 1);
        } else {
            return executeSearch(array, key, median + 1, right);
        }
    }

    public static void main(String[] args) {
        final RecursiveBinarySearch recursiveBinarySearch = new RecursiveBinarySearch();
        int[] initialNumbers = {2, 4, 6, 8, 10, 10, 14};
        int targetValue = 8;
        int firstIndexForBinarySearch = recursiveBinarySearch.search(initialNumbers, targetValue);
        System.out.println("Binary Search: index = " + firstIndexForBinarySearch);
    }
}
