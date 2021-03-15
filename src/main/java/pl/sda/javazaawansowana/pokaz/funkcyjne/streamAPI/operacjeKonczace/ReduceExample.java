package pl.sda.javazaawansowana.pokaz.funkcyjne.streamAPI.operacjeKonczace;

import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {

        int sum = List.of(13, 12, 21, 54, 2).stream()
                .reduce(0, (first, second) -> first + second);

        int sum2 = List.of(13, 12, 21, 54, 2).stream()
                .mapToInt(Integer::intValue)
                .sum();

        double averageNameLength = List.of("Marcin", "Jan", "Krzysztof", "Damian", "Pawel").stream()
                .mapToInt( (x) -> x.length())
                .average()
                .orElse(-1.0);

        System.out.println(averageNameLength);
    }
}
