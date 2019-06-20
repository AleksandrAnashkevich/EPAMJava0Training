package by.epam.javatrainig.aleksandranashkevich.task.maintask02.model.logic;

public class Taxes {
    public static abstract class Tax {
        double INCOME_RATE = 0.13;
        double REWARD_RATE = 0.15;
        double SALES_RATE = 0.13;
        double PRESENT_RATE = 0.13;
        double TRANSFER_RATE = 0.15;
        double SUM_PRESENT = 5555;
        double SUM_TRANSFER = 5555;

        private double income;
        private double tax;

        public Tax(double income) {
            this.income = income;
        }

        public void setIncome(double income) {
            if (income >= 0) {
                this.income = income;
            }
        }

        public double getIncome() {
            return income;
        }

        public abstract double countTax(double income);

    }

    public static class IncomeMainTax extends Tax {
        private double tax;

        public IncomeMainTax(double income) {
            super(income);
            tax = countTax(income);
        }

        @Override
        public double countTax(double income) {
            return income * INCOME_RATE;
        }

        public void setTax(double tax) {
            if (tax >= 0) {
                this.tax = tax;
            }
        }

        public double getTax() {
            return tax;
        }
    }

    public static class IncomeOtherTax extends Tax {
        private double tax;

        public IncomeOtherTax(double income) {
            super(income);
            tax = countTax(income);
        }

        @Override
        public double countTax(double income) {
            return income * INCOME_RATE;
        }

        public void setTax(double tax) {
            if (tax >= 0) {
                this.tax = tax;
            }
        }

        public double getTax() {
            return tax;
        }
    }

    public static class RewardTax extends Tax {
        private double tax;

        public RewardTax(double income) {
            super(income);
            tax = countTax(income);
        }

        @Override
        public double countTax(double income) {
            return income * REWARD_RATE;
        }

        public void setTax(double tax) {
            if (tax >= 0) {
                this.tax = tax;
            }
        }

        public double getTax() {
            return tax;
        }
    }

    public static class SalesTax extends Tax {
        private double tax;

        public SalesTax(double income) {
            super(income);
            tax = countTax(income);
        }

        @Override
        public double countTax(double income) {
            return income * SALES_RATE;
        }

        public void setTax(double tax) {
            if (tax >= 0) {
                this.tax = tax;
            }
        }

        public double getTax() {
            return tax;
        }
    }

    public static class PresentTax extends Tax {
        private double tax;

        public PresentTax(double income) {
            super(income);
            tax = countTax(income);
        }

        @Override
        public double countTax(double income) {
            return income > SUM_PRESENT ? income * PRESENT_RATE : 0;
        }

        public void setTax(double tax) {
            if (tax >= 0) {
                this.tax = tax;
            }
        }

        public double getTax() {
            return tax;
        }
    }

    public static class TransferTax extends Tax {
        private double tax;

        public TransferTax(double income) {
            super(income);
            tax = countTax(income);
        }

        @Override
        public double countTax(double income) {
            return income > SUM_TRANSFER ? income * TRANSFER_RATE : 0;
        }

        public void setTax(double tax) {
            if (tax >= 0) {
                this.tax = tax;
            }
        }

        public double getTax() {
            return tax;
        }
    }
}

