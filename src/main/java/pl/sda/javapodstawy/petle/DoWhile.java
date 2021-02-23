package pl.sda.javapodstawy.petle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczbaOdUzytkownika;

        do {
            System.out.println("Podaj jakas liczbe wieksza od 0:");
            liczbaOdUzytkownika = scanner.nextInt();


            for (int i = liczbaOdUzytkownika - 1; i > 0; i--){
                System.out.println(i);
            }


        } while (liczbaOdUzytkownika != 0);
    }
}
