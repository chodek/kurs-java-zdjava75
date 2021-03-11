package pl.sda.javazaawansowana.pokaz.funkcyjne.streamAPI;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TworzeniueStreamow {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Arrays.asList(1,2,3).stream();
        Stream<String> stringStream = Set.of("cos","innego").stream();
        Stream<Map.Entry<String, Integer>> mapStream = Map.of("klucz1", 1, "key2", 123).entrySet().stream();

        int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream integerStream1 = Arrays.stream(tablica);

        Stream<Double> ofStream = Stream.of(1.0, 2.03);

        Stream<Integer> integerStream2 = Stream.generate( () -> new Random().nextInt());

    }
}
