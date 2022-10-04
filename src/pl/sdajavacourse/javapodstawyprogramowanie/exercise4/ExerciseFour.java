package pl.sdajavacourse.javapodstawyprogramowanie.exercise4;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;


public class ExerciseFour {
    public static void runExerciseFour() {
        System.out.println("In this exercise, the program gets from user an integer number and then displays all integers from 1 to input number changing the numbers divisible by 3 for \"pif\" and the numbers divisible by 7 for \"paf\" ");
        int number = StaticMethods.inputInteger();
        displayPifPaf(number);
    }

    private static void displayPifPaf(int number) {
        if (number >= 1) {
            for (int i = 0; i < number; i++) {
                checkPifPaf(i + 1);
            }
        } else {
            for (int i = 0; i >= number - 1; i--) {
                checkPifPaf(i + 1);
            }
        }
    }

    private static void checkPifPaf(int i) {
        if (i % 21 == 0) {
            System.out.println("pif paf");
        } else if (i % 3 == 0) {
            System.out.println("pif");
        } else if (i % 7 == 0) {
            System.out.println("paf");
        } else System.out.println(i);
    }
}
