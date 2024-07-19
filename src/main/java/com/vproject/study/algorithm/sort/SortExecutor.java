package com.vproject.study.algorithm.sort;

import static com.vproject.study.util.StudyUtil.printArray;

public class SortExecutor {
    public static void execute(SortType sortType) {
        System.out.println("=========== INITIALIZE ============");
        int[] unsortedArray = {14, 14, 8, 5, 9, 1, 1, 9, 6, 7};
        printArray(unsortedArray);
        System.out.println("===================================\n");

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
            case MERGE_SORT:
                executeMergeSort(unsortedArray);
                break;
            case HEAP_SORT:
                executeHeapSort(unsortedArray);
                break;
            case QUICK_SORT:
                executeQuickSort(unsortedArray);
                break;
            case COUNTING_SORT:
                executeCountingSort(unsortedArray);
                break;
        }
    }

    // region Selection Sort
    private static void executeSelectionSort(int[] array) {
        SortAlgorithm sortAlgorithm = new SortAlgorithm();
        System.out.println("======= Selection Sort Zone =======");

        System.out.println("Before:");
        printArray(array);
        sortAlgorithm.selectionSort(array);
        System.out.println("After:");
        printArray(array);

        System.out.println("===================================\n\n");
    }
    // endregion

    // region Insertion Sort
    private static void executeInsertionSort(int[] array) {
        SortAlgorithm sortAlgorithm = new SortAlgorithm();
        System.out.println("======= Insertion Sort Zone =======");

        System.out.println("Before:");
        printArray(array);
        sortAlgorithm.insertionSort(array);
        System.out.println("After:");
        printArray(array);

        System.out.println("===================================\n\n");
    }
    // endregion

    // region Bubble Sort
    private static void executeBubbleSort(int[] array) {
        SortAlgorithm sortAlgorithm = new SortAlgorithm();
        System.out.println("======= Bubble Sort Zone =======");

        System.out.println("Before:");
        printArray(array);
        sortAlgorithm.bubbleSort(array);
        System.out.println("After:");
        printArray(array);

        System.out.println("===================================\n\n");
    }
    // endregion

    // region Merge Sort
    private static void executeMergeSort(int[] array) {
        SortAlgorithm sortAlgorithm = new SortAlgorithm();
        System.out.println("========= Merge Sort Zone =========");

        System.out.println("Before:");
        printArray(array);
        sortAlgorithm.mergeSort(array);
        System.out.println("After:");
        printArray(array);

        System.out.println("===================================\n\n");
    }
    // endregion

    // region Heap Sort
    private static void executeHeapSort(int[] array) {
        // TODO: HEAP SORT
    }
    // endregion

    // region Quick Sort
    private static void executeQuickSort(int[] array) {
        // TODO: QUICK SORT
    }
    // endregion

    // region Counting Sort
    private static void executeCountingSort(int[] array) {
        // TODO: COUNTING SORT
    }
    // endregion
}
