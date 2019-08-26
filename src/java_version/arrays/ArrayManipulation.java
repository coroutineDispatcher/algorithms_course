package java_version.arrays;

public class ArrayManipulation {
    static long arrayManipulation(int n, int[][] queries) {
        long[] computation = new long[n];

        for (int[] query : queries) {
            int a = query[0] - 1;
            int b = query[1] - 1;
            int k = query[2];

            computation[a] += k;
            if (b + 1 < n) {
                computation[b + 1] -= k;
            }
        }

        long max = 0; long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += computation[i];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] arrayOfQueries = {
                {1 ,2 ,100},
                {2 ,5 ,100},
                {3 ,4 ,100}
        };

        long manipulation = arrayManipulation(5, arrayOfQueries);
        System.out.println("Max of array: " + manipulation);
    }
}
