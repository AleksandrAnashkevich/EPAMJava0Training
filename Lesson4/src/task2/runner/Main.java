package task2.runner;

import task2.util.Ring;

public class Main {
    public static void main(String[] args) {
        double rCircle1 = 7;
        double rCircle2 = 1;

        double sCircle1 = Ring.foundAreaOfCircle(rCircle1);
        double sCircle2 = Ring.foundAreaOfCircle(rCircle2);

        double sRing = Ring.foundAreaOfRing(sCircle1, sCircle2);

        System.out.printf("Area of ring = %f", sRing);
    }
}
