package algorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        int[] ints = {769082435, 210437958, 673982045, 375809214, 380564127, 1, 2, 3, 4, 5, 6};
        bubbleSort(ints);
    }


    static void bubbleSort(int arr[]) {

        int numOfOps = 0;
        int length = arr.length;

        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++) {

                numOfOps++;

                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        System.out.println(numOfOps);
    }
}
