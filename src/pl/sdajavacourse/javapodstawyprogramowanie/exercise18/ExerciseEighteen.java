package pl.sdajavacourse.javapodstawyprogramowanie.exercise18;

//Napisz program, który pobierze od użytkownika tekst (zmienna typu String) i sprawdzi, czy użytkownik kichnął, tzn. czy w
// podanym tekście znajduje się tekst „aaaa psik” z dowolnie wieloma, ale minimum jedną literą ‘a’ na początku wyrażenia
// (czyli kichnięciem jest zarówno „a psik”, jak i „aaaaaaaaaa psik”). Podpowiedź: użyj wyrażenia regularnego z odpowiednim kwantyfikatorem.

import java.util.Scanner;

public class ExerciseEighteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input sentence: ");
        String inputString = scanner.nextLine();
        if (inputString.matches(".*\\b[aA]\\b+ \\bpsik\\b.*")) {
            System.out.println("na zdrowie! ");
        } else System.out.println("🤷‍");
    }
}
