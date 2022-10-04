package pl.sdajavacourse.javapodstawyprogramowanie.exercise1;

import java.util.Scanner;

public class ExerciseOne {
    private static final double approxPi = 3.14f;
    private static final double systemPi = Math.PI;
    private static Scanner scanner = new Scanner(System.in);

    public static void runExerciseOne() {
        System.out.println("In this exercise, the program displays the circumference of circle with a given diameter using PI = 3.14 and PI approximation from class Math");
        float diameter = setDiameter();
        displayCircumference(diameter, approxPi);
        displayCircumference(diameter, systemPi);
    }

    private static float setDiameter() {
        System.out.println("set diameter in decimal format");
        String diameterInput = scanner.nextLine();
        float diameter = 0;
        try {
            diameter = Float.parseFloat(diameterInput);
        } catch (Exception e) {
            System.out.println("incorrect diameter format");
            diameter = setDiameter();
        }
        if (diameter < 0) {
            System.out.println("diameter cannot be negative number");
            diameter = setDiameter();
        }
        return diameter;
    }

    private static void displayCircumference(float diameter, double piNumber) {
        double circumference = piNumber * diameter;
        System.out.printf("circumference of circle with diameter %f equals %f for PI approximation = %f %n", diameter, circumference, piNumber);
    }

}
