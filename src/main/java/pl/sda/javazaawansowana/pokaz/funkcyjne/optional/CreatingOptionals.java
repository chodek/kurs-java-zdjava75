package pl.sda.javazaawansowana.pokaz.funkcyjne.optional;

import pl.sda.javazaawansowana.zadania.prezentacje.wstepDoProgramowaniaObiektowego.slajd126.Egzemplarz;

import java.util.Optional;
import java.util.Scanner;


public class CreatingOptionals {

    public static void main(String[] args) {

        // Tworzenie optionali:
        Optional<String> optionalPelny = Optional.of("This is Optional!");
        String value = null;
        //Optional<String> stringOptional2 = Optional.of(value); -- rzuca wyjatek
        Optional<String> optionalPusty = Optional.ofNullable(value);

        // Sprawdzenie czy sa puste:
        System.out.println(optionalPelny.isEmpty());
        System.out.println(optionalPusty.isEmpty());

        // Sprawdzenie czy sa pelne:
        System.out.println(optionalPelny.isPresent());
        System.out.println(optionalPusty.isPresent());

        // wykonanie czegos, jesli sa pelne:
        optionalPelny.ifPresent(s -> System.out.println(s));
        // mozna to tez zrobic przy pomocy referencji do metody:
        optionalPelny.ifPresent(System.out::println);
        optionalPusty.ifPresent(System.out::println); // nie wykona sie, bo optional jest pusty

        System.out.println("__________________________________________________________________________");

        // Pobieranie wartosci
        System.out.println(optionalPelny.get()); // wypisanie pobranej z optionala wartosci
        //System.out.println(optionalPusty.get()); // rzuci wyjatek, bo Optional jest pusty

        System.out.println(optionalPelny.orElse("Hahahahaha, nic tam nie ma!")); // zwraca wartosc optionala, a jezeli on jest pusty, to zwraca wartosc przekazana jako argument do metody orElse()
        System.out.println(optionalPusty.orElse("Hahahahaha, nic tam nie ma!"));

        System.out.println(optionalPelny.orElseGet(() -> "Hahaha, nic tam nie ma")); // zwraca wartosc optionala, a jezeli on jest pusty, to zwraca wartosc dostarczona przez Supplier - ktory to jest przekazany do metody orElseGet()
        System.out.println(optionalPusty.orElseGet(() -> "Hahaha, nic tam nie ma"));



        System.out.println(optionalPelny.orElse(zwracamStringa())); // eager
        System.out.println(optionalPelny.orElseGet(() -> zwracamStringa()));// lazy

        pobierzZdanie().ifPresent(System.out::println);
    }

    public static String zwracamStringa(){
        System.out.println("Jestem w metodzie zwracajacej Stringa!");
        return "String z metody";
    }


    public static Optional<String> pobierzZdanie(){
        Scanner scanner = new Scanner(System.in);
        String wczytaneZdanie = scanner.nextLine();
        return Optional.ofNullable(wczytaneZdanie.split(" ")[2]);
    }
}
