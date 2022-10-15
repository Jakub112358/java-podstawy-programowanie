package pl.sdajavacourse.javapodstawyprogramowanie.exercise14;

import java.util.Arrays;
import java.util.Scanner;

//Napisz program, który pobierze od użytkownika dwie małe litery alfabetu łacińskiego (typ char) i wyliczy, ile znaków stoi
// w alfabecie pomiędzy podanymi literami. Podpowiedź – skorzystaj z tablicy kodów ASCII i traktuj znaki jak liczby int.
public class ExerciseFourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inputChars = new char[2];
        int difference = 0;
        for (int i = 0; i < inputChars.length; i++) {
            System.out.print("input char a-z: ");
            inputChars[i] = scanner.next().charAt(0);
            if (inputChars[i] < 97 || inputChars[i] > 122) {
                System.out.println("wrong input");
                System.exit(0);
            }
        }
        if (inputChars[0] == inputChars[1]) {
            System.out.println("Input chars are equal.");
        } else {
            difference = Math.abs(inputChars[1] - inputChars[0]) - 1;
        }
        System.out.printf("there is %d letter(s) between %s", difference, Arrays.toString(inputChars));
    }
}
