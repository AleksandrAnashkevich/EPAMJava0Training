package by.epam.javatraining.aleksandranashkevich.task1.model;

public class Head {
    private static final int STARTED_HEAD_COUNT = 3;
    private static final int FIRST_LIFE_PERIOD = 200;
    private static final int SECOND_LIFE_PERIOD = 300;
    private static final int HEADS_IN_FIRST_PERIOD = 3;
    private static final int HEADS_IN_SECOND_PERIOD = 2;
    private static final int HEADS_AFTER_FIRST_PERIOD = 600;
    private static final int HEADS_AFTER_SECOND_PERIOD = 1000;
    private static final int ERROR_DATE = -1;

    public static int numberOf(int year) {
        int head = STARTED_HEAD_COUNT;
        if (year >= 0) {
            if (year < FIRST_LIFE_PERIOD) {
                head += year * HEADS_IN_FIRST_PERIOD;
            } else if (year < SECOND_LIFE_PERIOD) {
                head += HEADS_AFTER_FIRST_PERIOD + (year - FIRST_LIFE_PERIOD) * HEADS_IN_SECOND_PERIOD;
            } else {
                head += HEADS_AFTER_SECOND_PERIOD + (year - SECOND_LIFE_PERIOD);
            }
        } else {
            head = ERROR_DATE;
        }
        return head;
    }
}
