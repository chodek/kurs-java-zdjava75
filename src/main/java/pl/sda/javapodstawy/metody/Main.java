package pl.sda.javapodstawy.metody;

public class Main {
    public static void main(String[] args) {

        // Sposób na wywowlanie metody niestatycznej - to przypomina sposob uzycia Scannera i Randoma
        KlasaZMetodami zmiennaTypuKlasaZMetodami = new KlasaZMetodami();
        zmiennaTypuKlasaZMetodami.metodaNiestatyczna();

        // Sposob na wywolanie metody statycznej - to jest blizej sposobu uzycia System.out.println()
        KlasaZMetodami.metodaStatyczna();


    }
}
