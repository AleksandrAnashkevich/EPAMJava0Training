package by.epam.javatraining.aleksandranashkevich.task2.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class LetterTest {
    @Test
    public void checkCapitalLetter() {
        char c = '\u0041';
        boolean extend = true;
        assertEquals(extend, Letter.check(c));

    }

    @Test
    public void checkLowercaseLetter() {
        char c = '\u006a';
        boolean extend = true;
        assertEquals(extend, Letter.check(c));

    }

    @Test
    public void checkErroretter() {
        char c = '\u006b';
        boolean extend = false;
        assertEquals(extend, Letter.check(c));

    }
}