package com.vproject.study.algorithm.sort;

import com.vproject.study.util.StudyUtil;

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

    // region Merge Sort
    public void mergeSort(int[] array) {
        if (array.length < 2) {
            // Stop dividing the array if there's only one element left.
            return;
        }

        int[] leftArray = new int[array.length / 2];
        int[] rightArray = new int[array.length - leftArray.length]; // The number of elements would be the remaining numbers

        // Fill up the left array from the origin array
        for (int leftIndex = 0; leftIndex < leftArray.length; leftIndex++) {
            leftArray[leftIndex] = array[leftIndex];
        }

        // Fill up the right array from the origin array, we need to start from the middle point
        for (int rightIndex = 0; rightIndex < rightArray.length; rightIndex++) {
            rightArray[rightIndex] = array[leftArray.length + rightIndex];
        }

        mergeSort(leftArray); // Keep dividing the left array to half
        mergeSort(rightArray); // Keep dividing the right array to half
        internalMerge(leftArray, rightArray, array); // Start merging after dividing the element to 1
    }

    private void internalMerge(int[] firstArray, int[] secondArray, int[] resultArray) {
        int firstPointer = 0;
        int secondPointer = 0;
        int mergedPointer = 0;

        // Follow finger pointing rule to fill the elements to merged array
        while (firstPointer < firstArray.length && secondPointer < secondArray.length) {
            if (firstArray[firstPointer] <= secondArray[secondPointer]) {
                resultArray[mergedPointer] = firstArray[firstPointer];
                firstPointer++;
            } else {
                resultArray[mergedPointer] = secondArray[secondPointer];
                secondPointer++;
            }
            mergedPointer++;
        }

        // All the remaining elements in first array would be filled to the merged array
        while (firstPointer < firstArray.length) {
            resultArray[mergedPointer] = firstArray[firstPointer];
            mergedPointer++;
            firstPointer++;
        }

        // All the remaining elements in second array would be filled to the merged array
        while (secondPointer < secondArray.length) {
            resultArray[mergedPointer] = secondArray[secondPointer];
            mergedPointer++;
            secondPointer++;
        }
    }
    // endregion
}

