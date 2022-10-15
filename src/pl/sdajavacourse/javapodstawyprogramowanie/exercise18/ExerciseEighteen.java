package pl.sdajavacourse.javapodstawyprogramowanie.exercise18;

//Napisz program, który pobierze od użytkownika tekst (zmienna typu String) i sprawdzi, czy użytkownik kichnął, tzn. czy w
// podanym tekście znajduje się tekst „aaaa psik” z dowolnie wieloma, ale minimum jedną literą ‘a’ na początku wyrażenia
// (czyli kichnięciem jest zarówno „a psik”, jak i „aaaaaaaaaa psik”). Podpowiedź: użyj wyrażenia regularnego z odpowiednim kwantyfikatorem.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExerciseEighteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input sentence: ");
        String inputString = scanner.nextLine();
        Pattern apsikPattern = Pattern.compile("a+ psik");
        Matcher matcher = apsikPattern.matcher(inputString.toLowerCase());

        if (matcher.find()){
            System.out.println("na zdrowie! ");
        }
        else System.out.println("🤷‍");
    }
}
