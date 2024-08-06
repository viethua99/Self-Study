package com.vproject.study.algorithms.two_pointers;

import java.util.*;

import static com.vproject.study.utils.StudyUtil.printArray;

public class TwoPointersExecutor {
    public static void execute() {
        System.out.println("=========== INITIALIZE ============");
        int[] sortedArray =  {4, 1, 2, -1, 1, -3};
        int target = 1;
        printArray(sortedArray);
        System.out.println("===================================\n");

        executeTwoSum(sortedArray, target);
        executeThreeSum(sortedArray, target);
        executeFourSum(sortedArray, target);
    }

    // region Two Sum
    private static void executeTwoSum(int[] array, int target) {
        TwoPointersAlgorithm twoPointersAlgorithm = new TwoPointersAlgorithm();
        System.out.println("======= Pair Two Sum Zone =======");
        boolean isContainTwoSum = twoPointersAlgorithm.twoSumPointerApproach(array, target);
        System.out.println("Result: " + isContainTwoSum);
        System.out.println("===================================\n\n");


    }
    // endregion

    // region Three Sum
    private static void executeThreeSum(int[] array, int target) {
        TwoPointersAlgorithm twoPointersAlgorithm = new TwoPointersAlgorithm();
        System.out.println("======= Pair Three Sum Zone =======");
        List<List<Integer>> triplets = twoPointersAlgorithm.threeSumPointerApproach(array, target);
        System.out.println("Result: " + triplets);
        System.out.println("===================================\n\n");


    }
    // endregion

    // region Four Sum
    private static void executeFourSum(int[] array, int target) {
        TwoPointersAlgorithm twoPointersAlgorithm = new TwoPointersAlgorithm();
        System.out.println("======= Pair Four Sum Zone =======");
        List<List<Integer>> quadruplets = twoPointersAlgorithm.fourSumPointerApproach(array, target);
        System.out.println("Result: " + quadruplets);
        System.out.println("===================================\n\n");
    }
    // endregion
}
