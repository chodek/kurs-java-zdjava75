package pl.sda.zdjavapol75.podstawyjavaprogramowanie.zad4;


import pl.sda.zdjavapol75.Helper;

public class Main {

    public static void main(String[] args) {

        wypiszLiczbyZZastapieniem(Helper.pobierzInta());

    }

    private static void wypiszLiczbyZZastapieniem(int pobranaLiczba) {
        if (pobranaLiczba <= 0) {
            System.out.println("Za mala liczba");
            return;
        }
        for (int i = 1; i <= pobranaLiczba; i++) {
            if (i % 21 == 0) {
                System.out.println("Pif Paf");
            } else if (i % 7 == 0) {
                System.out.println("Paf");
            } else if (i % 3 == 0) {
                System.out.println("Pif");
            } else {
                System.out.println(i);
            }
        }
    }



}
