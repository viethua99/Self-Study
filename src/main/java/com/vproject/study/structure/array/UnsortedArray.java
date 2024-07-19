package com.vproject.study.structure.array;

import com.vproject.study.util.StudyUtil;

public class UnsortedArray {
    public static void execute() {
        int[] array = new int[30]; // Fixed size
        array[0] = 10; // O(1)
        array[1] = 11; // O(1)
        array[2] = 9;  // O(1)
        array[3] = 15; // O(1)
        array[4] = 2;  // O(1)
        array[5] = 1;  // O(1)
        array[6] = 3;  // O(1)
        array[7] = 6;  // O(1)
        StudyUtil.printArray(array);
        delete(array, 3);
        StudyUtil.printArray(array);
    }

    private static void insertToTheEnd() {
        int[] array = new int[30]; // Fixed size
        array[0] = 10; // O(1)
        array[1] = 11; // O(1)
        array[2] = 9;  // O(1)
        array[3] = 15; // O(1)
        array[4] = 2;  // O(1)
        array[5] = 1;  // O(1)
        array[6] = 3;  // O(1)
        array[7] = 6;  // O(1)
        StudyUtil.printArray(array);

        // Insert to the end of the array
        array[8] = 24;  // O(1)
        StudyUtil.printArray(array);
    }

    private static void insert() {
        int[] array = new int[30]; // Fixed size
        array[0] = 10; // O(1)
        array[1] = 11; // O(1)
        array[2] = 9;  // O(1)
        array[3] = 15; // O(1)
        array[4] = 2;  // O(1)
        array[5] = 1;  // O(1)
        array[6] = 3;  // O(1)
        array[7] = 6;  // O(1)
        StudyUtil.printArray(array);

        int position = 4;
        int targetValue = 20;
        // Step 1: Shift the element to the right side
        for (int arrayIndex = 9 - 1; arrayIndex >= position; arrayIndex--) { // O(n)
            array[arrayIndex + 1] = array[arrayIndex];
        }

        // Step 2: Insert the element to the desired position
        array[position] = targetValue;
        StudyUtil.printArray(array);
    }

    private static int search(int[] array, int target) {
        // We can use linear search to find desired value O(n)
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            if (target == array[arrayIndex]) {
                return arrayIndex;
            }
        }
        return -1;
    }

    private static void delete(int[] array, int target) {
        // We can use linear search to find the position, then we shift the array to the left side
        int position = -1;
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            if (target == array[arrayIndex]) {
                position = arrayIndex;
            }
        }

        if (position == -1) {
            // Not found;
            return;
        }

        // Shift array to the left side
        for (int arrayIndex = position; arrayIndex < array.length - 1; arrayIndex++) {
            array[arrayIndex] = array[arrayIndex + 1];
        }
    }
}
