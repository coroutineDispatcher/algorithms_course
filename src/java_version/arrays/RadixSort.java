package java_version.arrays;

public class RadixSort {

    public static void main(String[] args) {
        String[] array = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        long startTime = System.nanoTime();
        radixSort(array, 26, 5);
        System.out.print("Sorted Ended: " + (System.nanoTime() - startTime) + "\n");
        for (String i : array) {
            System.out.print("" + i + "\n");
        }
    }

    public static void radixSort(String[] arr, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(arr, i, radix);
        }
    }

    private static void radixSingleSort(String[] arr, int position, int radix) {
        int numItems = arr.length;
        int[] countArray = new int[radix];

        for (String value : arr) {
            countArray[getIndex(position, value)]++;
        }

        for (int j = 1; j < radix; j++) {
            //just to make it stable
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, arr[tempIndex])]] = arr[tempIndex];
        }

        //System.arraycopy(temp, 0, arr, 0, numItems);
        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            arr[tempIndex] = temp[tempIndex];
        }
    }

    private static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }
}
