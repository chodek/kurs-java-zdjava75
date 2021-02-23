package pl.sda.javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd38;

public class Main {

    public static void main(String[] args) {

        Garaz<Samochod> garaz = new Garaz<>();
        BMW bmw = new BMW("X5", "Czarne");
        Porshe porshe = new Porshe("Cayenne", "Srebrne");

        garaz.zaparkuj(bmw);
        garaz.zaparkuj(porshe);

        BMW nowaBemka = new BMW("X5", "Czarne");
        System.out.println(garaz.wyprowadz(nowaBemka));

    }
}
