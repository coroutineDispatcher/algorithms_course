package java_version.arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = Utils.arrayOfSevenElements();

        long startTime = System.nanoTime();

        quickSort(a, 0, a.length);
        System.out.print("Sorted Ended: " + (System.nanoTime() - startTime) + "\n");
        for (int i : a) {
            System.out.print("" + i + "\n");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivot = findPivot(array, start, end);
        quickSort(array, start, pivot);
        quickSort(array, pivot + 1, end);
    }

    private static int findPivot(int[] arr, int start, int end) {
        int currentPivot = arr[start];

        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && arr[--j] >= currentPivot) ;
            if (i < j) {
                arr[i] = arr[j];
            }

            while (i < j && arr[++i] <= currentPivot) ;
            if (i < j) {
                arr[j] = arr[i];
            }
        }

        arr[j] = currentPivot;
        return j;
    }
}
