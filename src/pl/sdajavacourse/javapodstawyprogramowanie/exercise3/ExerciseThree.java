package pl.sdajavacourse.javapodstawyprogramowanie.exercise3;

import java.util.Scanner;

public class ExerciseThree {

    public static void runExerciseThree() {
        System.out.println("In this exercise, the program solves quadratic real equation with integer factors");
        printResults(solveEquation(setEquationFactors()));

    }

    private static int setSingleFactor() {
        //    String equationFactorInput;
        Scanner scanner = new Scanner(System.in);
        int equationFactor = 0;
        while (true) {
            System.out.println("Set equation factor as integer.");
            String equationFactorInput = scanner.nextLine();
            try {
                equationFactor = Integer.parseInt(equationFactorInput);
                break;
            } catch (Exception e) {
                System.out.println("wrong input format");
            }
        }
        return equationFactor;
    }

    private static int[] setEquationFactors() {
        int[] equationFactor = new int[3];
        for (int i = 0; i < equationFactor.length; i++) {
            equationFactor[i] = setSingleFactor();
        }
        return equationFactor;

    }

    private static double[] solveEquation(int[] equationFactor) {
        double[] result = new double[2];
        int delta = equationFactor[1] * equationFactor[1] - 4 * equationFactor[0] * equationFactor[2];
        if (delta > 0) {
            result[0] = (-1 * equationFactor[1] - Math.sqrt((double) delta)) / (2 * equationFactor[0]);
            result[1] = (-1 * equationFactor[1] + Math.sqrt((double) delta)) / (2 * equationFactor[0]);
        } else {
            System.out.println("delta ujemna");
            System.exit(0);
        }

        return result;
    }

    private static void printResults (double[] results){
        System.out.printf("The roots of the equation are %f and %f", results[0], results[1]);
    }

}
