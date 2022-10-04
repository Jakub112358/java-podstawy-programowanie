package pl.sdajavacourse.javapodstawyprogramowanie.exercise6;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

public class ExerciseSix {
    public static void runExerciseSix() {
        System.out.println("In this exercise, the program calculates the sum of the harmonic series with N units");
        int numberOfUnits = StaticMethods.inputInteger(1);
        System.out.printf("The sum of harmonic series with %d units is %f %n", numberOfUnits, calculateSum(numberOfUnits));

    }

    private static double calculateSum(int numberOfUnits) {
        double sum = 0;
        for (int i = 1; i <= numberOfUnits; i++) {
            sum += 1.0 / i ;
        }
        return sum;
    }
}
