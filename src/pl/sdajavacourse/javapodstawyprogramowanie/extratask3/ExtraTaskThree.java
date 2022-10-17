package pl.sdajavacourse.javapodstawyprogramowanie.extratask3;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

import java.util.Arrays;

//Napisz program obliczający różnicę pomiędzy największą i najmniejszą wartością z tablicy
public class ExtraTaskThree {
    public static void runExtraTaskThree() {

        int[] inputArray = StaticMethods.inputIntArray();
        System.out.println("input array: " + Arrays.toString(inputArray));

        int maxValueInt = Arrays.stream(inputArray).max().getAsInt();
        int minValueInt = Arrays.stream(inputArray).min().getAsInt();

        System.out.printf(maxValueInt + " - " + minValueInt + " = " + (maxValueInt - minValueInt));
    }


}
