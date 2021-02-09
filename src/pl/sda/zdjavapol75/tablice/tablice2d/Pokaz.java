package pl.sda.zdjavapol75.tablice.tablice2d;

import java.util.Scanner;

public class Pokaz {
    public static void main(String[] args) {



        // Tworzenie tablicy
        int[][] tablica2D = new int[10][10];

        // Te dwie zagniezdzone petle ponizej nie powinny uzywac 10 jak liczby na stale, lepiej zrobic jak w petlach jeszccze nizej, czytaj tablica2D.length oraz tablica2D[i].length
        Scanner scanner = new Scanner(System.in);
        // pętla zewnętrzna generuje indeksy rzędów
        for (int i = 0; i < 10; i++) {
            // pętla wewnętrzna generuje indeksy kolumn
            for (int j = 0; j < 10; j++) {
                // możemy tak wyliczyć kolejną liczbę, ponieważ
                // każdy rząd odpowiada kolejnej dziesiątce
                tablica2D[i][j] = scanner.nextInt();


            }
        }



        // wypisywanie tablicy 2d

        // petla do przejscia przez kazdy wiersz
        for (int i = 0; i < tablica2D.length; i++) {

            // petla do przejscia kazdej komorki (kolumny) w danym wierszu
            for (int j = 0; j < tablica2D[i].length; j++) {
                // dla kazdej komorki w danym wierszu, wypisz ja na ekran i dolacz do niej spacje
                System.out.print(tablica2D[i][j] + " ");
            }
            // wypisanie entera aby ooddzielic wiersze
            System.out.println();
        }


    }
}
