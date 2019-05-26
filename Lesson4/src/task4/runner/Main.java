package task4.runner;

import numeral.Numeral;
import task4.util.Means;

public class Main {
    public static void main(String[] args) {
        int number = 137579;

        int numeral1 = Numeral.numeralOfNumber(number, 1);
        int numeral2 = Numeral.numeralOfNumber(number, 2);
        int numeral3 = Numeral.numeralOfNumber(number, 3);
        int numeral4 = Numeral.numeralOfNumber(number, 4);
        int numeral5 = Numeral.numeralOfNumber(number, 5);
        int numeral6 = Numeral.numeralOfNumber(number, 6);

        double arithmetic = Means.arithmeticMeans(numeral1, numeral2, numeral3, numeral4, numeral5, numeral6);
        double geometric = Means.geometricMeans(numeral1, numeral2, numeral3, numeral4, numeral5, numeral6);

        System.out.printf("Arithmetic means of numeral= %f\n", arithmetic);
        System.out.printf("Geometric means of numeral= %f", geometric);
    }
}
