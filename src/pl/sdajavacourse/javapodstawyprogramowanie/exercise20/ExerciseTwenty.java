package pl.sdajavacourse.javapodstawyprogramowanie.exercise20;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

import java.util.Random;

public class ExerciseTwenty {
    static private final Random rand = new Random();

    public static void runExerciseTwenty() {
        int minRandomNumber = 0;
        int maxRandomNumber = 100;
        System.out.println("Input number of tries");
        int numberOfTries = StaticMethods.inputInteger(1);
        int randomNumber = rand.nextInt(minRandomNumber, maxRandomNumber);
        System.out.println("randomNumber = " + randomNumber);

        for (int i = 0; i < numberOfTries; i++) {
            System.out.printf("try number %d: %n input number between %d and %d %n", i + 1, minRandomNumber, maxRandomNumber);
            checkInputNumber(randomNumber);
        }
        System.out.println("GAME OVER 😪 you used all tries :( ");

    }

    private static void checkInputNumber(int randomNumber) {
        int inputNumber = StaticMethods.inputInteger();
        if (inputNumber < randomNumber) {
            System.out.println("input is smaller than random number");
        } else if (inputNumber > randomNumber) {
            System.out.println("input is bigger than random number");
        } else {
            System.out.println("bingo! 😀 ");
            System.exit(0);
        }
    }
}
