package pl.sdajavacourse.javapodstawyprogramowanie.extratask4;


import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

import java.util.Arrays;

//program sprawdza, czy suma dowolnych 2 elementów tablicy równa się sumie K. dodatkowo sprawdza,
// czy 2 dowolne elementy tablicy równają się innemu elementowi tablicy.
public class ExtraTaskFour {
    public static void runExtraTaskFour() {
        System.out.println("input array");
        int[] intArray = StaticMethods.inputIntArray();
        System.out.println("input sum");
        int sum = StaticMethods.inputInteger();

        System.out.println("input array: " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("sorted array: " + Arrays.toString(intArray));

        System.out.println("two elements of array = K: " + checkKSum(intArray, sum));

            System.out.println("two elements of array = other element: " + checkSumInArray(intArray));


    }

    private static boolean checkKSum(int[] intArray, int sum) {
        for (int i = 0; i < intArray.length; i++) {
            for (int i1 = i + 1; i1 < intArray.length; i1++) {
                if (intArray[i] + intArray[i1] == sum){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkSumInArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int i1 = i + 1; i1 < intArray.length; i1++) {
                for (int i2 = i1 + 1; i2 < intArray.length; i2++) {
                    if (intArray[i] + intArray[i1] == intArray[i2]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
