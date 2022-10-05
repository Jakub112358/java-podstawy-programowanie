package pl.sdajavacourse.javapodstawyprogramowanie.exercise9;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

public class ExerciseNine {
    public static void runExerciseNine(){
        System.out.println("hello");
        int waveLength = StaticMethods.inputInteger(1);
        displayWave(waveLength, 1,0);
        displayWave(waveLength, 2,7);
        displayWave(waveLength, 3,6);
        displayWave(waveLength, 4,5);
    }

    private static void displayWave(int waveLength, int rest1, int rest2) {
        for (int i = 1; i <= waveLength; i++) {
            if (i%8 == rest1 || i%8 == rest2){
                System.out.print ("*");
            }
            else
                System.out.print(" ");
        }
        System.out.println();
    }
}
