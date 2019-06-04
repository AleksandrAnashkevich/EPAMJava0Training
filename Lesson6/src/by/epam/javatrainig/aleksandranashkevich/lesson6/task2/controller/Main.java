package by.epam.javatrainig.aleksandranashkevich.lesson6.task2.controller;

import by.epam.javatrainig.aleksandranashkevich.lesson6.task2.view.Print;
import by.epam.javatrainig.aleksandranashkevich.lesson6.task2.model.Sequence;

public class Main {
    public static void main(String[] args) {
        int number = 97531;

        boolean answer = Sequence.checkOf(number);

        Print.out("It is sequence ", answer);
    }
}
