package task2.runner;

import task2.util.Ring;

public class Main {
    public static void main(String[] args) {
        double r1 = 7;
        double r2 = 1;

        double sRing = Ring.foundAreaOfRing(r1, r2);

        System.out.printf("Area of ring = %f", sRing);
    }
}
