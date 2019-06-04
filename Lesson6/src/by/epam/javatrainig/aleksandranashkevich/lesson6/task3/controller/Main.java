package by.epam.javatrainig.aleksandranashkevich.lesson6.task3.controller;

import by.epam.javatrainig.aleksandranashkevich.lesson6.task3.model.Factorial;
import by.epam.javatrainig.aleksandranashkevich.lesson6.task3.view.Print;

public class Main {
    public static void main(String[] args) {
        int number = 5;

        int factorial = Factorial.count(number);

        Print.out("Factorial of number=", factorial);
    }
}
