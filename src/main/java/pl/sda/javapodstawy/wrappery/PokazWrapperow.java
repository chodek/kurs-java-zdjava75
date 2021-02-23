package pl.sda.javapodstawy.wrappery;

import pl.sda.javapodstawy.Helper;
import pl.sda.javapodstawy.obiektowosc.dzien1.Pies;

public class PokazWrapperow {

    public static void main(String[] args) {

        //typy proste
        int liczba;
        char znak;
        double liczbaZPrzecinkiem;


        // Wrapper dla inta to Integer, mozna je stworzyc w sposob 'obiektowy'
        Integer wrapperInta = new Integer(400);
        Integer wrapperInta2 = Integer.valueOf(400);

        //tutaj zajdzie autoboxing - jednak jest to absoultnie poprawny spsoob inicjalizacji Integera
        Integer wrapperInta3 = 400;


        // Kazdy typ prosty ma swoj odpowiednik obiektowy
        Double doubleWrapper;
        Character charWrapper;
        Boolean booleanWrapper;

        // Tutaj zajdzie unboxing
        int prostyInt = wrapperInta;


    }

    public static void wywolywanie(){
        // Wywolanie metody statycznej
        Helper.pobierzInta();



        // Wywolanie metody niestatycznej czyli na obiekcie
        Pies burek  = new Pies();
        burek.aportuj("brazowy");
    }
}
