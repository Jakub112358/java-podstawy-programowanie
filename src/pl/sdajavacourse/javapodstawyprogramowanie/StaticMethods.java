package pl.sdajavacourse.javapodstawyprogramowanie;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static pl.sdajavacourse.javapodstawyprogramowanie.Launcher.numberOfExercises;

public class StaticMethods {
    //    static private int exerciseNumber;
    static private Scanner scanner = new Scanner(System.in);

    static public int setExerciseNumber() {
        int exerciseNumber;
        System.out.printf("Set exercise number from 1 to %d %n", numberOfExercises);
        String exerciseNumberString = scanner.nextLine();
        try {
            exerciseNumber = Integer.parseInt(exerciseNumberString);
        } catch (Exception e) {
            System.out.println("wrong format of exercise number");
            exerciseNumber = setExerciseNumber();
        }
        if (exerciseNumber < 1 || exerciseNumber > numberOfExercises) {
            System.out.println("incorrect exercise number");
            exerciseNumber = setExerciseNumber();
        }
        return exerciseNumber;
    }

    static public int inputInteger() {
        int intNumber = 0;
        while (true) {
            try {
                System.out.println("input Integer number");
                String intInput = scanner.nextLine();
                intNumber = Integer.parseInt(intInput);
                break;
            } catch (Exception NumberFormatException) {
                System.out.println("wrong input format");
            }
        }
        return intNumber;
    }

    static public int inputInteger(int minNumber) {
        int intNumber = 0;
        while (true) {
            try {
                System.out.printf("input Integer >= %d %n", minNumber);
                String intInput = scanner.nextLine();
                intNumber = Integer.parseInt(intInput);
                if (intNumber >= minNumber) {
                    break;
                } else
                    System.out.printf("number must be >= %d %n", minNumber);
            } catch (Exception NumberFormatException) {
                System.out.println("wrong input format");
            }
        }
        return intNumber;
    }

    static public float inputFloat() {
        float floatNumber = 0.0f;
        while (true) {
            try {
                System.out.println("input float number");
                String floatInput = scanner.nextLine();
                floatNumber = Float.parseFloat(floatInput);
                break;
            } catch (Exception NumberFormatException) {
                System.out.println("wrong input format");
            }
        }
        return floatNumber;
    }


    static public char inputChar(char[] chars) {
        char resultChar = ' ';
        while (true) {
            System.out.println("input exactly one char from: " + Arrays.toString(chars));
            String stringInput = scanner.nextLine();
            if (stringInput.length() > 1) {
                System.out.println("input exactly 1 character");
            } else {
                resultChar = stringInput.charAt(0);
                if (ifArrayContains(chars, resultChar)) {
                    break;
                } else
                    System.out.println("wrong input char");
            }
        }
        return resultChar;
    }


    private static boolean ifArrayContains(char[] availableChars, char checkingChar) {
        for (char availableChar : availableChars) {
            if (checkingChar == availableChar) {
                return true;
            }
        }
        return false;
    }


    static public int[] inputIntArray() {
        System.out.println("input size of an array");
        int arraySize = inputInteger(1);
        int[] integerArray = new int[arraySize];
        for (int i = 0; i < integerArray.length; i++) {
            System.out.printf("input element number %d :",i+1);
            integerArray[i]=inputInteger();
        }
        return integerArray;
    }


}
