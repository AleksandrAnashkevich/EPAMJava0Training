package by.epam.javatraining.aleksandranashkevich.maintask1.controller;

import by.epam.javatraining.aleksandranashkevich.maintask1.model.VectorLogic;
import by.epam.javatraining.aleksandranashkevich.maintask1.view.Print;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] vector = {10.0, 2.0, 10.0, 3.0, 1.0, 2.0, 5.0};


        double[] arr=VectorLogic.toSortMerge(vector);
        Print.out(Arrays.toString(arr));

        double min = VectorLogic.findMin(vector);
        Print.out("Min=" + min);

        double max = VectorLogic.findMax(vector);
        Print.out("Max=" + max);

        double arithmeticalMean = VectorLogic.findArithmeticalMean(vector);
        Print.out("Arithmetical Mean=" + arithmeticalMean);

        double geometricMean = VectorLogic.findGeometricMean(vector);
        Print.out("Geometric Mean=" + geometricMean);

        boolean check = VectorLogic.checkSequence(vector);
        Print.out("Sequence?=" + check);

        double[] reverse = VectorLogic.toRevers(vector);
        Print.out("Revers vector =" + Arrays.toString(reverse));

        double localMax = VectorLogic.findLocalMax(vector);
        Print.out("Local max=" + localMax);

        double localMin = VectorLogic.findLocalMin(vector);
        Print.out("Local min=" + localMin);


        double[] sortVector = VectorLogic.toSortBubble(vector);
        Print.out(("Sort=" + Arrays.toString(sortVector)));

        vector = VectorLogic.add(vector, 15);
        Print.out("New vector" + Arrays.toString(vector));



    }
}
