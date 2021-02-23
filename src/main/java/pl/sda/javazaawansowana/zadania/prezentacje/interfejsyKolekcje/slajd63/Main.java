package pl.sda.javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd63;

import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordsToCount = scanner.nextLine();
        Map<String, Integer> wordOccurrences = WordCounter.countWordOccurrences(wordsToCount);
        //System.out.println(wordOccurrences);
        wordOccurrences = WordCounter.sortMapByValueDescending(wordOccurrences);
        System.out.println(wordOccurrences);

    }
}
