package pl.sdajavacourse.javapodstawyprogramowanie.exercise16;

//Napisz program, który pobierze od użytkownika 10 liczb (zmiennych typu int) i wypisze długość najdłuższego
// takiego podciągu tych liczb, który jest rosnący. Przykładowo, dla liczb: „1, 3, 8, 4, 2, 5, 6, 11, 13, 7” program
// powinien wypisać „5” jako długość najdłuższego rosnącego podciągu (w przykładzie podkreślonego).

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

public class ExerciseSixteen {
    public static void main(String[] args) {
        int[] inputArray = inputIntArray();
        int counter = 1;
        int maxCount = 1;
        for (int i = 0; i < inputArray.length-1; i++) {
            if(inputArray[i+1]>inputArray[i]) {
                counter++;
                if (counter>maxCount){
                    maxCount = counter;
                }
            }
            else counter=1;
        }
        System.out.println("maxCount = " + maxCount);
    }


    static private int[] inputIntArray() {
        int[] integerArray = new int[10];
        for (int i = 0; i < integerArray.length; i++) {
            System.out.printf("input element number %d :", i + 1);
            integerArray[i] = StaticMethods.inputInteger();
        }
        return integerArray;
    }

}
