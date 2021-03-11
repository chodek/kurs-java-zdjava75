package pl.sda.javazaawansowana.pokaz.funkcyjne.streamAPI.operacjePosrednie;

import java.util.List;

public class SortedExample {

    public static void main(String[] args) {
        List<String> integerList = List.of("kota", "ala", "ma");
        integerList.stream().sorted((s1, s2) -> -Integer.compare(s1.length(), s2.length()))
                .forEach(System.out::println);
    }
}
