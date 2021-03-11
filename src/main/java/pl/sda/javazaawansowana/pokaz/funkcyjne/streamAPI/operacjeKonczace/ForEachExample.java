package pl.sda.javazaawansowana.pokaz.funkcyjne.streamAPI.operacjeKonczace;

import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {

        List.of(1, 2, 3, 4, 5).stream()
                .forEach((value) -> System.out.print(value + " "));

    }
}
