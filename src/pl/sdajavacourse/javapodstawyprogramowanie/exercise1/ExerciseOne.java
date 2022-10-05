package pl.sdajavacourse.javapodstawyprogramowanie.exercise1;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;


public class ExerciseOne {
    private static final double approxPi = 3.14f;
    private static final double systemPi = Math.PI;

    public static void runExerciseOne() {
        System.out.println("In this exercise, the program displays the circumference of circle with a given diameter using PI = 3.14 and PI approximation from class Math");
        float diameter = StaticMethods.inputFloat(0);
        displayCircumference(diameter, approxPi);
        displayCircumference(diameter, systemPi);
    }

    private static void displayCircumference(float diameter, double piNumber) {
        double circumference = piNumber * diameter;
        System.out.printf("circumference of circle with diameter %f equals %f for PI approximation = %f %n", diameter, circumference, piNumber);
    }

}
