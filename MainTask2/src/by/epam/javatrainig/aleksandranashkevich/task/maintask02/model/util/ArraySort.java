package by.epam.javatrainig.aleksandranashkevich.task.maintask02.model.util;


import by.epam.javatrainig.aleksandranashkevich.task.maintask02.model.logic.Declaration;

public class ArraySort {
    public static void sort(Declaration[] list) {
        boolean sort = true;
        int n = 0;
        while (sort) {
            sort = false;
            for (int i = 0; i < list.length - 1 - n; i++) {
                if (list[i].getSumTax() < list[i + 1].getSumTax()) {
                    sort = true;
                    Declaration temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
            n++;
        }
    }
}
