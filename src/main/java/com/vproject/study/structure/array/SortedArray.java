package com.vproject.study.structure.array;

import com.vproject.study.util.StudyUtil;

public class SortedArray {
    public static void execute() {
        int[] array = new int[8]; // Fixed size
        array[0] = 1; // O(1)
        array[1] = 3; // O(1)
        array[2] = 5;  // O(1)
        array[3] = 6; // O(1)
        array[4] = 8;  // O(1)
        array[5] = 9;  // O(1)
        array[6] = 11;  // O(1)
        array[7] = 18;  // O(1)
        StudyUtil.printArray(array);

        delete(array, 8);
        StudyUtil.printArray(array);
    }

    private static void insert() {
        int[] array = new int[30]; // Fixed size
        array[0] = 1; // O(1)
        array[1] = 3; // O(1)
        array[2] = 5;  // O(1)
        array[3] = 6; // O(1)
        array[4] = 8;  // O(1)
        array[5] = 9;  // O(1)
        array[6] = 11;  // O(1)
        array[7] = 18;  // O(1)
        StudyUtil.printArray(array);

        int target = 8;
        int arrayIndex;
        // We just need to check if the element is larger than the target value, if yes then shift the element to the right
       for (arrayIndex = 8 - 1; arrayIndex >= 0 && array[arrayIndex] > target; arrayIndex--) { // O(n)
           array[arrayIndex + 1] = array[arrayIndex];
       }
       array[arrayIndex + 1] = target;
       StudyUtil.printArray(array);
    }

    private static int search(int[] array, int target) {
        // We can use Binary Search: O(logn)
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

    private static void delete(int[] array, int target) {
        // Step 1: Use Binary Search to find the target
        int position = search(array, target);

        if (position == -1) {
            // Not found
            return;
        }

        // Step 2: Shift the element to the left side
        int arrayIndex;
        for (arrayIndex = position; arrayIndex < 7; arrayIndex++) {
            array[arrayIndex] = array[arrayIndex + 1];
        }
        array[arrayIndex] = 0;
    }
}
