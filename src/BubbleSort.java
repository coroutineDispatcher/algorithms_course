
public class BubbleSort {
    //last unsorted index = index of the unsorted partition
    // index to iterate

    public static void main(String[] args) {
        int[] a = Utils.arrayOfSevenElements();

        long startTime =  System.nanoTime();

        for (int unsortedIndex = a.length - 1; unsortedIndex > 0; unsortedIndex--) {
            for (int i = 0; i < unsortedIndex; i++) {
                if (a[i] > a[i + 1]) {
                    Utils.swap(a, i, i + 1);
                }
            }
        }

        System.out.print("Sorted Ended: " + (System.nanoTime() - startTime) + "\n");
        for (int i : a) {
            System.out.print("" + i + "\n");
        }
    }
}