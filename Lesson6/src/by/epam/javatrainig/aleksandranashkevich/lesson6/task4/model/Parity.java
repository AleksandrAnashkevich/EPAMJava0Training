package by.epam.javatrainig.aleksandranashkevich.lesson6.task4.model;

public class Parity {

    public static boolean checkOfEquals(int number) {
        int parity = (number % 10) % 2;
        number /= 10;

        while (number > 10) {
            int parityNextNumeral = (number % 10) % 2;

            if (parityNextNumeral != parity) {
                return false;
            }

            number /= 10;
        }

        return true;
    }

    private static boolean isValid(int number) {
        return number >= 0;
    }
}
