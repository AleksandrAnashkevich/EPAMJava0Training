package by.epam.javatraining.aleksandranashkevich.maintask1.model;

import java.util.Arrays;

public class VectorLogic {

    public static double[] add(double[] vector, double newElement) {
        double[] newVector = new double[vector.length + 1];
        for (int i = 0; i < vector.length; i++) {
            newVector[i] = vector[i];
        }
        newVector[newVector.length - 1] = newElement;
        return newVector;
    }

    public static double findMax(double... vector) {
        double min = vector[0];
        for (int i = 1; i < vector.length; i++) {
            min = min < vector[i] ? vector[i] : min;
        }
        return min;
    }

    public static double findMin(double... vector) {
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

    public static boolean checkSequence(double... vector) {
        boolean flag = vector[1] > vector[0];
        boolean answer = true;
        for (int i = 1; i < vector.length - 1; i++) {
            if ((vector[i + 1] > vector[i]) != flag) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static int toSearchLinearn(double vector[], double elementToSearch) {

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == elementToSearch)
                return i;
        }
        return -1;
    }

    public static int toSearchBinary(double vector[], double elementToSearch) {

        int left = 0;
        int right = vector.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (vector[middle] == elementToSearch) {
                return middle;
            } else if (vector[middle] < elementToSearch)
                left = middle + 1;


            else if (vector[middle] > elementToSearch)
                right = middle - 1;

        }
        return -1;
    }

    public static double[] toRevers(double... vector) {
        for (int i = 0; i < vector.length / 2; i++) {
            toSwap(i, vector.length - 1 - i, vector);
        }
        return vector;
    }

    public static double findLocalMax(double... vector) {
        double max = -1;
        for (int i = 1; i < vector.length - 1; i++) {
            if ((vector[i] > vector[i - 1]) && (vector[i] > vector[i + 1])) {
                max = vector[i];
                break;
            }
        }
        return max;
    }

    public static double findLocalMin(double... vector) {
        double min = -1;
        for (int i = 1; i < vector.length - 1; i++) {
            if ((vector[i] < vector[i - 1]) && (vector[i] < vector[i + 1])) {
                min = vector[i];
                break;
            }
        }
        return min;
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


    public static double[] toSortSelection(double... vector) {
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

    public static double[] toSortInsertion(double... vector) {
        for (int left = 0; left < vector.length; left++) {
            double value = vector[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < vector[i]) {
                    vector[i + 1] = vector[i];
                } else {
                    break;
                }
            }
            vector[i + 1] = value;
        }
        return vector;
    }

    public static double[] toSortMerge(double[] arr) {
        if(arr.length < 2) return arr;
        int m = arr.length / 2;
        double[] arr1 = Arrays.copyOfRange(arr, 0, m);
        double[] arr2 = Arrays.copyOfRange(arr, m, arr.length);
        return merge(toSortMerge(arr1), toSortMerge(arr2));
    }
    //слияние двух массивов в один отсортированный
    public static double[] merge(double[] arr1,double arr2[]){
        int n = arr1.length + arr2.length;
        double [] arr = new double[n];
        int i1=0;
        int i2=0;
        for(int i=0;i<n;i++){
            if(i1 == arr1.length){
                arr[i] = arr2[i2++];
            }else if(i2 == arr2.length){
                arr[i] = arr1[i1++];
            }else{
                if(arr1[i1] < arr2[i2]){
                    arr[i] = arr1[i1++];
                }else{
                    arr[i] = arr2[i2++];
                }
            }
        }
        return arr;
    }

    public static double[] toSortQuick(double[] vector, int left, int right) {
        int i = left;
        int j = right;
        double h = vector[(i + j) / 2];
        do {
            while (vector[i] < h) {
                i++;
            }
            while (vector[j] > h) {
                j--;
            }
            if (i <= j) {
                if (i < j) {
                    toSwap(i, j, vector);
                }
                i++;
                j--;
            }
        } while (i <= j);

        if (i < right) {
            toSortQuick(vector, i, right);
        }
        if (left < j) {
            toSortQuick(vector, left, j);
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
