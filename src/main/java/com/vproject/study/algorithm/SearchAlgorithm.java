package com.vproject.study.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SearchAlgorithm {
    // region Linear Search
    public int linearSearchFirstOccurrence(int[] array, int target) {
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            if (array[arrayIndex] == target) {
                return arrayIndex;
            }
        }
        return -1;
    }

    public int linearSearchLastOccurrence(int[] array, int target) {
        int targetIndex = -1;
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            if (array[arrayIndex] == target) {
                targetIndex = arrayIndex;
            }
        }
        return targetIndex;
    }

    public List<Integer> linearSearchAllOccurrences(int[] array, int target) {
        List<Integer> targetIndexList = new ArrayList();
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            if (array[arrayIndex] == target) {
                targetIndexList.add(arrayIndex);
            }
        }
        return targetIndexList;
    }
    // endregion

    // region Binary Search
    public int binarySearch(int[] array, int target) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            if (target == array[midIndex]) {
                return midIndex;
            }

            if (target < array[midIndex]) {
                rightIndex = midIndex - 1;
            }

            if (target > array[midIndex]) {
                leftIndex = midIndex + 1;
            }
        }
        return -1;
    }
    // endregion
}