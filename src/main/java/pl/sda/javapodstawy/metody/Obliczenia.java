package pl.sda.javapodstawy.metody;

import java.util.Scanner;

public class Obliczenia {

    public static void main(String[] args) {

        System.out.println("Przed metoda");
        Scanner scanner = new Scanner(System.in);


        String tekst = scanner.nextLine();
        String tekst2 = metodaZwracajacaStringa();

    }

    public static String metodaZwracajacaStringa() {

        System.out.println("Jestem w metodzie nic nie zwracajacej");
        return "Ala ma kota";
    }
}
