package pl.sda.javapodstawy.obiektowosc.statycznosc.pokaz;

public class TestFabrykiAut {
    public static void main(String[] args) {

        FabrykaAut pierwsza = new FabrykaAut();
        FabrykaAut druga = new FabrykaAut();


        pierwsza.wyprodukujSamochod();
        pierwsza.wyprodukujSamochod();
        pierwsza.wypiszIloscWyprodukowanych();
        pierwsza.wypiszNazweFabryki();
        System.out.println("##################################################");
        druga.wypiszIloscWyprodukowanych();
        druga.wyprodukujSamochod();
        System.out.println("##################################################");
        pierwsza.wypiszIloscWyprodukowanych();

    }


}
