package by.epam.javatraining.aleksandranashkevich.maintask1.model;

public class VectorLogic {

    public static double[] add(double[] vector, double newElement) {
        double[] newVector = new double[vector.length + 1];
        for (int i = 0; i < vector.length; i++) {
            newVector[i] = vector[i];
        }
        newVector[newVector.length - 1] = newElement;
        return newVector;
    }

    public static double findMin(double... vector) {
        double min = vector[0];
        for (int i = 1; i < vector.length; i++) {
            min = min < vector[i] ? vector[i] : min;
        }
        return min;
    }

    public static double findMax(double... vector) {
        double max = vector[0];
        for (int i = 1; i < vector.length; i++) {
            max = max > vector[i] ? vector[i] : max;
        }
        return max;
    }

    public static double findArithmeticalMean(double... vector) {
        double mean = vector[0];
        for (int i = 1; i < vector.length; i++) {
            mean += vector[i];
        }
        return mean / vector.length;
    }

    public static double findGeometricMean(double... vector) {
        double mean = vector[0];
        for (int i = 1; i < vector.length; i++) {
            mean *= vector[i];
        }
        return Math.pow(mean, 1. / vector.length);
    }

    public static double[] toRevers(double... vector) {
        for (int i = 0; i < vector.length / 2; i++) {
            toSwap(i, vector.length - 1 - i, vector);
        }
        return vector;
    }

    public static double[] toSortBubble(double... vector) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    isSorted = false;
                    toSwap(i, i + 1, vector);
                }
            }
        }
        return vector;
    }

    public static double[] toSortSelection(double... vector){
        for (int left = 0; left < vector.length; left++) {
            int min = left;
            for (int i = left; i < vector.length; i++) {
                if (vector[i] < vector[min]) {
                    min = i;
                }
            }
            toSwap(left, min, vector);
        }
        return vector;
    }

    

    private static double[] toSwap(int index1, int index2, double... vector) {
        double dp = vector[index1];
        vector[index1] = vector[index2];
        vector[index2] = dp;
        return vector;
    }
}
