package by.epam.javatrainig.aleksandranashkevich.lesson6.task5.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void testNumberFive() {
        int number = 5;
        boolean extend = true;

        assertEquals(PrimeNumber.checkOf(number), extend);
    }

    @Test
    public void testNumberSix() {
        int number = 9;
        boolean extend = false;

        assertEquals(PrimeNumber.checkOf(number), extend);
    }
}