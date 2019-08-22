package java_version.arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = Utils.arrayOfSevenElements();
        long startTime = System.nanoTime();
        mergeSort(array, 0, array.length);
        System.out.print("Sorted: " + (System.nanoTime() - startTime) + "\n");
        for (int i : array) {
            System.out.print("" + i + "\n");
        }
    }

    static void mergeSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        mergeArrayS(array, start, end, mid);
    }

    static void mergeArrayS(int[] array, int start, int end, int mid) {
        if (array[mid - 1] <= array[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArray = new int[end - start];

        while (i < mid && j < end) {
            tempArray[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, array, start, tempIndex);
    }

}