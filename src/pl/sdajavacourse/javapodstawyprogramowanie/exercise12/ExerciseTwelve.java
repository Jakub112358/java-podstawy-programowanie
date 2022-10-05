package pl.sdajavacourse.javapodstawyprogramowanie.exercise12;

//Napisz program, który pobierze od użytkownika tekst (zmienną typu String) i
//        policzy jakim procentem wszystkich znaków tekstu był znak spacji, czyli
//        wzor

import java.util.Scanner;

public class ExerciseTwelve {
    public static void runExerciseTwelve() {
        System.out.println("plumpampam");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
int counter = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i)==' '){
                counter++;
            }
        }
        double percent = 100.0 * counter/inputString.length();
        System.out.printf("the total number of spaces is %d and equals %f %% of all chars (%d)", counter, percent, inputString.length());

    }
}
