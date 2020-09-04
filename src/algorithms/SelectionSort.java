package algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] testArr = {4, 3, 2, 1, 0, -1, -99};
        sort(testArr);
        System.out.println(Arrays.toString(testArr));
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = indexOfMinimum(array, i);
            swap(array, i, minIndex);
        }
    }

    private static int indexOfMinimum(int[] array, int startIndex) {
        int minValue = array[startIndex];
        int minIndex = startIndex;

        for(int i = minIndex + 1; i < array.length; i++) {
            if(array[i] < minValue) {
                minIndex = i;
                minValue = array[i];
            }
        }
        return minIndex;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
