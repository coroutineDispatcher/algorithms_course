package java_version.arrays;

import java.util.Arrays;
import java.util.Random;

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

    public static int[] arrayOfMillions() {
        int[] arrayOfThousands = new int[1000000];
        for (int i = 0; i < arrayOfThousands.length - 1; i++) {
            int randVal = new Random().nextInt(1000000);
            arrayOfThousands[i] = randVal;
        }

        return arrayOfThousands;
    }

    public static int[] arrayOfThousands() {
        int[] arrayOfThousands = new int[1000];
        for (int i = 0; i < arrayOfThousands.length - 1; i++) {
            int randVal = new Random().nextInt(1000);
            arrayOfThousands[i] = randVal;
        }

        return arrayOfThousands;
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

    public static long findMaximumOfArray(long[] arr) {
        long max = Long.MIN_VALUE;
        for (long value : arr) {
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
