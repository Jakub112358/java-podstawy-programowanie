package pl.sdajavacourse.javapodstawyprogramowanie;

import pl.sdajavacourse.javapodstawyprogramowanie.exercise1.ExerciseOne;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise11.ExerciseEleven;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise12.ExerciseTwelve;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise3.ExerciseThree;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise2.ExerciseTwo;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise4.ExerciseFour;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise5.ExerciseFive;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise6.ExerciseSix;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise7.ExerciseSeven;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise8.ExerciseEight;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise20.ExerciseTwenty;
import pl.sdajavacourse.javapodstawyprogramowanie.exercise9.ExerciseNine;
import pl.sdajavacourse.javapodstawyprogramowanie.extratask1.ExtraTaskOne;
import pl.sdajavacourse.javapodstawyprogramowanie.extratask2.ExtraTaskTwo;
import pl.sdajavacourse.javapodstawyprogramowanie.extratask3.ExtraTaskThree;
import pl.sdajavacourse.javapodstawyprogramowanie.extratask4.ExtraTaskFour;
import pl.sdajavacourse.javapodstawyprogramowanie.extratask5.ExtraTaskFive;
import pl.sdajavacourse.javapodstawyprogramowanie.extratask6.ExtraTaskSix;


public class Launcher {
    final public static int numberOfExercises = 25;
    public static void main(String[] args) {
//        System.out.println("""
//                set exercise number:
//                1 - circle circumference
//                2 - BMI
//                3 - quadratic real equation
//                4 - PIF PAF
//                5 - prime numbers
//                6 - harmonic series
//                7 - Fibonacci number
//                8 - calculator
//                9 - wave
//                11 - string "starczy"
//                20 - guess number
//                21 - reverted array
//                22 - removing repeating numbers in array
//                23 - subtracting min and max element in array
//                24 - sum in array
//                """);

      //  int exerciseNumber = StaticMethods.inputInteger(1,numberOfExercises);
        int exerciseNumber = 26;
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
            case 9 -> ExerciseNine.runExerciseNine();
            case 11 -> ExerciseEleven.runExerciseEleven();
            case 12 -> ExerciseTwelve.runExerciseTwelve();
            case 20 -> ExerciseTwenty.runExerciseTwenty();
            case 21 -> ExtraTaskOne.runExtraTaskOne();
            case 22 -> ExtraTaskTwo.runExtraTaskTwo();
            case 23 -> ExtraTaskThree.runExtraTaskThree();
            case 24 -> ExtraTaskFour.runExtraTaskFour();
            case 25 -> ExtraTaskFive.runExtraTaskFive();
            case 26 -> ExtraTaskSix.runExtraTaskSix();
            default -> {
            }
        }
    }

}
