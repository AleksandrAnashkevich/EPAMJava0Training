package by.epam.javatraining.aleksandranashkevich.maintask1.controller;

import by.epam.javatraining.aleksandranashkevich.maintask1.model.VectorLogic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] vector = {2, 4, 6, 8, 10, 11, 13, 14};

        vector = VectorLogic.add(vector, 15);

        System.out.println(Arrays.toString(vector));
    }
}
