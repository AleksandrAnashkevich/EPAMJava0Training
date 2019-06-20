package by.epam.javatrainig.aleksandranashkevich.task.maintask02.controller;

import by.epam.javatrainig.aleksandranashkevich.task.maintask02.model.logic.Taxes;
import by.epam.javatrainig.aleksandranashkevich.task.maintask02.model.logic.Declaration;
import by.epam.javatrainig.aleksandranashkevich.task.maintask02.model.util.ArraySort;
import by.epam.javatrainig.aleksandranashkevich.task.maintask02.view.PrintConsole;

public class Main {
    public static void main(String[] args){
        Declaration[] list= new Declaration[3];

        Taxes.IncomeMainTax incomeMainTax1= new Taxes.IncomeMainTax(2);
        Taxes.IncomeOtherTax incomeOtherTax1= new Taxes.IncomeOtherTax(2);
        Taxes.RewardTax rewardTax1=new Taxes.RewardTax(2);
        Taxes.SalesTax salesTax1=new Taxes.SalesTax(2);
        Taxes.PresentTax presentTax1=new Taxes.PresentTax(2);
        Taxes.TransferTax transferTax1=new Taxes.TransferTax(2);
        list[0]=new Declaration(1,incomeMainTax1, incomeOtherTax1, rewardTax1, salesTax1, presentTax1,
                transferTax1);

        Taxes.IncomeMainTax incomeMainTax2= new Taxes.IncomeMainTax(1);
        Taxes.IncomeOtherTax incomeOtherTax2= new Taxes.IncomeOtherTax(1);
        Taxes.RewardTax rewardTax2=new Taxes.RewardTax(1);
        Taxes.SalesTax salesTax2=new Taxes.SalesTax(1);
        Taxes.PresentTax presentTax2=new Taxes.PresentTax(1);
        Taxes.TransferTax transferTax2=new Taxes.TransferTax(1);
        list[1]=new Declaration(2,incomeMainTax2, incomeOtherTax2, rewardTax2, salesTax2, presentTax2,
                transferTax2);


        Taxes.IncomeMainTax incomeMainTax3= new Taxes.IncomeMainTax(3);
        Taxes.IncomeOtherTax incomeOtherTax3= new Taxes.IncomeOtherTax(3);
        Taxes.RewardTax rewardTax3=new Taxes.RewardTax(3);
        Taxes.SalesTax salesTax3=new Taxes.SalesTax(3);
        Taxes.PresentTax presentTax3=new Taxes.PresentTax(3);
        Taxes.TransferTax transferTax3=new Taxes.TransferTax(3);
        list[2]=new Declaration(3,incomeMainTax3, incomeOtherTax3, rewardTax3, salesTax3, presentTax3,
                transferTax3);

        ArraySort.sort(list);

        PrintConsole.out(list);

    }
}
