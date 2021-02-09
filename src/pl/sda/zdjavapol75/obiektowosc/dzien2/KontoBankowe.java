package pl.sda.zdjavapol75.obiektowosc.dzien2;

import pl.sda.zdjavapol75.obiektowosc.dzien3.Superbohater;

public class KontoBankowe {
    private long numerKonta;
    private int stanKonta;
    private int iloscWykonanychOperacji;
    private String nazwiskoWlasciciela;



    public KontoBankowe(long numerKonta) {
        this.numerKonta = numerKonta;

    }

    public KontoBankowe(long numerKonta, int stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
        this.iloscWykonanychOperacji = 0;
    }

    public  long getNumerKonta() {
        return numerKonta;
    }

    public int getStanKonta() {
        return stanKonta;
    }

    public int getIloscWykonanychOperacji() {
        return iloscWykonanychOperacji;
    }

    public String getNazwiskoWlasciciela() {
        return nazwiskoWlasciciela;
    }

    public void setNazwiskoWlasciciela(String nazwiskoWlasciciela) {
        this.nazwiskoWlasciciela = nazwiskoWlasciciela;
    }

    @Override
    public String toString() {
        return "KontoBankowe{" +
                "numerKonta=" + numerKonta +
                ", stanKonta=" + stanKonta +
                ", iloscWykonanychOperacji=" + iloscWykonanychOperacji +
                ", nazwiskoWlasciciela='" + nazwiskoWlasciciela + '\'' +
                '}';
    }

    void wyswietlStanKonta() {
        System.out.println("Twoj stan konta to: " + stanKonta);
    }

    void wplacSrodki(int kwotaWplaty) {
        stanKonta += kwotaWplaty;
    }

    int pobierzSrodki(int kwotaWyplaty) {
        stanKonta -= kwotaWyplaty;
        return kwotaWyplaty;
    }

    void test() {
        numerKonta = 10;  // jest dostep do private pola
        stanKonta = 10; // jest dostep do protected
        iloscWykonanychOperacji = 10; // jest dostep do public
    }


}
