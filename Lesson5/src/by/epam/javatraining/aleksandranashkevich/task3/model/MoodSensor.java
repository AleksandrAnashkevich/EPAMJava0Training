package by.epam.javatraining.aleksandranashkevich.task3.model;

public class MoodSensor {
    public static String fase(int mood) {
        String answer = ":(";
        if (mood == 0) {
            answer = ":|";
        } else if (mood > 0) {
            answer = ":)";
        }
        return answer;
    }
}
