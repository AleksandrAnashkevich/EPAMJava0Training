package task2.util;

public class Ring {

    public static double foundAreaOfCircle(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double foundAreaOfRing(double s1, double s2) {
        return s1 - s2;
    }
}
