package com.vproject.study.algorithm;

public class SortAlgorithm {
    // region Selection Sort
    public void selectionSort(int[] array) {
        for (int outerIndex = 0; outerIndex < array.length - 1; outerIndex++) {
            for (int innerIndex = outerIndex + 1; innerIndex < array.length; innerIndex++) {
                if (array[outerIndex] > array[innerIndex]) {
                    int temp = array[outerIndex];
                    array[outerIndex] = array[innerIndex];
                    array[innerIndex] = temp;
                }
            }
        }
    }
    // endregion

    // region Insertion Sort
    public void insertionSort(int[] array) {

    }
    // endregion
}

