package javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd63;

import java.util.*;

public class WordCounter {

    public static Map<String, Integer> countWordOccurrences(String tekst){
        String[] strings = tekst.toLowerCase().replaceAll("[.,;]","").split("\\s+");
        Map<String, Integer> wordOccurrences = new HashMap<>();

        for (String string : strings) {
            if(wordOccurrences.containsKey(string)){
                wordOccurrences.put(string, wordOccurrences.get(string) + 1);
            } else {
                wordOccurrences.put(string, 1);
            }
        }
        return wordOccurrences;
    }

    public static Map<String, Integer> sortMapByValueDescending(Map<String, Integer> mapToSort){
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(mapToSort.entrySet());

        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
