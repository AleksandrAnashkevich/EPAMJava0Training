package task1.util;

public class Comparison {
    public static boolean equalityOfNumbers(double a, double b, double c) {
        return a == b && b == c;
    }

    public static boolean noEqualityOfNumbers(double a, double b, double c) {
        return a != b || b != c || c != a;
    }
}
