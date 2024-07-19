package com.vproject.study.algorithm.sort;

import static com.vproject.study.util.StudyUtil.printArray;

public class SortExecutor {
    public static void execute(SortType sortType) {
        System.out.println("=========== INITIALIZE ===========");
        int[] unsortedArray = {14, 14, 8, 5, 9, 1, 1, 9, 6, 7};
        printArray(unsortedArray);
        System.out.println("==================================\n");

        switch (sortType) {
            case SELECTION_SORT:
                executeSelectionSort(unsortedArray);
                break;
            case INSERTION_SORT:
                executeInsertionSort(unsortedArray);
                break;
            case BUBBLE_SORT:
                executeBubbleSort(unsortedArray);
                break;
        }
    }

    private static void executeSelectionSort(int[] array) {
        // region Selection Sort
        SortAlgorithm sortAlgorithm = new SortAlgorithm();
        System.out.println("======= Selection Sort Zone =======");

        System.out.println("Before:");
        printArray(array);
        sortAlgorithm.selectionSort(array);
        System.out.println("After:");
        printArray(array);

        System.out.println("===================================\n\n");
        // endregion

    }

    private static void executeInsertionSort(int[] array) {
        // region Insertion Sort
        SortAlgorithm sortAlgorithm = new SortAlgorithm();
        System.out.println("======= Insertion Sort Zone =======");

        System.out.println("Before:");
        printArray(array);
        sortAlgorithm.insertionSort(array);
        System.out.println("After:");
        printArray(array);

        System.out.println("===================================\n\n");
        // endregion
    }

    private static void executeBubbleSort(int[] array) {
        // region Bubble Sort
        SortAlgorithm sortAlgorithm = new SortAlgorithm();
        System.out.println("======= Bubble Sort Zone =======");

        System.out.println("Before:");
        printArray(array);
        sortAlgorithm.bubbleSort(array);
        System.out.println("After:");
        printArray(array);

        System.out.println("===================================\n\n");
        // endregion
    }
}
