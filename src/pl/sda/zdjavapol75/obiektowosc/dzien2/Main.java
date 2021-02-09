package pl.sda.zdjavapol75.obiektowosc.dzien2;

public class Main {
    public static void main(String[] args) {




        KontoBankowe kontoAndrzeja = new KontoBankowe(123L);
        KontoBankowe kontoBeaty = new KontoBankowe(555L, 2000);

        KontoBankowe kontoPuste = new KontoBankowe(999L);

        kontoAndrzeja.wyswietlStanKonta();
        kontoBeaty.wyswietlStanKonta();

        // wersja prosta - robi to samo co nizej
        kontoAndrzeja.pobierzSrodki(1000);
        kontoBeaty.wplacSrodki(1000);

        // wersja zlozona - robi to samo co dwie linijki powyzej
        kontoBeaty.wplacSrodki(kontoAndrzeja.pobierzSrodki(1000));

        kontoAndrzeja.wyswietlStanKonta();
        kontoBeaty.wyswietlStanKonta();

        KontoBankowe kontoCwaniaka = new KontoBankowe(1L,0);

        // kontoCwaniaka.numerKonta = 10; // NIE MA dsotepu do pola private
        // kontoCwaniaka.stanKonta = 10; //jest dostep do protected
        // kontoCwaniaka.iloscWykonanychOperacji = 10; // jest dostep do public
        // kontoCwaniaka.nazwiskoWlasciciela = "asdasd";

        System.out.println(kontoCwaniaka.getNumerKonta());

        kontoCwaniaka.setNazwiskoWlasciciela("Chodkowski");


    }
}
