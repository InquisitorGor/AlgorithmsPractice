package org.example.sorting;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class CommonSortingCases {
    Sorting sorting;

    public CommonSortingCases(Sorting sorting) {
        this.sorting = sorting;
    }

    @Test
    public void testSortingInReverseOrderWithEmptyArray() {
        int[] array = {};

        sorting.sortInReverseOrder(array);

        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testSortingInReverseOrderWithArrayOfSizeOne() {
        int[] array = {1};

        sorting.sortInReverseOrder(array);

        assertArrayEquals(new int[]{1}, array);
    }

    @Test
    public void testSortingInReverseOrderWithUnsortedArray() {
        int[] array = {1, 2};

        sorting.sortInReverseOrder(array);

        assertArrayEquals(new int[]{2, 1}, array);
    }

    @Test
    public void testSortingInReverseOrderWithSortedArray() {
        int[] array = {5, 4, 3, 2, 1};

        sorting.sortInReverseOrder(array);

        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, array);
    }

    @Test
    public void testSortingInReverseOrderWithLargeArray() {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        long startTimeMillis = System.currentTimeMillis();
        sorting.sortInReverseOrder(array);
        System.out.println("Time of execution is milis: " + (System.currentTimeMillis() - startTimeMillis));


        for (int i = 0; i < array.length - 1; i++) {
            assertEquals(array[i], array.length - 1 - i);
        }
    }

    @Test
    public void testSortingInReverseOrderWithArrayWithDuplicates() {
        int[] array = {3, 1, 1, 2, 2};

        sorting.sortInReverseOrder(array);

        assertArrayEquals(new int[]{3, 2, 2, 1, 1}, array);
    }


    @Test
    public void testSortingInAscendingOrderWithEmptyArray() {
        int[] array = {};

        sorting.sortInAscendingOrder(array);

        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testSortingInAscendingOrderWithArrayOfSizeOne() {
        int[] array = {1};

        sorting.sortInAscendingOrder(array);

        assertArrayEquals(new int[]{1}, array);
    }

    @Test
    public void testSortingInAscendingOrderWithUnsortedArray() {
        int[] array = {3, 1, 2};

        sorting.sortInAscendingOrder(array);

        assertArrayEquals(new int[]{1, 2, 3}, array);
    }

    @Test
    public void testSortingInAscendingOrderWithSortedArray() {
        int[] array = {1, 2, 3, 4, 5};

        sorting.sortInAscendingOrder(array);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSortingInAscendingOrderWithLargeArray() {
        int[] array = new int[10000];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array.length - 1 - i;
        }

        long startTimeMillis = System.currentTimeMillis();
        sorting.sortInAscendingOrder(array);
        System.out.println("Time of execution is milis: " + (System.currentTimeMillis() - startTimeMillis));

        for (int i = 0; i < array.length - 1; i++) {
            assertEquals(array[i], i);
        }
    }

    @Test
    public void testSortingInAscendingOrderWithArrayWithDuplicates() {
        int[] array = {3, 1, 1, 2, 2};

        sorting.sortInAscendingOrder(array);

        assertArrayEquals(new int[]{1, 1, 2, 2, 3}, array);
    }


}
