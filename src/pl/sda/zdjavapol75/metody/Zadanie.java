package pl.sda.zdjavapol75.metody;

import java.util.Scanner;

public class Zadanie {

    // Pobierz od uzytkownika 2 liczby, oblicz ich sume a nastepnie wyswietl ja na ekran


    public static void main(String[] args) {

        int[] pobraneOdUzytkownika = pobierzDwieLiczby();

        int sumaLiczbUzytkwonika = sumujElementyTablicy(pobraneOdUzytkownika);

        wypiszLiczbeNaEkran(sumaLiczbUzytkwonika);

        //powyzsze linijki mozemy uproscic do:
        wypiszLiczbeNaEkran(sumujElementyTablicy(pobierzDwieLiczby()));


    }

    public static int[] pobierzDwieLiczby() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe:");
        int wczytanaPierwsza = scanner.nextInt();
        System.out.println("Podaj druga liczbe:");
        int wczytanaDruga = scanner.nextInt();

        int[] wczytaneLiczby = new int[]{wczytanaPierwsza, wczytanaDruga};

        return wczytaneLiczby;
    }

    public static int sumujElementyTablicy(int[] tablicaDoZsumowania) {
        int suma = 0;
        for (int i = 0; i < tablicaDoZsumowania.length; i++) {
            suma += tablicaDoZsumowania[i];
        }
        return suma;
    }

    public static void wypiszLiczbeNaEkran(int liczbaDoWyswietlenia) {
        System.out.println("Suma to: ");
        System.out.println(liczbaDoWyswietlenia);
    }


}
