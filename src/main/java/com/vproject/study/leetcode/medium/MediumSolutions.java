package com.vproject.study.leetcode.medium;

import java.util.*;

public class MediumSolutions {
    /**
     * ID: 15
     * Title: Three Sum
     * Difficulty: Medium
     * Link: <a href="https://leetcode.com/problems/3sum/description/">...</a>
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();

        Arrays.sort(nums); // Two pointers approach only works if the array is sorted
        for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
            int leadingPointer = outerIndex + 1;
            int trailingPointer = nums.length - 1;

            while (leadingPointer < trailingPointer) {
                int sum = nums[outerIndex] + nums[leadingPointer] + nums[trailingPointer];
                if (sum == 0) {
                    resultSet.add(Arrays.asList(nums[outerIndex], nums[leadingPointer], nums[trailingPointer]));
                    leadingPointer++;
                    trailingPointer--;
                } else if (sum < 0) {
                    leadingPointer++;
                } else {
                    trailingPointer--;
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
}
