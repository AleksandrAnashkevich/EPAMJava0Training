package by.epam.javatrainig.aleksandranashkevich.lesson6.task5.model;

public class PrimeNumber {

    public static boolean checkOf(int number) {
        final int maxIteration = (int) Math.round(Math.sqrt(number));

        for (int i = 2; i <= maxIteration; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValid(int number) {
        return number >= 0;
    }
}
