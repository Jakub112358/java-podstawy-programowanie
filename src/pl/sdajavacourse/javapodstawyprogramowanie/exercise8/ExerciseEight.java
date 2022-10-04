package pl.sdajavacourse.javapodstawyprogramowanie.exercise8;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

public class ExerciseEight {
    public static void runExerciseEight() {
        System.out.println("In this exercise, the program adds, subtracts, multiplies or divides two float numbers");
        float firstFloat = StaticMethods.inputFloat();
        float secondFloat = StaticMethods.inputFloat();
        char mathOperation = StaticMethods.inputChar(new char[]{'+', '-', '*', '/'});

        switch (mathOperation) {
            case '+' ->
                    System.out.printf(firstFloat + " " + mathOperation + " " + secondFloat + " = " + (firstFloat + secondFloat));
            case '-' ->
                    System.out.printf(firstFloat + " " + mathOperation + " " + secondFloat + " = " + (firstFloat - secondFloat));
            case '*' ->
                    System.out.printf(firstFloat + " " + mathOperation + " " + secondFloat + " = " + (firstFloat * secondFloat));
            case '/' -> {
                if (secondFloat == 0) {
                    System.out.println("cannot divide by 0");
                } else
                    System.out.printf(firstFloat + " " + mathOperation + " " + secondFloat + " = " + (firstFloat / secondFloat));
            }
        }
    }
}
