package task5.util;


public class Revers {
    public static int reversOfNumber(int number) {
        int numberRevers=number%10;

        number /=10;
        numberRevers *=10;
        numberRevers +=number%10;
        number /=10;
        numberRevers *=10;
        numberRevers +=number%10;
        number /=10;
        numberRevers *=10;
        numberRevers +=number%10;
        number /=10;
        numberRevers *=10;
        numberRevers +=number%10;
        number /=10;
        numberRevers *=10;
        numberRevers +=number%10;
        number /=10;
        numberRevers *=10;
        numberRevers +=number%10;
        /*
        for (int i=0; i<=5; i++){
            number /=10;
            numberRevers *=10;
            numberRevers +=number%10;  //another vaiant
            }

        */

        return numberRevers;

    }
}
