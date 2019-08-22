package java_version.arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = Utils.arrayOfSevenElements();

        long startTime = System.nanoTime();

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int newValue = array[i];

                int j = i;

                while (j >= gap && array[j - gap] > newValue) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = newValue;
            }

        }

        System.out.print("Sorted Ended: " + (System.nanoTime() - startTime) + "\n");
        for (int i : array) {
            System.out.print("" + i + "\n");
        }
    }
}
