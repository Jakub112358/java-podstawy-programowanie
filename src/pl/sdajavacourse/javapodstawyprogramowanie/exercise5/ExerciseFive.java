package pl.sdajavacourse.javapodstawyprogramowanie.exercise5;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

public class ExerciseFive {
    public static void runExerciseFive() {
        System.out.println("In this exercise, the program displays prime numbers smaller than input integer");
        int inputInteger = StaticMethods.inputInteger(1);
        System.out.printf("prime numbers < %d are %n", inputInteger);
        displayPrimeNumbers(inputInteger);
    }

    private static void displayPrimeNumbers(int number) {
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean isPrime(int checkingSingleNumber) {
        for (int i = 2; i < checkingSingleNumber; i++) {
            if (checkingSingleNumber % (i) == 0) {
                return false;
            }
        }
        return true;
    }
}
