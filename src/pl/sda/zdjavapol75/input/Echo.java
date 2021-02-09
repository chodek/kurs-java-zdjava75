package pl.sda.zdjavapol75.input;

import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {

        Scanner zmiennaTypuScanner = new Scanner(System.in);

        String wczytanaLinia;

        wczytanaLinia = zmiennaTypuScanner.nextLine();

        System.out.println("Wpisales przed chwila: " + wczytanaLinia);

    }
}
