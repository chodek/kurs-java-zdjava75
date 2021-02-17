package javazaawansowana.pokaz.kolekcje.sety;

import javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd38.BMW;
import javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd38.Samochod;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();

        System.out.println(stringSet.add("Ala"));
        System.out.println(stringSet.add("ma"));
        System.out.println(stringSet.add("kota"));
        System.out.println(stringSet.add("kota"));

        System.out.println(stringSet.contains("Ala"));
        System.out.println("____________________________________________");


        Samochod samochod = new BMW("X5", "Czarne");
        System.out.println(samochod.hashCode());
        System.out.println(samochod.hashCode());

        Samochod samochod2 = new BMW("X5", "Czarne");
        System.out.println(samochod2.hashCode());
        System.out.println(samochod2.hashCode());

        Set<Samochod> samochodSet = new HashSet<>();
        samochodSet.add(new BMW("X5", "Czarne"));

        System.out.println(samochodSet.contains(new BMW("X5", "Czarne")));





        /* KONTRAKT MIEDZY EQUALS I HASHCODE

           1. jeżeli         x.equals(y) == true     to =>        x.hashCode() == y.hashCode()

           2. jeżeli   x.hashCode() == y.hashCode()       to =>     NIE JEST WYMAGANE x.equals(y) == true

         */

    }
}
