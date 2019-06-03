package by.epam.javatraining.aleksandranashkevich.task1.controller;

import by.epam.javatraining.aleksandranashkevich.task1.model.Head;
import by.epam.javatraining.aleksandranashkevich.task1.viev.Print;

public class Main {
    public static void main(String[] args) {
        int year1 = 150;
        int head1 = Head.numberOf(year1);
        Print.out("Number of head ", head1);
    }
}
