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


public class Launcher {
    final public static int numberOfExercises = 20;

    public static void main(String[] args) {
        ExerciseEight.runExerciseEight();
        int exerciseNumber = StaticMethods.setExerciseNumber();
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
            default -> {
            }
        }
    }

}
