package pl.sda.javapodstawy.obiektowosc.dzien3.enumy.bilety;

public class Main {
    public static void main(String[] args) {

        Bilet.ULGOWY_GODZINNY.wyswietlDaneOBilecie();

        Bilet.wyznaczBilet(40,104,10.0);

        Bilet bilet = Bilet.ULGOWY_GODZINNY;
    }
}
