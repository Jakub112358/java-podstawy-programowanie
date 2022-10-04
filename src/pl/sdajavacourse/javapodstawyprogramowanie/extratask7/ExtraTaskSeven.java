package pl.sdajavacourse.javapodstawyprogramowanie.extratask7;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

import java.util.Arrays;
import java.util.OptionalInt;

public class ExtraTaskSeven {
    public static void runExtraTaskSeven() {
        int[] inputArray = StaticMethods.inputIntArray();
        System.out.println(Arrays.toString(inputArray));
        OptionalInt maxValue = Arrays.stream(inputArray).max();
        int maxValueInt = maxValue.getAsInt();
        OptionalInt minValue = Arrays.stream(inputArray).min();
        int minValueInt = minValue.getAsInt();
        System.out.printf(maxValueInt + " - " + minValueInt + " = " + (maxValueInt - minValueInt));
    }


}
