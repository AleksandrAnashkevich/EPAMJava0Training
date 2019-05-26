package task3.runner;

import numeral.Numeral;
import task3.util.Copmparison;

public class Main {
    public static void main(String[] args) {
        int number = 1357;

        int numeral1 = Numeral.numeralOfNumber(number, 1);
        int numeral2 = Numeral.numeralOfNumber(number, 2);
        int numeral3 = Numeral.numeralOfNumber(number, 3);
        int numeral4 = Numeral.numeralOfNumber(number, 4);

        boolean answer = Copmparison.equalityAscending(numeral1, numeral2, numeral3, numeral4);

        System.out.printf("This is an increasing sequence: %b");

    }
}
