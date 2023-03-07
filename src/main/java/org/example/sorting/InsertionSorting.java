package org.example.sorting;

public class InsertionSorting implements Sorting {
    @Override
    public void sortInAscendingOrder(int[] arrayToSort) {
        if (arrayToSort.length < 2) {
            return;
        }

        for (int i = 1; i < arrayToSort.length; i++) {
            int j = i;
            while (j > 0) {
                if (arrayToSort[j - 1] > arrayToSort[j]) {
                    SortingUtils.swap(arrayToSort, j, j - 1);
                }
                j--;
            }
        }
    }


    @Override
    public void sortInReverseOrder(int[] arrayToSort) {
        if (arrayToSort.length < 2) {
            return;
        }

        for (int i = 1; i < arrayToSort.length; i++) {
            int j = i;
            while (j > 0) {
                if (arrayToSort[j - 1] < arrayToSort[j]) {
                    SortingUtils.swap(arrayToSort, j, j - 1);
                }
                j--;
            }
        }

    }
}
