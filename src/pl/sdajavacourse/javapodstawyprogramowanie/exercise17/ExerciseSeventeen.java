package pl.sdajavacourse.javapodstawyprogramowanie.exercise17;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//Napisz program, który pobierze od użytkownika datę najbliższych Twoich zajęć w SDA i obliczy ile dni do nich pozostało.
// Podpowiedź: datę wczytaj jako typ String i przeparsuj na LocalDate. Obecną datę pobierz z metody LocalDate.now().
public class ExerciseSeventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDate;
        System.out.println("input date of Class in format YYYY-MM-DD: ");
        inputDate = scanner.nextLine();
        LocalDate dateClass = LocalDate.parse(inputDate);
        LocalDate dateNow = LocalDate.now();
        System.out.printf("there are %d days between %s and %s", dateNow.until(dateClass, ChronoUnit.DAYS), dateNow, dateClass);

    }
}
