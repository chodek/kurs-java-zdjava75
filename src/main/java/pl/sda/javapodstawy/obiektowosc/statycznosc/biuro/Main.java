package pl.sda.javapodstawy.obiektowosc.statycznosc.biuro;

public class Main {

    public static void main(String[] args) {

        Pracownik jeden = new Pracownik();
        Pracownik dwa = new Pracownik();
        Pracownik trzy = new Pracownik();

        jeden.wejdzDobiura();
        System.out.println(Biuro.getIloscOsobWewnatrz());

        dwa.wejdzDobiura();
        System.out.println(Biuro.getIloscOsobWewnatrz());

        trzy.wyjdzZBiura();
        System.out.println(Biuro.getIloscOsobWewnatrz());

        dwa.wejdzDobiura();
        System.out.println(Biuro.getIloscOsobWewnatrz());

    }
}
