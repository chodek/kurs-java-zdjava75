package javazaawansowana.zadania.prezentacje.interfejsyKolekcje.sladj39;

import javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd38.BMW;
import javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd38.Porshe;
import javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd38.Samochod;

public class Main {

    public static void main(String[] args) {

        MojaLista<String> mojaListaStringow = new MojaLista<>(2);

        System.out.println(mojaListaStringow.dodaj("pierwszy"));
        System.out.println(mojaListaStringow.dodaj("drugi"));
        System.out.println(mojaListaStringow.dodaj("trzeci"));
        System.out.println(mojaListaStringow.dodaj("czwarty"));
        System.out.println(mojaListaStringow.dodaj("piaty"));
        System.out.println(mojaListaStringow.dodaj("szosty"));

        System.out.println(mojaListaStringow);

        System.out.println("____________________________________________________");

        MojaLista<Samochod> mojaListaSamochodow = new MojaLista<>(3);
        mojaListaSamochodow.dodaj(new BMW("X5","Czarne"));
        mojaListaSamochodow.dodaj(new BMW("X7","Czerwone"));
        mojaListaSamochodow.dodaj(new Porshe("Cayenne","Srebrne"));
        mojaListaSamochodow.dodaj(new Porshe("Cayenne","Srebrne"));

        System.out.println(mojaListaSamochodow);

        System.out.println(mojaListaSamochodow.zawiera(new BMW("X7", "Czerwone")));
        System.out.println(mojaListaSamochodow.zawiera(new BMW("X5", "Czerwone")));


    }
}
