package java_version.arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = Utils.arrayOfSevenElements();

        long startTime = System.nanoTime();

        insertionSortRecursively(array, array.length);

        System.out.print("Sorted Ended: " + (System.nanoTime() - startTime) + "\n");

        for (int value : array) {
            System.out.print("" + value + "\n");
        }
    }

    public static void insertionSortRecursively(int[] arr, int numberOfItems) {
        if (numberOfItems < 2) {
            return;
        }

        insertionSortRecursively(arr, numberOfItems - 1);

        int newElement = arr[numberOfItems - 1];

        int i;

        for (i = numberOfItems - 1; i > 0 && arr[i - 1] > newElement; i--) {
            arr[i] = arr[i - 1];
        }

        arr[i] = newElement;

        System.out.println("Result of call when number of items = " + numberOfItems);

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("------------------------------");
    }
}
