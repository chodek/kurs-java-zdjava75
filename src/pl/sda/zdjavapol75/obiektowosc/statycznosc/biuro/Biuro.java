package pl.sda.zdjavapol75.obiektowosc.statycznosc.biuro;

public class Biuro {

    private static int iloscOsobWewnatrz;
    private String nazwa;

    public static int getIloscOsobWewnatrz() {
        return iloscOsobWewnatrz;
    }

    public static void setIloscOsobWewnatrz(int iloscOsobWewnatrz) {
        Biuro.iloscOsobWewnatrz = iloscOsobWewnatrz;
    }
}
