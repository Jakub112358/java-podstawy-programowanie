package pl.sdajavacourse.javapodstawyprogramowanie.exercise2;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;


public class ExerciseTwo {

    public static void runExerciseTwo() {
        System.out.println("In this exercise, the program calculates BMI and compares the result with WHO standards");
        System.out.print("input weight in kilograms: ");
        float weight = StaticMethods.inputFloat(0);
        System.out.print("input height in centimeters: ");
        int height = StaticMethods.inputInteger(1);
        System.out.println("weight = " + weight + " kilograms");
        System.out.println("height = " + height + " centimeters");
        compareBmi(calculateBmi(weight, height));
    }

    private static double calculateBmi(float weight, int height) {
        return weight / Math.pow(height / 100.0, 2);
    }

    private static void compareBmi(double bmi) {
        if (bmi < 18.5) {
            System.out.printf("BMI equals %f and means underweight", bmi);
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.printf("BMI equals %f and means healthy weight", bmi);
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.printf("BMI equals %f and means overweight", bmi);
        } else {
            System.out.printf("BMI equals %f and means obesity", bmi);
        }
    }
}
