package pl.sdajavacourse.javapodstawyprogramowanie.extratask1;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

import java.util.Arrays;
//Napisz program, który odwróci zawartość tablicy
public class ExtraTaskOne {
    public static void runExtraTaskOne() {
        System.out.println("This program inverts elements of an array");
        int[] inputArray = StaticMethods.inputIntArray();
        System.out.println("array before being reversed: " + Arrays.toString(inputArray));
        int[] revertedArray = reverseArray(inputArray);
        System.out.println("reversed array" + Arrays.toString(revertedArray));
    }

    private static int[] reverseArray(int[] inputArray) {
        int[] result = new int[inputArray.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = inputArray [inputArray.length-i-1];
        }
        return result;
    }
}
