package algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] testArr = {4, 3, 2, 1, 0, -1, -99};
        sort(testArr);
        System.out.println(Arrays.toString(testArr));
    }

    private static void sort(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            insert(array, i, array[i+1]);
        }
    }

    private static void insert(int[] array, int j, int value) {

        while (j >= 0) {

            if (j == 0) {
                array[j + 1] = array[j];
                array[j] = value;
                break;
            }

            if (value < array[j]) {
                array[j + 1] = array[j];

            } else {
                array[j + 1] = value;
                break;
            }

            j--;
        }
    }
}
