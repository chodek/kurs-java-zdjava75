package javazaawansowana.pokaz.kolekcje.listy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       List<Integer> integerList = new ArrayList<>();

       List<Integer> integerList1 = new LinkedList<>();




       integerList.add(1);
       integerList1.add(1);


       integerList.remove(1);
       integerList1.remove(1);


       System.out.println(integerList.indexOf(1));
       System.out.println(integerList.lastIndexOf(1));






    }


}
