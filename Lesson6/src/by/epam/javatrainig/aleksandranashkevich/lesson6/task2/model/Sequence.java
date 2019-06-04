package by.epam.javatrainig.aleksandranashkevich.lesson6.task2.model;

public class Sequence {

    private static boolean checkOfIncrese(int number) {
        int numeral = number % 10;
        number /= 10;

        while (number > 10) {
            int nextNumeral = number % 10;

            if (nextNumeral >= numeral) {
                return false;
            }

            number /= 10;
        }

        return true;
    }

    private static boolean checkOfDescrese(int number) {
        int numeral = number % 10;
        number /= 10;

        while (number > 10) {
            int nextNumeral = number % 10;

            if (nextNumeral <= numeral) {
                return false;
            }

            number /= 10;
        }

        return true;
    }

    public static boolean checkOf(int number) {
        return checkOfIncrese(number) || checkOfDescrese(number);
    }
}
