package by.epam.javatraining.aleksandranashkevich.task4.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {
    @Test
    public void checkNextDay() {
        int number = 12, month = 12, year = 12;
        String extend = "13,12,12";
        assertEquals(extend, Date.getNextDate(number, month, year));
    }

    @Test
    public void checkNextMonth() {
        int number = 31, month = 1, year = 12;
        String extend = "1,2,12";
        assertEquals(extend, Date.getNextDate(number, month, year));
    }

    @Test
    public void checkNextYear() {
        int number = 31, month = 12, year = 12;
        String extend = "1,1,13";
        assertEquals(extend, Date.getNextDate(number, month, year));
    }

    @Test
    public void checkNextDayOfFebruary() {
        int number = 28, month = 2, year = 12;
        String extend = "29,2,12";
        assertEquals(extend, Date.getNextDate(number, month, year));
    }

    @Test
    public void checkNextMonthOfFebruary() {
        int number = 28, month = 2, year = 1100;
        String extend = "1,3,1100";
        assertEquals(extend, Date.getNextDate(number, month, year));
    }


}