package pl.sda.javapodstawy.podstawyjavaprogramowanie.zad16;

import pl.sda.javapodstawy.Helper;

public class Ciag {

    public static void main(String[] args) {
        int[] tablicaLiczb = wczytajDaneDoTablicy(10);
        System.out.println(wyznaczDlugoscNajdluzszegoCiagu(tablicaLiczb, false));


    }

    private static int wyznaczDlugoscNajdluzszegoCiagu(int[] tablicaLiczb, boolean czyCiagRosnacy) {
        int dlugosCiaguBiezacego = 1;
        int maxDlugoscCiagu = 1;
        for (int i = 0; i < tablicaLiczb.length - 1; i++) {
            if (tablicaLiczb[i] < tablicaLiczb[i + 1]) {
                dlugosCiaguBiezacego += 1;
            } else {
                if (dlugosCiaguBiezacego > maxDlugoscCiagu) {
                    maxDlugoscCiagu = dlugosCiaguBiezacego;
                }
                dlugosCiaguBiezacego = 1;
            }
        }
        if (dlugosCiaguBiezacego > maxDlugoscCiagu) {
            maxDlugoscCiagu = dlugosCiaguBiezacego;
        }
        return maxDlugoscCiagu;
    }

    private static int[] wczytajDaneDoTablicy(int wielkoscTablicy) {
        int[] tablicaDanych = new int[wielkoscTablicy];

        for (int i = 0; i < tablicaDanych.length; i++) {
            tablicaDanych[i] = Helper.pobierzInta();
        }

        return tablicaDanych;
    }



}
