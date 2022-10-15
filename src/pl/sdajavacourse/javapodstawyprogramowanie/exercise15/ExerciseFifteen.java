package pl.sdajavacourse.javapodstawyprogramowanie.exercise15;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

import java.util.Arrays;

public class ExerciseFifteen {
    public static void main(String[] args) {
        int[] inputInteger = inputIntArray();
        Arrays.sort(inputInteger);
        int checker = inputInteger[0] - 1;
        for (int i = 0; i < inputInteger.length - 1; i++) {
            if (inputInteger[i] == inputInteger[i + 1]) {
                if (checker != inputInteger[i]) {
                    System.out.println(inputInteger[i]);
                    checker = inputInteger[i];
                }
            }
        }
    }

    static private int[] inputIntArray() {
        int arraySize = 10;
        int[] integerArray = new int[arraySize];
        for (int i = 0; i < integerArray.length; i++) {
            System.out.printf("input element number %d :", i + 1);
            integerArray[i] = StaticMethods.inputInteger();
        }
        return integerArray;
    }
}
