package by.epam.javatraining.aleksandranashkevich.task2.controller;

import by.epam.javatraining.aleksandranashkevich.task2.model.Letter;
import by.epam.javatraining.aleksandranashkevich.task2.view.Print;

public class Main {
    public static void main(String[] args) {
        char letter = 'u';
        boolean answer = Letter.check(letter);
        Print.out("it is voves: ", answer);
    }
}
