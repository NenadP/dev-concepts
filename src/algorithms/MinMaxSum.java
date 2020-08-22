package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {

        int[] ints = {769082435, 210437958, 673982045, 375809214, 380564127, 1, 2, 3, 4, 5, 6};
        miniMaxSum(ints);
    }

    static void miniMaxSum(int[] arr) {

        int numOfOp = 0;

        while (true) {
            boolean swapped = false;

            for (int i = 0; i < arr.length - 1; i++) {
                numOfOp += 1;

                if (arr[i] > arr[i + 1]) {
                    swap(arr, i);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(numOfOp);
    }

    static void swap(int[] arr, int i) {

        int temp = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = temp;
    }
}
