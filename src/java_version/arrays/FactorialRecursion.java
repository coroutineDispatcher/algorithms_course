package java_version.arrays;

public class FactorialRecursion {

    public static void main(String[] args) {
        System.out.println("factorial = " + calculateFactorial(5));
        System.out.println("factorial = " + calculateFactorialIteratively(5));
    }

    private static int calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        }

        return number * calculateFactorial(number - 1);

    }

    private static int calculateFactorialIteratively(int number) {
        if (number == 0) {
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
