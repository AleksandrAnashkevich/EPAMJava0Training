package task3.util;

public class Copmparison {
    public static boolean equalityAscending(int number) {

        int numeral1=number%10;
        number/=10;

        int numeral2=number%10;
        number/=10;

        int numeral3=number%10;
        number/=10;

        int numeral4=number%10;

                /*
        for (int i=0; i<=3; i++){
            numeral[i]= number % 10;//another variant
            number /= 10;
         }
         */

        return (numeral1 > numeral2) && (numeral2 > numeral3) && (numeral3 > numeral4);
    }
}
