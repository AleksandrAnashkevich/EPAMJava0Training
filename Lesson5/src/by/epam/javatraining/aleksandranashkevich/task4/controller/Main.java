package by.epam.javatraining.aleksandranashkevich.task4.controller;

import by.epam.javatraining.aleksandranashkevich.task4.model.Date;
import by.epam.javatraining.aleksandranashkevich.task4.view.Print;

public class Main {
    public static void main(String[] args){
        int number=30, month=4, year=12;
        String nextDate=Date.getNextDate(number,month,year);
        Print.out("Next day:",nextDate);
    }
}
