
public class SelectionSort {
    //last unsorted index = index of the unsorted partition
    // index to iterate. NOTE: STARTS FROM 1
    // the index of max value of the array

    public static void main(String[] args) {
        int[] array = Utils.arrayOfSevenElements();

        long startTime =  System.nanoTime();

        for (int unsortedIndex = array.length - 1; unsortedIndex > 0; unsortedIndex--) {

            int largestNumberIndex = 0;

            for (int i = 1; i <= unsortedIndex; i++) {
                if (array[i] > array[largestNumberIndex]) {
                    largestNumberIndex = i;
                }

                Utils.swap(array, largestNumberIndex, unsortedIndex);
            }
        }


        System.out.print("Sorted Ended: " + (System.nanoTime() - startTime) + "\n");
        for (int i : array) {
            System.out.print("" + i + "\n");
        }
    }
}
