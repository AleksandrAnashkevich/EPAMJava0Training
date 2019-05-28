package task4.util;

public class Means {
    public static double arithmeticMeans(int number) {
        int numeral1 = number % 10;
        number /= 10;

        int numeral2 = number % 10;
        number /= 10;

        int numeral3 = number % 10;
        number /= 10;

        int numeral4 = number % 10;
        number /= 10;

        int numeral5 = number % 10;
        number /= 10;

        int numeral6 = number % 10;

        /*
        for (int i=0; i<=5; i++){
            numeral[i]= number % 10;//another variant
            number /= 10;
         }
         */

        return (numeral1 + numeral2 + numeral3 + numeral4 + numeral5 + numeral6) / 6.;
    }

    public static double geometricMeans(int number) {
        int numeral1 = number % 10;
        number /= 10;

        int numeral2 = number % 10;
        number /= 10;

        int numeral3 = number % 10;
        number /= 10;

        int numeral4 = number % 10;
        number /= 10;

        int numeral5 = number % 10;
        number /= 10;

        int numeral6 = number % 10;

                /*
        for (int i=0; i<=5; i++){
            numeral[i]= number % 10;//another variant
            number /= 10;
         }
         */

        return Math.pow((numeral1 * numeral2 * numeral3 * numeral4 * numeral5 * numeral6), 1. / 6);
    }
}
