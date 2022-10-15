package pl.sdajavacourse.javapodstawyprogramowanie.exercise10;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;

//Napisz program, który pobierze od użytkownika jedną liczbę dodatnią (typu int) i obliczy sumę cyfr podanej liczby.
// Podpowiedź: aby rozpatrywać liczbę cyfra po cyfrze, możesz obliczać resztę z dzielenia liczby przez 10
// (aby uzyskać wartość ostatniej cyfry) i dzielić liczbę bez reszty przez 10 (żeby „przesuwać” się do kolejnej cyfry).
public class ExerciseTen {
    public static void main(String[] args) {
        int inputInteger = StaticMethods.inputInteger(0);
        String inputAsString = Integer.toString(inputInteger);
        String[] splitInput = inputAsString.split("");
        int digitSum = 0;

        for (int i = 0; i < inputAsString.length(); i++) {
            digitSum += Integer.parseInt(splitInput[i]);
        }
        System.out.println(digitSum);
    }
}
