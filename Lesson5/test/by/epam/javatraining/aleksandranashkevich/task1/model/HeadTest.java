package by.epam.javatraining.aleksandranashkevich.task1.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeadTest {

    @Test
    public void checkHeadLess200() {
        int year = 150;
        int extend = 453;
        assertEquals(extend, Head.numberOf(year));
    }

    @Test
    public void checkHeadLess300() {
        int year = 250;
        int extend = 703;
        assertEquals(extend, Head.numberOf(year));
    }

    @Test
    public void checkHeadMore300() {
        int year = 350;
        int extend = 1053;
        assertEquals(extend, Head.numberOf(year));
    }

    @Test
    public void checkHeadError() {
        int year = -150;
        int extend = -1;
        assertEquals(extend, Head.numberOf(year));
    }
}