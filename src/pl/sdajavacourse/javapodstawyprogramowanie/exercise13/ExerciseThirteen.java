package pl.sdajavacourse.javapodstawyprogramowanie.exercise13;

import java.util.Scanner;

public class ExerciseThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        if (inputString.equals("")) System.exit(0);

        String[] splitedString = inputString.split(" ");

        for (String s : splitedString) {
            System.out.print(s + " " + s + " ");
        }
    }
}
