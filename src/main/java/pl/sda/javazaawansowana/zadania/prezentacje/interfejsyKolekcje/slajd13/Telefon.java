package pl.sda.javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd13;

import java.util.Random;

public class Telefon implements Dzwoni {

    String numerTelefonu;
    int lacznyCzasRozmow = 0;

    @Override
    public void zadzwon(String numerTelefonu) {

        Random random = new Random();
        int czasRozmowy = 0;
        if (random.nextInt(10) > 1) {
            System.out.print("Dzwonie pod numer: " + numerTelefonu + ". ");
            czasRozmowy = random.nextInt(60) + 1;
        } else {
            System.out.print("Blad polaczenia! ");
        }
        System.out.println("Czas rozmowy to: " + czasRozmowy + " minut.");
        lacznyCzasRozmow+= czasRozmowy;
    }

    @Override
    public void zadzwonNaNumerAlarmowy() {
        System.out.println("hahahaha, nigdzie nie dzwonie");
    }

    public int getLacznyCzasRozmow(){
        return lacznyCzasRozmow;
    }
}
