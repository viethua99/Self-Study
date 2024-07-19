package com.vproject.study.algorithm.search;

import java.util.List;
import static com.vproject.study.util.StudyUtil.printArray;

public class SearchExecutor {
    public static void execute(SearchType searchType) {
        System.out.println("=========== INITIALIZE ===========");
        int[] initialNumbers = {2, 4, 6, 8, 10, 10, 14};
        int targetValue = 8;
        printArray(initialNumbers);
        System.out.println("Target: " + targetValue);
        System.out.println("==================================\n");

        switch (searchType) {
            case LINEAR_SEARCH:
                executeLinearSearch(initialNumbers, targetValue);
                break;
            case BINARY_SEARCH:
                executeBinarySearch(initialNumbers, targetValue);
                break;
        }
    }

    private static void executeLinearSearch(int[] initialNumbers, int targetValue) {
        // region Linear Search
        SearchAlgorithm searchAlgorithm = new SearchAlgorithm();
        System.out.println("======= Linear Search Zone =======");

        int firstIndex = searchAlgorithm.linearSearchFirstOccurrence(initialNumbers, targetValue);
        System.out.println("Linear Search First Occurrence: index = " + firstIndex);
        int lastIndex = searchAlgorithm.linearSearchLastOccurrence(initialNumbers, targetValue);
        System.out.println("Linear Search Last Occurrence: index = " + lastIndex);
        List<Integer> targetIndexList = searchAlgorithm.linearSearchAllOccurrences(initialNumbers, targetValue);
        System.out.println("Linear Search Last Occurrence: index list = " + targetIndexList);

        System.out.println("==================================\n\n");
        // endregion
    }

    private static void executeBinarySearch(int[] initialNumbers, int targetValue) {
        // region Binary Search
        SearchAlgorithm searchAlgorithm = new SearchAlgorithm();
        System.out.println("======= Binary Search Zone =======");

        int firstIndexForBinarySearch = searchAlgorithm.binarySearch(initialNumbers, targetValue);
        System.out.println("Binary Search: index = " + firstIndexForBinarySearch);

        System.out.println("==================================\n\n");
        // endregion
    }
}
