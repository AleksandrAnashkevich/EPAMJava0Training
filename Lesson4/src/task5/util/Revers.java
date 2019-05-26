package task5.util;

import numeral.Numeral;

public class Revers {
    public static int reversOfNumber(int number) {
        int numeral1 = Numeral.numeralOfNumber(number, 1) * 1000000;
        int numeral2 = Numeral.numeralOfNumber(number, 2) * 100000;
        int numeral3 = Numeral.numeralOfNumber(number, 3) * 10000;
        int numeral4 = Numeral.numeralOfNumber(number, 4) * 1000;
        int numeral5 = Numeral.numeralOfNumber(number, 5) * 100;
        int numeral6 = Numeral.numeralOfNumber(number, 6) * 10;
        int numeral7 = Numeral.numeralOfNumber(number, 7);

        return numeral1 + numeral2 + numeral3 + numeral4 + numeral5 + numeral6 + numeral7;

    }
}
