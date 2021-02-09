package pl.sda.zdjavapol75.obiektowosc.dzien2.zadanieDomowe;

import pl.sda.zdjavapol75.obiektowosc.dzien2.Bank;
import pl.sda.zdjavapol75.obiektowosc.dzien2.KontoBankowe;

public class TestBanku {
    public static void main(String[] args) {

        KontoBankowe[] tablicaRachunkow = new KontoBankowe[3];
        tablicaRachunkow[0] = new KontoBankowe(111);
        tablicaRachunkow[1] = new KontoBankowe(222);
        tablicaRachunkow[2] = new KontoBankowe(333);
        Bank mbank = new Bank("mBank", tablicaRachunkow);


        System.out.println("Przed wykonaniem przelewu");
        System.out.println(tablicaRachunkow[0].getStanKonta());
        System.out.println(tablicaRachunkow[1].getStanKonta());
        System.out.println(tablicaRachunkow[2].getStanKonta());

        System.out.println("Uwaga idzie przelew!");
        mbank.wykonajPrzelew(111,333,5000);

        System.out.println("Po wykonaniu przelowu");
        System.out.println(tablicaRachunkow[0].getStanKonta());
        System.out.println(tablicaRachunkow[1].getStanKonta());
        System.out.println(tablicaRachunkow[2].getStanKonta());







    }
}
