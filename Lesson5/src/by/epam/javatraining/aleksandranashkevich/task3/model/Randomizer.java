package by.epam.javatraining.aleksandranashkevich.task3.model;

import java.util.Random;

public class Randomizer {

    final private static int MOOD_MAX=21;
    final private static int MOOD_MIN=10;
    final private static Random random=new Random();

    public static int getMood(){
        return random.nextInt(MOOD_MAX)-MOOD_MIN;
    }
}
