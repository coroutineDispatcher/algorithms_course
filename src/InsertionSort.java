public class InsertionSort {
    public static void main(String[] args) {
        int[] array = Utils.arrayOfSevenElements();

        long startTime = System.nanoTime();

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }

            array[i] = newElement;
        }

        System.out.print("Sorted Ended: " + (System.nanoTime() - startTime) + "\n");

        for (int value : array) {
            System.out.print("" + value + "\n");
        }
    }
}
