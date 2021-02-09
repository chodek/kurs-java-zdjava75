package pl.sda.zdjavapol75.input;

import java.util.Scanner;

public class Witacz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ile masz lat:");
        int wiek = scanner.nextInt();
        scanner.nextLine();             // Ta linijka jest potrzebna aby wczytac cos z konsoli, ale nic z tym nie zrobic, w tym wypadku 'zjedzony' zoostanie znak '\n' - czyli enter ktory zostal po wczytaniu inta


        System.out.println("Podaj imie: ");
        String imie = scanner.nextLine();
        System.out.println("Witaj " + imie + ", masz " + wiek + " lat!");

    }
}
