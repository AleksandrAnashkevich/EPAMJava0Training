package task3.runner;

import numeral.Numeral;
import task3.util.Copmparison;

public class Main {
    public static void main(String[] args) {
        int number = 1357;

        boolean answer = Copmparison.equalityAscending(number);

        System.out.printf("This is an increasing sequence: %b", answer);

    }
}
