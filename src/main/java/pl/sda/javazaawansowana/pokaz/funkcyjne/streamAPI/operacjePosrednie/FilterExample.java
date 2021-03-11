package pl.sda.javazaawansowana.pokaz.funkcyjne.streamAPI.operacjePosrednie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FilterExample {

    public static void main(String[] args) {

        int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listaIntow = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Arrays.stream(tablica)
                .filter(element -> element % 2 == 0)
                .forEach(System.out::println);


        listaIntow.stream()
                .filter(element -> element % 2 == 0)
                .forEach(System.out::println);


    }
}
