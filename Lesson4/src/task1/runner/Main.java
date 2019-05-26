package task1.runner;

import task1.util.Comparison;

public class Main {
    public static void main(String[] args) {

        double a = 5;
        double b = 5;  //
        double c = 5;

        boolean answer = Comparison.equalityOfNumbers(a, b, c);

        System.out.printf("These numbers are equal: %b", answer);
    }
}
