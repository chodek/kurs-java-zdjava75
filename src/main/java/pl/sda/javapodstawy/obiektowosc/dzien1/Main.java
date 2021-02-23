package pl.sda.javapodstawy.obiektowosc.dzien1;

public class Main {
    public static void main(String[] args) {


        Pies burek = new Pies();
        burek.umaszczenie = "Brązowe";
        burek.imie = "Burek";
        burek.wiek = 12;


        burek.aportuj("Dlugi");
        burek.przedstawSie();

        System.out.println("Od teraz przemawia koljeny pies, Azor");

        Pies azor = new Pies();
        azor.umaszczenie = "Czarny";
        azor.imie = "Azor";
        azor.wiek = 5;


        azor.aportuj("Krotki");
        azor.przedstawSie();


    }
}
