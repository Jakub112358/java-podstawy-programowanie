package pl.sdajavacourse.javapodstawyprogramowanie.extratask7;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

import java.util.Arrays;

// Wskaż liczbę o 1 większą od reprezentowanej liczby przez cyfry w tablicy, np. [1,3,2,4] -> 1324 + 1 -> [1,3,2,5]
public class ExtraTaskSeven {
    public static void main(String[] args) {
        int[] inputArray = StaticMethods.inputIntArray();
        System.out.println("input array" + Arrays.toString(inputArray));
        String inputAsString = "";
        for (int j : inputArray) {
            inputAsString += Integer.toString(j);
        }

        int addedOneInt = Integer.parseInt(inputAsString) + 1;
        String addedOneString = Integer.toString(addedOneInt);

        char[] resultSplittedArray = new char[addedOneString.length()];

        for (int i = 0; i < addedOneString.length(); i++) {
            resultSplittedArray[i] = addedOneString.charAt(i);
        }

        System.out.println(Arrays.toString(resultSplittedArray));

    }


}
