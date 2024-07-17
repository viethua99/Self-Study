package com.vproject.study;

import com.vproject.study.algorithm.SearchAlgorithm;
import com.vproject.study.algorithm.SortAlgorithm;

import java.util.List;

import static com.vproject.study.util.StudyUtil.printArray;

public class Main {
    public static void main(String[] args) {
        // Measure start time
        long startTime = System.nanoTime();

        // region Linear Search
        System.out.println("======= Linear Search Zone =======");

        int[] initialNumbers =  {2, 4, 6, 8, 10, 10, 14};
        printArray(initialNumbers);

        SearchAlgorithm searchAlgorithm = new SearchAlgorithm();
        int firstIndex = searchAlgorithm.linearSearchFirstOccurrence(initialNumbers, 8);
        System.out.println("Linear Search First Occurrence: index = " + firstIndex);

        int lastIndex = searchAlgorithm.linearSearchLastOccurrence(initialNumbers, 8);
        System.out.println("Linear Search Last Occurrence: index = " + lastIndex);

        List<Integer> targetIndexList = searchAlgorithm.linearSearchAllOccurrences(initialNumbers, 8);
        System.out.println("Linear Search Last Occurrence: index list = " + targetIndexList);

        System.out.println("==================================");
        System.out.println("\n\n");
        // endregion

        // region Binary Search
        System.out.println("======= Binary Search Zone =======");

        printArray(initialNumbers);
        int firstIndexForBinarySearch = searchAlgorithm.binarySearch(initialNumbers, 8);
        System.out.println("Binary Search: index = " + firstIndexForBinarySearch);
        System.out.println("==================================");
        System.out.println("\n\n");
        // endregion

        // region Selection Sort
        System.out.println("======= Selection Sort Zone =======");
        int[] selectionSortArrays =  {14, 14, 8, 5, 9, 1, 1, 9, 6, 7};
        System.out.println("Before:");
        printArray(selectionSortArrays);
        SortAlgorithm sortAlgorithm = new SortAlgorithm();
        sortAlgorithm.selectionSort(selectionSortArrays);
        System.out.println("After:");
        printArray(selectionSortArrays);
        System.out.println("===================================");
        System.out.println("\n\n");
        // endregion

        // region Insertion Sort
        System.out.println("======= Insertion Sort Zone =======");
        int[] insertionSortArrays =  {14, 14, 8, 5, 9, 1, 1, 9, 6, 7};
        System.out.println("Before:");
        printArray(insertionSortArrays);
        sortAlgorithm.insertionSort(insertionSortArrays);
        System.out.println("After:");
        printArray(insertionSortArrays);
        System.out.println("===================================");
        System.out.println("\n\n");
        // endregion

        // region Bubble Sort
        System.out.println("======= Bubble Sort Zone =======");
        int[] bubbleSortArrays =  {14, 14, 8, 5, 9, 1, 1, 9, 6, 7};
        System.out.println("Before:");
        printArray(bubbleSortArrays);
        sortAlgorithm.bubbleSort(bubbleSortArrays);
        System.out.println("After:");
        printArray(bubbleSortArrays);
        System.out.println("===================================");
        System.out.println("\n\n");
        // endregion

        // Measure end time
        // long endTime = System.nanoTime();

        // Compute the elapsed time
        // long duration = endTime - startTime;

        // System.out.println("Execution time in nanoseconds: " + duration);
        // System.out.println("Execution time in milliseconds: " + duration / 1_000_000);
    }
}