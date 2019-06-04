package by.epam.javatrainig.aleksandranashkevich.lesson6.task2.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceTest {

    @Test
    public void checkOf1() {
        int number = 12345;
        boolean extend = true;

        assertEquals(Sequence.checkOf(number), extend);
    }

    @Test
    public void checkOf2() {
        int number = 987654321;
        boolean extend = true;

        assertEquals(Sequence.checkOf(number), extend);
    }

    @Test
    public void checkOf3() {
        int number = 5555;
        boolean extend = false;

        assertEquals(Sequence.checkOf(number), extend);
    }
}