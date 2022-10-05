package pl.sdajavacourse.javapodstawyprogramowanie.extratask6;

import pl.sdajavacourse.javapodstawyprogramowanie.StaticMethods;


import java.util.Scanner;

//Napisz mechanizm szyfrujący i deszyfrujący wykorzystujący szyfr cezara
//
//        Tekst jawny: MĘŻNY BĄDŹ, CHROŃ PUŁK TWÓJ I SZEŚĆ FLAG
//        Tekst zaszyfrowany: OHBÓŻ DĆFĄ, EKTRP ŚZŃM YŹSŁ L UAGWĘ INCJ
public class ExtraTaskSix {
    public static void runExtraTaskSix() {
        Scanner scanner = new Scanner(System.in);
        String alphabet = "aąbcćdeęfghijklłmnńoóprsśtuwyzżź";

        System.out.print("input shift parameter: ");
        int shiftParameter = StaticMethods.inputInteger(1);
        String encryptedAlphabet = encryptAlphabet(alphabet, shiftParameter);
        System.out.println("alphabet: " + alphabet);
        System.out.println("encrypted alphabet: " + encryptedAlphabet);
        System.out.print("input string: ");
        String inputString = scanner.nextLine().toLowerCase();

        String encryptedString = encryptString(inputString, alphabet, encryptedAlphabet);
        System.out.println("encrypted string: " + encryptedString);

        String decipheredString = encryptString(encryptedString,encryptedAlphabet,alphabet);
        System.out.println("deciphered string: " + decipheredString);
    }

    private static String encryptAlphabet(String alphabet, int shiftParameter) {
        String resultAlphabet = "";
                for (int i = 0; i < alphabet.length(); i++) {
            resultAlphabet = resultAlphabet + alphabet.charAt((i + shiftParameter) % alphabet.length());
        }
        return resultAlphabet;
    }

    private static String encryptString(String inputString, String alphabet, String encryptedAlphabet) {
String result="";
        for (int i = 0; i < inputString.length(); i++) {
            try{
                int alphaNumber = alphabet.indexOf(inputString.charAt(i));
                result += encryptedAlphabet.charAt(alphaNumber);
            } catch (Exception StringIndexOutOfBoundsException){
                result += inputString.charAt(i);
            }
        }
return result;
    }

}
