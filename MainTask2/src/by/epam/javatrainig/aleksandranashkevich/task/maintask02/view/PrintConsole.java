package by.epam.javatrainig.aleksandranashkevich.task.maintask02.view;

import by.epam.javatrainig.aleksandranashkevich.task.maintask02.model.logic.Declaration;

public class PrintConsole {
    public static void out(Declaration[] list) {
        for (int i=0; i<list.length; i++){
            System.out.println(list[i].toString());
        }
    }
}
