package pl.sda.javazaawansowana.pokaz.funkcyjne.streamAPI.operacjePosrednie;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {

        List <Integer> integerList = List.of(1,2,3);
        integerList.stream()
                .map((element) -> element * 3)
                .forEach(System.out::println); // praca na strumieniu, nie zmiena oryginalnych danych

        integerList = integerList.stream()
                .map((element) -> element * 3)
                .collect(Collectors.toList()); // dopiero przypisanie do tej listy, zmieni jej zawartosc

        System.out.println(integerList);

    }
}
