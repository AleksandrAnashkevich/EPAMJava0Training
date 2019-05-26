package task5.runner;

import task5.util.Revers;

public class Main {
    public static void main(String[] args) {
        int number = 1234567;

        int reversNumber = Revers.reversOfNumber(number);

        System.out.printf("Revers of number = %d", reversNumber);
    }
}
