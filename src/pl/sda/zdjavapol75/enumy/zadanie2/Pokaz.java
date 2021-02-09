package pl.sda.zdjavapol75.enumy.zadanie2;

public class Pokaz {

    public static void main(String[] args) {

       // najbardziej charakterystyczne metody uzywane na Enumach

        PackageSize.values(); // Zwrca tablice wszystkich wartosci

        PackageSize.valueOf("SMALL"); // Zwraca konkretna warttosc ENUMa na podstawie Stringa

        PackageSize.LARGE.ordinal();  // Zwraca pozycje tej wartosci w Enumie

    }

}


