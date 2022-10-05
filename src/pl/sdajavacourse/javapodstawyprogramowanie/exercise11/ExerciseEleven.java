package pl.sdajavacourse.javapodstawyprogramowanie.exercise11;

import java.util.Scanner;

public class ExerciseEleven {
    public static void runExerciseEleven() {
        Scanner scanner = new Scanner(System.in);
        String theLongestString = "";

        while (true) {
            String inputString = scanner.nextLine();
            if (inputString.equalsIgnoreCase("starczy")){
                System.out.println("najdluzszy wpisany string to: " + theLongestString);
                break;
            }
            if (inputString.equals("")){
                System.out.println("nie podano zadnego tekstu");
            }
            if (inputString.length()>theLongestString.length()){
                theLongestString = inputString;
            }
        }
    }
}
