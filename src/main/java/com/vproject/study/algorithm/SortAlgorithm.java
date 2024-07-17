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
        int keyValue;
        int j;
        for (int arrayIndex = 1; arrayIndex < array.length; arrayIndex++) {
            keyValue = array[arrayIndex];
            j = arrayIndex - 1;
            while (j >= 0 && array[j] > keyValue) {
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = keyValue;
        }
    }
    // endregion

    // region Bubble Sort
    public void bubbleSort(int[] array) {
        for (int outerIndex = 0; outerIndex < array.length - 1; outerIndex++) {
            for (int innerIndex = 0; innerIndex < array.length - outerIndex - 1; innerIndex++) {
                if (array[innerIndex] > array[innerIndex + 1]) {
                    int temp = array[innerIndex];
                    array[innerIndex] = array[innerIndex+1];
                    array[innerIndex + 1] = temp;
                }
            }
        }
    }
    // endregion
}

