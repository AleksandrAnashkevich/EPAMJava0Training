package task4.runner;

import task4.util.Means;

public class Main {
    public static void main(String[] args) {
        int number = 137579;

        double arithmetic = Means.arithmeticMeans(number);
        double geometric = Means.geometricMeans(number);

        System.out.printf("Arithmetic means of numeral= %f\n", arithmetic);
        System.out.printf("Geometric means of numeral= %f", geometric);
    }
}
