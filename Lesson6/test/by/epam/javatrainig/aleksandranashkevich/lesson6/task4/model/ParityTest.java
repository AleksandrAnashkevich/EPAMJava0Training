package by.epam.javatrainig.aleksandranashkevich.lesson6.task4.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParityTest {

    @Test
    public void checkOfEquals1() {
        int number = 13579;
        boolean extend = true;

        assertEquals(Parity.checkOfEquals(number), extend);
    }

    @Test
    public void checkOfEquals2() {
        int number = 2222;
        boolean extend = true;

        assertEquals(Parity.checkOfEquals(number), extend);
    }

    @Test
    public void checkOfEquals3() {
        int number = 13279;
        boolean extend = false;

        assertEquals(Parity.checkOfEquals(number), extend);
    }
}
