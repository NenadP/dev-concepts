package algorithms;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        System.out.println("Found at index: " + binarySearch(arr, 73));
    }

    static int binarySearch(int[] arr, int target) {

        int min = 0;
        int max = arr.length - 1;

        while (max >= min) {

            int guess = (max + min) / 2;
            System.out.println("Guessing at index: " + guess);

            if (target == arr[guess]) {
                return guess;
            } else {
                if (arr[guess] > target) {
                    max = guess - 1;
                } else {
                    min = guess + 1;
                }
            }
        }

        return -1;
    }
}
