package pl.sda.javapodstawy.podstawyjavaprogramowanie.zad5;

import pl.sda.javapodstawy.Helper;

public class Main {

    public static void main(String[] args) {
        wypiszLiczbyPierwszeMniejszeOdZadanej(Helper.pobierzInta());
    }

    public static void wypiszLiczbyPierwszeMniejszeOdZadanej(int zadana) {
        for (int i = 2; i < zadana; i++) {
            if (isNumerPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isNumerPrime(int toCheck) {
        for (int i = 2; i < toCheck; i++) {
            if (toCheck % i == 0) {
                return false;
            }
        }
        return true;
    }


}
