package pl.sda.javazaawansowana.pokaz.funkcyjne.streamAPI.operacjeKonczace;

import java.util.List;

public class FindFirstFindAnyExample {

    public static void main(String[] args) {

        List.of("co", "bedzie", "pierwszym", "elementem").stream()
                .sorted()
                .findFirst() // zwraca Optionala
                .ifPresent(System.out::println);


        List.of(7, 21, 13, 4, 8).stream()
                .filter(x -> x % 2 == 0)
                .findAny() // zwraca Optionala
                .ifPresent(System.out::println);

    }
}
