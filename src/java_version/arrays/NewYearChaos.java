package java_version.arrays;

import static java.lang.Integer.max;

public class NewYearChaos {
    static void minimumBribes(int[] q) {
        int count = 0;
        for (int i = q.length - 1; i > 0; i--) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i]) count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6, 7};
        minimumBribes(arr);
    }
}