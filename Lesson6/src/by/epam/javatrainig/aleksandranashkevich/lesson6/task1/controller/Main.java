package by.epam.javatrainig.aleksandranashkevich.lesson6.task1.controller;

import by.epam.javatrainig.aleksandranashkevich.lesson6.task1.model.HeadsOrTails;
import by.epam.javatrainig.aleksandranashkevich.lesson6.task1.view.Print;

public class Main {
    public static void main(String[] args) {
        int toss = 1000;

        int head = HeadsOrTails.countHead(toss);
        int tail = toss - head;

        Print.out("Head drop", head);
        Print.out("Tail drop", tail);
    }
}
