package by.epam.javatraining.aleksandranashkevich.task3.controller;

import by.epam.javatraining.aleksandranashkevich.task3.view.Print;
import by.epam.javatraining.aleksandranashkevich.task3.model.MoodSensor;
import by.epam.javatraining.aleksandranashkevich.task3.model.Randomizer;

public class Main {
    public static void main(String[] args) {
        int mood = Randomizer.getMood();
        String fase = MoodSensor.fase(mood);
        Print.out("Fase of user ", fase);
    }
}
