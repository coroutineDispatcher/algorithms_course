package java_version.arrays;

public class HourGlassSum {


    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length - 2; row++) {
            for (int col = 0; col < arr.length - 2; col++) {
                int temp = hourGlassSum(arr, row, col);
                max = Math.max(temp, max);
            }
        }
        return max;
    }

    static int hourGlassSum(int[][] arr, int row, int col) {
        return arr[row][col] + arr[row][col + 1] + arr[row][col + 2]
                + arr[row + 1][col + 1]
                + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
    }

    public static void main(String[] args) {
        //add a 2d Array 
    }
}
