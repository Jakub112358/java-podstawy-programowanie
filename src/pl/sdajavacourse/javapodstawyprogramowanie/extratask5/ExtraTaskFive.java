package pl.sdajavacourse.javapodstawyprogramowanie.extratask5;

import java.util.Scanner;

//W podanym ciągu znaków znajdź najdłuższy podciąg składający się z jednego znaku:
//
//        AABCDDBBBEA -> “B:3” <br>
public class ExtraTaskFive {
    public static void runExtraTaskFive() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input String: ");
        String inputString = scanner.nextLine();
        char charRepeated = inputString.charAt(0);
        int counter=1;
        int maxCount=1;
        for (int i = 0; i < inputString.length()-1; i++) {
            if( inputString.charAt(i)==inputString.charAt(i+1)){
                counter++;
                if(counter>maxCount){
                    maxCount=counter;
                    charRepeated = inputString.charAt(i);
                }
            }
            else {
                counter = 1;
            }
        }
        System.out.println(charRepeated + ": " +maxCount);
    }
}
