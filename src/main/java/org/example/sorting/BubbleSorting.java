package org.example.sorting;

public class BubbleSorting implements Sorting {

    @Override
    public void sortInReverseOrder(int[] arrayToSort) {
        if (arrayToSort.length < 2) {
            return;
        }

        for (int i = arrayToSort.length - 1; i > 0; i--) { // 1 2
            for (int j = 0; j < i; j++) {
                if (arrayToSort[j] < arrayToSort[j + 1]) {
                    swap(arrayToSort, j + 1, j);
                }
            }
        }
    }

    @Override
    public void sortInAscendingOrder(int[] arrayToSort) { // 4 3 2 1
        if (arrayToSort.length < 2) {
            return;
        }

        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = arrayToSort.length - 1; j > i; j--) {
                if (arrayToSort[j] < arrayToSort[j - 1]) {
                    swap(arrayToSort, j - 1, j);
                }
            }
        }
    }

    private void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

}
