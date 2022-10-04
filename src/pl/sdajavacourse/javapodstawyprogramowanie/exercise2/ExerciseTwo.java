package pl.sdajavacourse.javapodstawyprogramowanie.exercise2;

import java.util.Scanner;

public class ExerciseTwo {

    public static void runExerciseTwo() {
        System.out.println("In this exercise, the program calculates BMI and compares the result with WHO standards");
        float weight = setWeight();
        int height = setHeight();
        System.out.println("weight = " + weight + " kilograms");
        System.out.println("height = " + height + " centimeters");
        compareBmi(calculateBmi(weight, height));
    }

    private static float setWeight() {
        Scanner scanner = new Scanner(System.in);
        float weight = 0;
        while (weight <= 0) {
            System.out.println("set weight in kilograms");
            String weightInput = scanner.nextLine();
            try {
                weight = Float.parseFloat(weightInput);
            } catch (Exception e) {
                System.out.println("wrong input format");
            }
        }
        return weight;
    }


    private static int setHeight() {
        int height = 0;
        Scanner scanner = new Scanner(System.in);
        String heightInput;
        while (height <= 0) {
            System.out.println("set height in centimeter as integer ");
            heightInput = scanner.nextLine();
            try {
                height = Integer.parseInt(heightInput);
            } catch (Exception e) {
                System.out.println("wrong input format");
            }
        }
        return height;
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
