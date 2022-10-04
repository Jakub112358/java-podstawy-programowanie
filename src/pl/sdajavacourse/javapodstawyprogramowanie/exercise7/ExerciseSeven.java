package pl.sdajavacourse.javapodstawyprogramowanie.exercise7;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

public class ExerciseSeven {
    public static void runExerciseSeven() {
        System.out.println("In this exercise, the program calculates the Fn Fibonacci number");
        int indexNumber = StaticMethods.inputInteger(1);
        int counter = 1;
        System.out.printf("for method: Fibonacci F%d Number = %d %n", indexNumber, countFibonacciNumberUsingFor(indexNumber));
        int fibonacciNumberFromRecursionMethod = countFibonacciNumberUsingRecursion(1, 1, counter, indexNumber);
        System.out.printf("recursion method: Fibonacci F%d Number = %d %n", indexNumber, fibonacciNumberFromRecursionMethod);

    }

    private static int countFibonacciNumberUsingFor(int indexNumber) {
        int firstNumber = 1;
        int secondNumber = 1;
        int tempNumber;
        if (indexNumber == 1 || indexNumber == 2) {
            return 1;
        } else
            for (int i = 1; i < indexNumber - 1; i++) {
                tempNumber = secondNumber;
                secondNumber = firstNumber + secondNumber;
                firstNumber = tempNumber;
            }
        return secondNumber;
    }

    private static int countFibonacciNumberUsingRecursion(int firstNumber, int secondNumber, int counter, int lastIndexNumber) {
        if (counter >= lastIndexNumber) {
            return firstNumber;
        } else
            counter++;
        return countFibonacciNumberUsingRecursion(secondNumber, firstNumber + secondNumber, counter, lastIndexNumber);
    }


}
