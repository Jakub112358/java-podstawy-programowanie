package pl.sdajavacourse.javapodstawyprogramowanie;

import java.util.Arrays;
import java.util.Scanner;


public class StaticMethods {
    static private final Scanner scanner = new Scanner(System.in);

    static public int inputInteger() {
        int intNumber;
        while (true) {
            try {
                System.out.print("input Integer number: ");
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
        int intNumber;
        while (true) {
            try {
                System.out.printf("input Integer >= %d:", minNumber);
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
    }    static public int inputInteger(int minNumber, int maxNumber) {
        int intNumber;
        while (true) {
            try {
                System.out.printf("input Integer >= %d and <= %d: ", minNumber, maxNumber);
                String intInput = scanner.nextLine();
                intNumber = Integer.parseInt(intInput);
                if (intNumber >= minNumber && intNumber <= maxNumber) {
                    break;
                } else if (intNumber < minNumber) {
                    System.out.printf("number must be >= %d %n", minNumber);
                }
                else
                    System.out.printf("number must be <= %d %n", maxNumber);

            } catch (Exception NumberFormatException) {
                System.out.println("wrong input format");
            }
        }
        return intNumber;
    }

    static public float inputFloat() {
        float floatNumber;
        while (true) {
            try {
                System.out.print("input float number: ");
                String floatInput = scanner.nextLine();
                floatNumber = Float.parseFloat(floatInput);
                break;
            } catch (Exception NumberFormatException) {
                System.out.println("wrong input format");
            }
        }
        return floatNumber;
    }
    static public double inputDouble() {
        double doubleNumber;
        while (true) {
            try {
                System.out.print("input double number: ");
                String doubleInput = scanner.nextLine();
                doubleNumber = Double.parseDouble(doubleInput);
                break;
            } catch (Exception NumberFormatException) {
                System.out.println("wrong input format");
            }
        }
        return doubleNumber;
    }

    static public float inputFloat(float minValue) {
        float floatNumber;
        while (true) {
            try {
                System.out.printf("input float number >= %f: ",minValue);
                String floatInput = scanner.nextLine();
                floatNumber = Float.parseFloat(floatInput);
                if (floatNumber >= minValue) {
                    break;
                } else
                    System.out.printf("input must be >= %f %n", minValue);
            } catch (Exception NumberFormatException) {
                System.out.println("wrong input format");
            }
        }
        return floatNumber;
    }


    static public char inputChar(char[] chars) {
        char resultChar;
        while (true) {
            System.out.print("input exactly one char from: " + Arrays.toString(chars));
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
        System.out.print("input size of an array: ");
        int arraySize = inputInteger(1);
        int[] integerArray = new int[arraySize];
        for (int i = 0; i < integerArray.length; i++) {
            System.out.printf("input element number %d :", i + 1);
            integerArray[i] = inputInteger();
        }
        return integerArray;
    }


}
