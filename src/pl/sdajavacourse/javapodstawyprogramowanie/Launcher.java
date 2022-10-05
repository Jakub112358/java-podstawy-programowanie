package pl.sdajavacourse.javapodstawyprogramowanie;

import pl.sdajavacourse.javapodstawyprogramowanie.exercise1.ExerciseOne;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise3.ExerciseThree;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise2.ExerciseTwo;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise4.ExerciseFour;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise5.ExerciseFive;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise6.ExerciseSix;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise7.ExerciseSeven;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise8.ExerciseEight;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise20.ExerciseTwenty;
import pl.sdajavacourse.javapodstawyprogramowanie.extratask5.ExtraTaskFive;
import pl.sdajavacourse.javapodstawyprogramowanie.extratask6.ExtraTaskSix;
import pl.sdajavacourse.javapodstawyprogramowanie.extratask7.ExtraTaskSeven;


public class Launcher {
    final public static int numberOfExercises = 23;

    public static void main(String[] args) {
        System.out.println("""
                set exercise number:
                1 - circle circumference
                2 - BMI
                3 - quadratic real equation
                4 - PIF PAF
                5 - prime numbers
                6 - harmonic series
                7 - Fibonacci number
                8 - calculator
                21 - reverted array
                22 - removing repeating numbers in array
                23 - subtracting min and max element in array
                """);

        int exerciseNumber = StaticMethods.inputInteger(1,numberOfExercises);
      //  int exerciseNumber = 1;
        System.out.println("exerciseNumber = " + exerciseNumber);
        switch (exerciseNumber) {
            case 1 -> ExerciseOne.runExerciseOne();
            case 2 -> ExerciseTwo.runExerciseTwo();
            case 3 -> ExerciseThree.runExerciseThree();
            case 4 -> ExerciseFour.runExerciseFour();
            case 5 -> ExerciseFive.runExerciseFive();
            case 6 -> ExerciseSix.runExerciseSix();
            case 7 -> ExerciseSeven.runExerciseSeven();
            case 8 -> ExerciseEight.runExerciseEight();
            case 20 -> ExerciseTwenty.runExerciseTwenty();
            case 21 -> ExtraTaskFive.runExtraTaskFive();
            case 22 -> ExtraTaskSix.runExtraTaskSix();
            case 23 -> ExtraTaskSeven.runExtraTaskSeven();
            default -> {
            }
        }
    }

}
