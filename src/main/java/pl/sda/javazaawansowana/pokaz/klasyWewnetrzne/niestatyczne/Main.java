package pl.sda.javazaawansowana.pokaz.klasyWewnetrzne.niestatyczne;

public class Main {


    public static void main(String[] args) {

        KlasaZewnetrzna kz = new KlasaZewnetrzna();

        KlasaZewnetrzna.KlasaWewnetrzna kw = kz.instantiate();

    }
}
