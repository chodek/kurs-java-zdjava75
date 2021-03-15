package pl.sda.javazaawansowana.pokaz.funkcyjne.streamAPI.zadanieSklepInternetowy;

import java.util.Scanner;

public class Helper {


    public static String getStringFromUser(String whatIsBeingFilled){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj " + whatIsBeingFilled + ": ");
        return scanner.nextLine();
    }

    public static double getDoubleFromUser(String whatIsBeingFilled){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj " + whatIsBeingFilled + ": ");
        return scanner.nextDouble();
    }
}
