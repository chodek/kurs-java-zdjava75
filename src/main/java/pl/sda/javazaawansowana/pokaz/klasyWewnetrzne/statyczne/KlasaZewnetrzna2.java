package pl.sda.javazaawansowana.pokaz.klasyWewnetrzne.statyczne;

public class KlasaZewnetrzna2 {

    public static class KlasaWewnetrzna2{

    }

    private KlasaWewnetrzna2 instantiate(){
        return  new KlasaWewnetrzna2();
    }


    private static void inicjalizacjaWewnetrznejKlasyStatycznej(){
        KlasaZewnetrzna2 klasaZewnetrzna2 = new KlasaZewnetrzna2();
        KlasaZewnetrzna2.KlasaWewnetrzna2 instancja1 = klasaZewnetrzna2.instantiate();
        KlasaZewnetrzna2.KlasaWewnetrzna2 instancja2 = new KlasaZewnetrzna2.KlasaWewnetrzna2();

    }

}
