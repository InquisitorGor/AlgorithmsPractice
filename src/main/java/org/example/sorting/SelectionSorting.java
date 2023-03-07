package org.example.sorting;

public class SelectionSorting implements Sorting {
    @Override
    public void sortInAscendingOrder(int[] arrayToSort) {
        if (arrayToSort.length < 2) {
            return;
        }

        for (int i = arrayToSort.length - 1; i > 0; i--) { // 4 2 3 1
            int minElement = arrayToSort[i];
            for (int j = 0; j < i; j++) {
                if (arrayToSort[j] > minElement) {
                    minElement = arrayToSort[j];
                    SortingUtils.swap(arrayToSort, i, j);
                }
            }
        }
    }

    @Override
    public void sortInReverseOrder(int[] arrayToSort) {
        if (arrayToSort.length < 2) {
            return;
        }

        for (int i = 0; i < arrayToSort.length; i++) { // 4 2 3 1
            int maxElement = arrayToSort[i];
            for (int j = arrayToSort.length - 1; j > i; j--) {
                if (arrayToSort[j] > maxElement) {
                    maxElement = arrayToSort[j];
                    SortingUtils.swap(arrayToSort, i, j);
                }
            }
        }
    }

}
