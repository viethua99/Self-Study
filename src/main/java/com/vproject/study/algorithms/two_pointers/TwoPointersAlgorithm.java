package com.vproject.study.algorithms.two_pointers;

import java.util.*;

public class TwoPointersAlgorithm {

    public boolean twoSumNaiveApproach(int[] array, int target) {
        for (int outerIndex = 0; outerIndex < array.length - 1; outerIndex++) { // O(n^2)
            for (int innerIndex = outerIndex + 1; innerIndex < array.length; innerIndex++) {
                if (array[outerIndex] + array[innerIndex] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean twoSumPointerApproach(int[] array, int target) {
        int leadingPointer = 0;
        int trailingPointer = array.length - 1;

        Arrays.sort(array); // Two pointers approach only works if the array is sorted
        while (leadingPointer < trailingPointer) { // O(n)
            int sum = array[leadingPointer] + array[trailingPointer];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                leadingPointer++;
            } else {
                trailingPointer--;
            }
        }
        return false;
    }

    public List<List<Integer>> threeSumNaiveApproach(int[] array, int target) {
        Set<List<Integer>> resultSet = new HashSet<>(); // Use set to make sure there is no duplicate triplets in the list
        for (int outerIndex = 0; outerIndex < array.length - 2; outerIndex++) { // O(n^3)
            for (int middleIndex = outerIndex + 1; middleIndex < array.length - 1; middleIndex++) {
                for (int innerIndex = middleIndex + 1; innerIndex < array.length; innerIndex++) {
                    if (array[outerIndex] + array[middleIndex] + array[innerIndex] == target) {
                        List<Integer> triplet = Arrays.asList(array[outerIndex], array[middleIndex], array[innerIndex]);
                        triplet.sort(Integer::compareTo);
                        resultSet.add(new ArrayList<>(triplet));
                    }
                }
            }
        }
        return new ArrayList<>(resultSet);
    }

    public List<List<Integer>> threeSumPointerApproach(int[] array, int target) {
        Set<List<Integer>> resultSet = new HashSet<>();

        Arrays.sort(array); // Two pointers approach only works if the array is sorted O(nlogn)
        for (int outerIndex = 0; outerIndex < array.length; outerIndex++) { // O(n^2)
            int leadingPointer = outerIndex + 1;
            int trailingPointer = array.length - 1;

            while (leadingPointer < trailingPointer) {
                int sum = array[outerIndex] + array[leadingPointer] + array[trailingPointer];
                if (sum == target) {
                    resultSet.add(Arrays.asList(array[outerIndex], array[leadingPointer], array[trailingPointer]));
                    leadingPointer++;
                    trailingPointer--;
                } else if (sum < target) {
                    leadingPointer++;
                } else {
                    trailingPointer--;
                }
            }
        }
        return new ArrayList<>(resultSet);
    }

    public List<List<Integer>> fourSumPointerApproach(int[] array, int target) {
        Set<List<Integer>> resultSet = new HashSet<>();

        Arrays.sort(array); // Two pointers approach only works if the array is sorted O(nlogn)
        for (int outerIndex = 0; outerIndex < array.length - 2; outerIndex++) {
            for (int innerIndex = outerIndex + 1; innerIndex < array.length - 1; innerIndex++) {
                int leadingPointer = innerIndex + 1;
                int trailingPointer = array.length - 1;
                while (leadingPointer < trailingPointer) {
                    int sum = array[outerIndex] + array[innerIndex] + array[leadingPointer] + array[trailingPointer];
                    if (sum == target) {
                        resultSet.add(Arrays.asList(array[outerIndex], array[innerIndex], array[leadingPointer], array[trailingPointer]));
                        leadingPointer++;
                        trailingPointer--;
                    } else if (sum < target) {
                        leadingPointer++;
                    } else {
                        trailingPointer--;
                    }
                }
            }
        }
        return new ArrayList<>(resultSet);
    }

}
