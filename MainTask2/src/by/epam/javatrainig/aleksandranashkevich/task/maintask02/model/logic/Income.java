package by.epam.javatrainig.aleksandranashkevich.task.maintask02.model.logic;

public class Income {
    private double income;

    public Income(double income){
        this.income=income;
    }

    public void setIncome(double income) {
        if (income >= 0) {
            this.income = income;
        }
    }

    public double getIncome() {
        return income;
    }
}
