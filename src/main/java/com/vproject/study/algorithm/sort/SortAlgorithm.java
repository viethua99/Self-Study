package com.vproject.study.algorithm.sort;

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
        int backwardRunningPoint;
        for (int arrayIndex = 1; arrayIndex < array.length; arrayIndex++) {
            keyValue = array[arrayIndex]; // Cache the checking value
            backwardRunningPoint = arrayIndex - 1; // The running point always starts at previous point

            // If the running value is larger than the checking value, then we shift the array to the right side
            while (backwardRunningPoint >= 0 && array[backwardRunningPoint] > keyValue) {
                array[backwardRunningPoint + 1] = array[backwardRunningPoint]; // Shift the value to the right
                backwardRunningPoint--;
            }
            array[backwardRunningPoint + 1] = keyValue; // At this point, the running point is at previous empty position
        }
    }
    // endregion

    // region Bubble Sort
    public void bubbleSort(int[] array) {
        for (int outerIndex = 0; outerIndex < array.length; outerIndex++) {
            for (int innerIndex = 0; innerIndex < array.length - outerIndex - 1; innerIndex++) {
                if (array[innerIndex] > array[innerIndex + 1]) {
                    int temp = array[innerIndex];
                    array[innerIndex] = array[innerIndex + 1];
                    array[innerIndex + 1] = temp;
                }
            }
        }
    }
    // endregion
}
