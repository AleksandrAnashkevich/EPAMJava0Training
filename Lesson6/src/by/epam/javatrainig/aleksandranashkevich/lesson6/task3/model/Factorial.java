package by.epam.javatrainig.aleksandranashkevich.lesson6.task3.model;

public class Factorial {
    private static final int INITIAL_VALUE = 2;

    public static int count(int number) {
        int factorial = 1;

        if (!isValid(number)) {
            return -1;
        }

        for (int i = INITIAL_VALUE; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    private static boolean isValid(int number) {
        return number >= 0;
    }
}
