package by.epam.javatrainig.aleksandranashkevich.lesson6.task4.controller;

import by.epam.javatrainig.aleksandranashkevich.lesson6.task4.view.Print;
import by.epam.javatrainig.aleksandranashkevich.lesson6.task4.model.Parity;

public class Main {
    public static void main(String[] args) {
        int number = 97531;

        boolean answer = Parity.checkOfEquals(number);

        Print.out("It is parity ", answer);
    }
}
