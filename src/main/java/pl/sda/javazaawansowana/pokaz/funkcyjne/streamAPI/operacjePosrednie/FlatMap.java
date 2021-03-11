package pl.sda.javazaawansowana.pokaz.funkcyjne.streamAPI.operacjePosrednie;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {
        List<String> pinkFloyd = Arrays.asList("Gilmour", "Waters", "Wright", "Mason", "Barret");
        List<String> ledZeppelin = Arrays.asList("Page", "Plant", "Jones", "Bonham");

        List<List<String>> zespolyNaWoodstock = new ArrayList<>();
        zespolyNaWoodstock.add(pinkFloyd);
        zespolyNaWoodstock.add(ledZeppelin);

        List<String> lineUp = zespolyNaWoodstock.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(lineUp);

        przyklad2();
    }

    private static void przyklad2() {
        Statistics statisticsA = new Statistics(2.0, List.of(1, 2, 3));
        Statistics statisticsB = new Statistics(2.5, List.of(2, 2, 3, 3));

        System.out.println(Stream.of(statisticsA, statisticsB)
                .flatMap(statistics -> statistics.getValues().stream())
                // .distinct() - opcjonalnie, jezeli chcemy pozbyc sie duplikatow
                .collect(Collectors.toList()));


    }


    @AllArgsConstructor
    @Getter
    static class Statistics {
        private double average;
        private List<Integer> values;
    }
}
