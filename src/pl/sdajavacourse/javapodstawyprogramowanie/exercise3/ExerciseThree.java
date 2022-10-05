package pl.sdajavacourse.javapodstawyprogramowanie.exercise3;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;


public class ExerciseThree {

    public static void runExerciseThree() {
        System.out.println("In this exercise, the program solves quadratic real equation \"Ax^2 + Bx + C = 0\" with floating factors");
        printResults(solveEquation(setEquationFactors()));

    }


    private static double[] setEquationFactors() {
        double[] equationFactor = new double[3];
        for (int i = 0; i < equationFactor.length; i++) {
            System.out.printf("set equation factor " + (char)(65+i) + ": ");
            equationFactor[i] = StaticMethods.inputDouble();
        }
        return equationFactor;

    }

    private static double[] solveEquation(double[] equationFactor) {
        double[] result = new double[2];
        double delta = equationFactor[1] * equationFactor[1] - 4 * equationFactor[0] * equationFactor[2];
        if (delta > 0) {
            result[0] = (-1 * equationFactor[1] - Math.sqrt( delta)) / (2 * equationFactor[0]);
            result[1] = (-1 * equationFactor[1] + Math.sqrt( delta)) / (2 * equationFactor[0]);
        } else {
            System.out.println("delta < 0");
            System.exit(0);
        }

        return result;
    }

    private static void printResults (double[] results){
        System.out.printf("The roots of the equation are %f and %f", results[0], results[1]);
    }

}
