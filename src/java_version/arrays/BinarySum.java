package java_version.arrays;

public class BinarySum {


    static int[] sumarray() {
        int[] A = {1, 0, 1, 1};
        int[] B = {0, 0, 1, 1};
        int[] C = {0, 0, 0, 0};
        int m = 0;

        for (int i = A.length - 1; i >= 0; i--) {
            int sum = A[i] + B[i] + m;
            if (sum >= 2) {
                m = 1;
            } else {
                m = 0;
            }
            C[i] = sum % 2;
        }

        return C;
    }

    public static void main(String[] args) {
        int[] c = sumarray();

        for (int i : c) {
            System.out.println(i);
        }
    }
}
