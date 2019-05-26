package task4.util;

public class Means {
    public static double arithmeticMeans(int numeral1, int numeral2, int numeral3, int numeral4, int numeral5, int numeral6) {
        return (numeral1 + numeral2 + numeral3 + numeral4 + numeral5 + numeral6) / 6.;
    }

    public static double geometricMeans(int numeral1, int numeral2, int numeral3, int numeral4, int numeral5, int numeral6) {
        return Math.pow((numeral1 * numeral2 * numeral3 * numeral4 * numeral5 * numeral6), 1. / 6);
    }
}
