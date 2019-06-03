package by.epam.javatraining.aleksandranashkevich.task2.model;

public class Letter {
    public static boolean check(char c) {
        return c == '\u0041' || c == '\u0045' || c == '\u0049' || c == '\u004a' || c == '\u004f'
                || c == '\u0055' || c == '\u0059' || c == '\u0061' || c == '\u0065' || c == '\u0069'
                || c == '\u006a' || c == '\u006f' || c == '\u0075' || c == '\u0079';
    }
    /*
    public static boolean check1(char c) {
        return c == 'a' || c == 'e' || c == 'y' || c == 'u' || c == 'i' || c == 'o' || c == 'j'
                || c == 'A' || c == 'E' || c == 'Y' || c == 'U' || c == 'I' || c == 'O'
                || c == 'J';
    }

    public static boolean check2(char c) {
        char[] Vowels = {'a', 'e', 'y', 'u', 'i', 'o', 'j', 'A', 'E', 'Y', 'U', 'I', 'O', 'J'};
        boolean answer = false;
        for (int i = 0; i < Vowels.length; i++) {
            if (Vowels[i] == c) {
                answer = true;
                break;
            }
        }
        return answer;
    }
    */

}
