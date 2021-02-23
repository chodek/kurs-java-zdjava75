package pl.sda.javazaawansowana.pokaz.klasyWewnetrzne.niestatyczne;

public class KlasaZewnetrzna {
    private String polePrywatne;

    public class KlasaWewnetrzna{

    }

    public KlasaWewnetrzna instantiate(){
        return new KlasaWewnetrzna();
    }

    private static void inicjalizacjaKlasyWewnetrznej(){
        KlasaZewnetrzna klasaZewnetrzna = new KlasaZewnetrzna();
        KlasaZewnetrzna.KlasaWewnetrzna instancja1 = klasaZewnetrzna.instantiate();
        KlasaZewnetrzna.KlasaWewnetrzna instancja2 = klasaZewnetrzna.new KlasaWewnetrzna();
    }

}


