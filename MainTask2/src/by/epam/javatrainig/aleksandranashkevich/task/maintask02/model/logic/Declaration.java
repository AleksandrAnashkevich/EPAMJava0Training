package by.epam.javatrainig.aleksandranashkevich.task.maintask02.model.logic;

import by.epam.javatrainig.aleksandranashkevich.task.maintask02.model.logic.Taxes;

import java.util.Objects;

public class Declaration {
    private int number;
    private Taxes.IncomeMainTax income;
    private Taxes.IncomeOtherTax incomeOtherSourse;
    private Taxes.RewardTax incomeReward;
    private Taxes.SalesTax incomeSales;
    private Taxes.PresentTax incomePresent;
    private Taxes.TransferTax incomeTransfer;
    private double sumTax;


    public Declaration() {
        this.number = 0;

    }

    public Declaration(int number, Taxes.IncomeMainTax income, Taxes.IncomeOtherTax incomeOtherSourse,
                       Taxes.RewardTax incomeReward, Taxes.SalesTax incomeSales, Taxes.PresentTax incomePresent,
                       Taxes.TransferTax incomeTransfer) {
        this.number = number;
        this.income = income;
        this.incomeOtherSourse = incomeOtherSourse;
        this.incomeReward = incomeReward;
        this.incomeSales = incomeSales;
        this.incomePresent = incomePresent;
        this.incomeTransfer = incomeTransfer;
        sumTax = countSumTax();

    }

    private double countSumTax() {
        return income.getTax() + incomeOtherSourse.getTax() + incomeReward.getTax() + incomeSales.getTax()
                + incomePresent.getTax() + incomeTransfer.getTax();
    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setIncome(Taxes.IncomeMainTax income) {
        this.income = income;
    }

    public Taxes.IncomeMainTax getIncome() {
        return income;
    }

    public void setIncomeOtherSourse(Taxes.IncomeOtherTax incomeOtherSourse) {
        this.incomeOtherSourse = incomeOtherSourse;
    }

    public Taxes.IncomeOtherTax getIncomeOtherSourse() {
        return incomeOtherSourse;
    }

    public void setIncomeReward(Taxes.RewardTax incomeReward) {
        this.incomeReward = incomeReward;
    }

    public Taxes.RewardTax getIncomeReward() {
        return incomeReward;
    }

    public void setIncomeSales(Taxes.SalesTax incomeSales) {
        this.incomeSales = incomeSales;
    }

    public Taxes.SalesTax getIncomeSales() {
        return incomeSales;
    }

    public void setIncomePresent(Taxes.PresentTax incomePresent) {
        this.incomePresent = incomePresent;
    }

    public Taxes.PresentTax getIncomePresent() {
        return incomePresent;
    }

    public void setIncomeTransfer(Taxes.TransferTax incomeTransfer) {
        this.incomeTransfer = incomeTransfer;
    }

    public Taxes.TransferTax getIncomeTransfer() {
        return incomeTransfer;
    }

    public void setSumTax(double sumTax) {
        this.sumTax = sumTax;
    }

    public double getSumTax() {
        return sumTax;
    }


    @Override
    public String toString() {
        return " " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Declaration that = (Declaration) o;
        return number == that.number &&
                Double.compare(that.sumTax, sumTax) == 0 &&
                Objects.equals(income, that.income) &&
                Objects.equals(incomeOtherSourse, that.incomeOtherSourse) &&
                Objects.equals(incomeReward, that.incomeReward) &&
                Objects.equals(incomeSales, that.incomeSales) &&
                Objects.equals(incomePresent, that.incomePresent) &&
                Objects.equals(incomeTransfer, that.incomeTransfer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, income, incomeOtherSourse, incomeReward, incomeSales,
                incomePresent, incomeTransfer, sumTax);
    }
}
