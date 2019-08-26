package java_version.arrays;

public class MinSwaps {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6, 7};
        minimumSwaps(arr);
    }

    static void minimumSwaps(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (i < arr[i] - 1) {
                swap(arr, i, Math.min(arr.length - 1, arr[i] - 1));
                counter++;
                i--;
            }
        }

        for (int value: arr){
            System.out.println(value);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
