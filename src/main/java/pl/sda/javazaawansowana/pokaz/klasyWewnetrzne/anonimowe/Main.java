package pl.sda.javazaawansowana.pokaz.klasyWewnetrzne.anonimowe;


public class Main {

    public static void main(String[] args) {

        Witacz jakisWitacz = new Witacz(){
            @Override
            public void powitaj() {
                System.out.println("Dzien dobry");
            }
        };


        Witacz jakiNowyWitacz = new Witacz(){
            @Override
            public void powitaj() {
                System.out.println("Dobry den!");
            }
        };


        jakisWitacz.powitaj();
        jakiNowyWitacz.powitaj();


        System.out.println(jakisWitacz.getClass());
        System.out.println(jakiNowyWitacz.getClass());

    }
}
