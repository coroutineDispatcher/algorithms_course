package java_version.arrays;

import static java_version.arrays.Utils.findMaximumOfArray;
import static java_version.arrays.Utils.findMinimumOfarray;

public class CountingSort {

    public static void main(String[] args) {
        int[] arr = {5, 6 ,7 , 324 ,123 , 123 , 5151 ,51 , 1 , 123 ,15};
        long startTime = System.nanoTime();
        int minVal = findMinimumOfarray(arr);
        int max = findMaximumOfArray(arr);
        countingSort(arr, minVal, max);
        System.out.print("Sorted Ended: " + (System.nanoTime() - startTime) + "\n");
        for (int i : arr) {
            System.out.print("" + i + "\n");
        }
    }

    static void countingSort(int[] array, int minVal, int maxVal) {
        int[] countArray = new int[maxVal - minVal + 1];

        for (int value : array) {
            countArray[value - minVal]++;
        }

        int j = 0;
        for (int i = minVal; i <= maxVal; i++) {
            while (countArray[i - minVal] > 0) {
                array[j++] = i;
                countArray[i - minVal]--;
            }
        }
    }
}
