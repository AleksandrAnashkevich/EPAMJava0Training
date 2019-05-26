package numeral;

public class Numeral {
    public static int numeralOfNumber(int number, int numeral) {
        return (int) (number / Math.pow(10, numeral - 1)) % 10;
    }
}
