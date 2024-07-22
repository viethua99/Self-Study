package com.vproject.study.leetcode.easy;

public class EasySolutions {
    /**
     * ID: 88
     * Title: Merge Sorted Array
     * Difficulty: Easy
     * Link: <a href="https://leetcode.com/problems/merge-sorted-array/description/">...</a>
     */
    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int[] firstArray = new int[m];

        for (int firstIndex = 0; firstIndex < firstArray.length; firstIndex++) {
            firstArray[firstIndex] = nums1[firstIndex];
        }
        int firstPointer = 0;
        int secondPointer = 0;
        int mergedPointer = 0;

        while (firstPointer < firstArray.length && secondPointer < n) {
            if (firstArray[firstPointer] < nums2[secondPointer]) {
                nums1[mergedPointer] = firstArray[firstPointer];
                firstPointer++;
            } else {
                nums1[mergedPointer] = nums2[secondPointer];
                secondPointer++;
            }
            mergedPointer++;
        }

        while (firstPointer < firstArray.length) {
            nums1[mergedPointer] = firstArray[firstPointer];
            firstPointer++;
            mergedPointer++;
        }
        while (secondPointer < n) {
            nums1[mergedPointer] = nums2[secondPointer];
            secondPointer++;
            mergedPointer++;
        }
    }
}
