package by.epam.javatrainig.aleksandranashkevich.lesson6.task5.controller;

import by.epam.javatrainig.aleksandranashkevich.lesson6.task5.model.PrimeNumber;
import by.epam.javatrainig.aleksandranashkevich.lesson6.task5.view.Print;

public class Main {
    public static void main(String[] args) {
        int number = 3;

        boolean answer =PrimeNumber.checkOf(number);

        Print.out("is is prime number ", answer);
    }
}
