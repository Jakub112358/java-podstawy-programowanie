package pl.sdajavacourse.javapodstawyprogramowanie.extratask2;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

import java.util.Arrays;

//Napisz program usuwający duplikaty z tablicy i zwracający nową tablicę
public class ExtraTaskTwo {
    public static void runExtraTaskTwo() {
        System.out.println("removing multiplied elements of an array");
        int[] inputArray = StaticMethods.inputIntArray();
        System.out.println(Arrays.toString(inputArray));

        while (checkMultipliedElementIndex(inputArray) != 0) {
            int multipliedIndex = checkMultipliedElementIndex(inputArray);
            inputArray = removeMultipliedElement(inputArray, multipliedIndex);
        }
        System.out.println(Arrays.toString(inputArray));
    }

    private static int[] removeMultipliedElement(int[] inputArray, int multipliedIndex) {
        int[] resultArray = new int[inputArray.length - 1];
        int k = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (i != multipliedIndex) {
                resultArray[k] = inputArray[i];
                k++;
            }
        }
        return resultArray;
    }


    private static int checkMultipliedElementIndex(int[] checkingArray) {
        for (int i = 0; i < checkingArray.length; i++) {
            for (int k = checkingArray.length - 1; k > i; k--) {
                if (checkingArray[i] == checkingArray[k]) {
                    return k;
                }
            }
        }
        return 0;
    }
}
