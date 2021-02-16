package javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd53;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Cokolwiek");
        stringList.add("Cokolwiek");
        stringList.add("Cokolwiek");
        stringList.add("inny");
        stringList.add("inny");
        stringList.add("innys");



        System.out.println(stringList);

        List<String> listaZTablicy = List.of(new String[]{"jeden","dwa"});

        //stringList.removeAll(List.of("Cokolwiek"));

        System.out.println(stringList);

        ListHelper.showDuplicates(stringList);

        ListHelper.removeDuplicates(stringList);

        System.out.println(stringList);



    }



}
