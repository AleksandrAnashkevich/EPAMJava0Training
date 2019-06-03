package by.epam.javatraining.aleksandranashkevich.task4.model;

public class Date {
    final private static int FIRST_DAY = 1;
    final private static int FEBRUARY = 2;
    final private static int APRIL = 4;
    final private static int JUNE = 6;
    final private static int SEPTEMBER = 9;
    final private static int NOVEMBER = 11;
    final private static int DECEMBER = 12;

    public static String getNextDate(int number, int month, int year) {
        String nextDate;
        if (checkdDate(number, month, year)) {
            nextDate = "Error Data";
        } else {
            if (month == FEBRUARY) {
                nextDate = dateOfFebrury(number, month, year);
            } else {
                nextDate = dateOfOtherMonth(number, month, year);
            }
        }
        return nextDate;
    }

    private static String newNumber(int number, int month, int year) {
        return ++number + "," + month + "," + year;
    }

    private static String newMonth(int month, int year) {
        return FIRST_DAY + "," + ++month + "," + year;
    }

    private static String newYear(int year) {
        return FIRST_DAY + "," + FIRST_DAY + "," + ++year;
    }

    private static String dateOfFebrury(int number, int month, int year) {
        String answer;
        boolean checkYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        if (((checkYear == true) && (number < 29)) || ((checkYear == false) && (number < 28))) {
            answer = newNumber(number, month, year);
        } else {
            answer = newMonth(month, year);
        }
        return answer;
    }

    private static String dateOfOtherMonth(int number, int month, int year) {
        String answer;
        if (((number == 31) && (month != DECEMBER)) || ((number == 30) && ((month == APRIL)
                || (month == JUNE) || (month == SEPTEMBER) || (month == NOVEMBER)))) {
            answer = newMonth(month, year);
        } else if ((number == 31) && (month == DECEMBER)) {
            answer = newYear(year);
        } else {
            answer = newNumber(number, month, year);
        }
        return answer;
    }

    private static boolean checkdDate(int day, int month, int year) {

        boolean check = false;

        if (day <= 0 || month <= 0 || day > 31 || month > 12) {
            check = true;
        } else {

            boolean checkYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
            if (month == FEBRUARY && ((!checkYear && day > 28) || (checkYear && day > 29))) {
                check = true;
            }
            if (day == 31) {
                if (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER) {
                    check = true;
                }
            }
        }
        return check;
    }

}
