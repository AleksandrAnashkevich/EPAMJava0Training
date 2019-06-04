package by.epam.javatrainig.aleksandranashkevich.lesson6.task1.model;

import java.util.Random;

public class HeadsOrTails {

    private static final Random random = new Random();
    private static final int SIDES = 2;

    public static int countHead(int toss) {
        if (!isValid(toss)) {
            return -1;
        }

        int answer = 0;
        for (int i = 0; i < toss; i++) {
            answer += random.nextInt(SIDES);
        }

        return answer;
    }

    private static boolean isValid(int toss) {
        return toss >= 0;
    }

}
