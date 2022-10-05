package pl.sdajavacourse.javapodstawyprogramowanie.extratask7;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

import java.util.Arrays;

public class ExtraTaskSeven {
    public static void runExtraTaskSeven() {

        int[] inputArray = StaticMethods.inputIntArray();
        System.out.println("input array: " + Arrays.toString(inputArray));

        int maxValueInt = Arrays.stream(inputArray).max().getAsInt();
        int minValueInt = Arrays.stream(inputArray).min().getAsInt();

        System.out.printf(maxValueInt + " - " + minValueInt + " = " + (maxValueInt - minValueInt));
    }


}
