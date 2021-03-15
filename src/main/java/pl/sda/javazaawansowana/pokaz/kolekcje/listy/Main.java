package pl.sda.javazaawansowana.pokaz.kolekcje.listy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       List<Integer> integerList = new ArrayList<>();

       List<Integer> integerList1 = new LinkedList<>();





       integerList.add(1);
       integerList1.add(1);
       integerList1.add(1);
       integerList1.add(1);
       integerList1.add(1);
       integerList1.add(1);
       integerList1.add(1);
       integerList1.add(1);

/*

       integerList.remove(1);
       integerList1.remove(1);
*/


       System.out.println(integerList.indexOf(1));
       System.out.println(integerList.lastIndexOf(1));

        for (Integer integer : integerList1) {
            integerList1.remove(1);
        }


       integerList.sort(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return 0;
           }
       });


    }


}
