public class Utils {

    public static void swap(int[] array, int first, int second) {
        if (first == second) {
            return;
        }

        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static int[] arrayOfSevenElements() {
        int[] array = new int[7];

        array[0] = 56;
        array[1] = 24;
        array[2] = -25;
        array[3] = 1;
        array[4] = 15;
        array[5] = -5;
        array[6] = 100;

        return array;
    }
}
