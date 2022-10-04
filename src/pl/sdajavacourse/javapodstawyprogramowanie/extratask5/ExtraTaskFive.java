package pl.sdajavacourse.javapodstawyprogramowanie.extratask5;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

import java.util.Arrays;

public class ExtraTaskFive {
    public static void runExtraTaskFive() {
        System.out.println("This program inverts elements of an array");
        int[] inputArray = StaticMethods.inputIntArray();
        System.out.println("array before being reverted: " + Arrays.toString(inputArray));
        int[] revertedArray = reverseArray(inputArray);
        System.out.println("reverted array" + Arrays.toString(revertedArray));
    }

    private static int[] reverseArray(int[] inputArray) {
        int[] result = new int[inputArray.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = inputArray [inputArray.length-i-1];
        }
        return result;
    }
}
