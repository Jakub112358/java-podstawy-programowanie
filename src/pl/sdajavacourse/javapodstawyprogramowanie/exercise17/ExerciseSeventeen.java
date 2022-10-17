package pl.sdajavacourse.javapodstawyprogramowanie.exercise17;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

//Napisz program, który pobierze od użytkownika datę najbliższych Twoich zajęć w SDA i obliczy ile dni do nich pozostało.
// Podpowiedź: datę wczytaj jako typ String i przeparsuj na LocalDate. Obecną datę pobierz z metody LocalDate.now().
public class ExerciseSeventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime firstDateTime = inputDateTime();
        LocalDateTime secondDateTime = LocalDateTime.now();
 //       LocalDateTime secondDateTime = inputDateTime();

        Duration duration = Duration.between(secondDateTime, firstDateTime);
        System.out.printf("there are %d days, %d hours and %d minutes until next SDA class %n", duration.toDays(), duration.toHoursPart(), duration.toMinutesPart());
    }

    private static LocalDateTime inputDateTime() {
        String inputDateTime;
        LocalDateTime dateTimeClass;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("input date in format YYYY-MM-ddThh:mm:ss.mmm: ");
            inputDateTime = scanner.nextLine();
            try {
                dateTimeClass = LocalDateTime.parse(inputDateTime);
                break;
            } catch (Exception DateTimeParseException) {
                System.out.println("wrong input");
            }
        }
        return dateTimeClass;
    }
}
