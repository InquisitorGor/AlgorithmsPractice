package org.example.sorting;

import lombok.experimental.UtilityClass;

@UtilityClass
public class SortingUtils {
    static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
