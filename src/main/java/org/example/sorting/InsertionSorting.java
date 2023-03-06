package org.example.sorting;

public class InsertionSorting implements Sorting {
    @Override
    public void sortInAscendingOrder(int[] arrayToSort) {
        if (arrayToSort.length < 2) {
            return;
        }

        for (int i = 0; i < arrayToSort.length - 1; i++) { // 0 3 4 2 1 4
            if (arrayToSort[i] > arrayToSort[i + 1]) { // (i + 1) is 2 upper bound
                for (int j = 0; j <= i + 1; j++) {
                    if (arrayToSort[i + 1] < arrayToSort[j]) { // j is 3 lower bound
                        int elementToInsert = arrayToSort[i + 1];
                        moveElementsToRight(arrayToSort, i + 1, j);
                        arrayToSort[j] = elementToInsert;
                    }
                }
            }
        }
    }

    private void moveElementsToRight(int[] arrayToSort, int upperBound, int lowerBound) {
        for (int k = upperBound - 1; k >= lowerBound; k--) {
            arrayToSort[k + 1] = arrayToSort[k];
        }
    }

    void when() {
        char[] questions = {'w', 'h', 'e', 'n'};
        for (char question : questions) {
            System.out.println(question);
        }
    }

    @Override
    public void sortInReverseOrder(int[] arrayToSort) {
        if (arrayToSort.length < 2) {
            return;
        }

        for (int i = 0; i < arrayToSort.length - 1; i++) { // 8 5 6 2 1 4
            if (arrayToSort[i] < arrayToSort[i + 1]) { // (i + 1) is 6 upper bound
                for (int j = 0; j <= i + 1; j++) {
                    if (arrayToSort[i + 1] > arrayToSort[j]) { // j is 5 lower bound
                        int elementToInsert = arrayToSort[i + 1];
                        moveElementsToRight(arrayToSort, i + 1, j);
                        arrayToSort[j] = elementToInsert;
                    }
                }
            }
        }

    }
}
