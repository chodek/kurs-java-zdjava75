package pl.sda.javapodstawy.obiektowosc.statycznosc.biuro;

public class Pracownik {

    public void wejdzDobiura() {
        /*
         Linijka ponizej zadziala tylko gdy pole iloscOsobWewnatrz jest publiczne
         Biuro.iloscOsobWewnatrz++;
        */

        // Tak musi byc zrealizowane, kiedy pole jest prywatne, a dostep do niego tylko za pomoca gettera i settera:
        Biuro.setIloscOsobWewnatrz(Biuro.getIloscOsobWewnatrz() + 1);
    }

    public void wyjdzZBiura() {
        Biuro.setIloscOsobWewnatrz(Biuro.getIloscOsobWewnatrz() - 1);
    }

}
