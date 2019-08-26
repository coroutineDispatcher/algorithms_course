package java_version.arrays;

import java.util.Arrays;

public class Utils {

    public static void swap(int[] array, int first, int second) {
        if (first == second) {
            return;
        }

        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static int[] arrayOfSevenElements() {
        int[] array = new int[7];

        array[0] = 56;
        array[1] = 24;
        array[2] = -25;
        array[3] = 1;
        array[4] = 15;
        array[5] = -5;
        array[6] = 100;

        return array;
    }

    public static int findMaximumOfArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static int findMinimumOfarray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] array = arrayOfSevenElements();

        Arrays.parallelSort(array);

        for (int value : array) {
            System.out.println(value);
        }
    }
}
