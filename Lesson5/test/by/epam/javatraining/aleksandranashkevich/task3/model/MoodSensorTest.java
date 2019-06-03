package by.epam.javatraining.aleksandranashkevich.task3.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodSensorTest {
    @Test
    public void checkBadMoon() {
        int moon = -5;
        String extend = ":(";
        assertEquals(extend, MoodSensor.fase(moon));
    }

    @Test
    public void checkNeutralMoon() {
        int moon = 0;
        String extend = ":|";
        assertEquals(extend, MoodSensor.fase(moon));
    }

    @Test
    public void checkGoodMoon() {
        int moon = 5;
        String extend = ":)";
        assertEquals(extend, MoodSensor.fase(moon));
    }
}