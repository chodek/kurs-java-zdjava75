package pl.sda.zdjavapol75.obiektowosc.statycznosc.pokaz;

public class FabrykaAut {

    public final double STALA_PI = 3.14;
    public String nazwaFabryki;

    public static int iloscWyprodukowanychEgzemplarzyNaSwiecie;

    public void wyprodukujSamochod(){
        iloscWyprodukowanychEgzemplarzyNaSwiecie++;
    }

    public void wypiszIloscWyprodukowanych(){
        System.out.println(iloscWyprodukowanychEgzemplarzyNaSwiecie);
    }

    public void wypiszNazweFabryki(){
        System.out.println(nazwaFabryki);
    }
}
