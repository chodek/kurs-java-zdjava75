package pl.sda.zdjavapol75.petle;

import java.util.Scanner;

public class Dzielniki {
    public static void main(String[] args) {
        int dzielnik, liczba;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        liczba = scanner.nextInt();
        System.out.println("Podaj dzielnik:");
        dzielnik = scanner.nextInt();

        for (int i = liczba - 1; i > 0; i--) { // to jest etap 1.

            if (i % dzielnik == 0){ // a ten if to etap 2.
                System.out.println(i);
            }
        }
    }
}
