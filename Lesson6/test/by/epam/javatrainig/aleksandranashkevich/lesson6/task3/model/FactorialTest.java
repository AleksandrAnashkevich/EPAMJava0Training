package by.epam.javatrainig.aleksandranashkevich.lesson6.task3.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void count() {

        int number = 5;
        int extend = 120;

        assertEquals(Factorial.count(number), extend);
    }
}
