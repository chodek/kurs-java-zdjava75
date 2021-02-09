package pl.sda.zdjavapol75;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        Integer[] tablicaIntow = new Integer[]{1, 3, 5, 10, 15, 20, 29, 30, 50, 102};
        Integer[] nieposortowanaTablicaIntow = new Integer[]{105, 2, 24};
        Helper.wypiszTablice(nieposortowanaTablicaIntow);
        Arrays.sort(nieposortowanaTablicaIntow);
        System.out.println("___________________________________");
        Helper.wypiszTablice(nieposortowanaTablicaIntow);
        System.out.println(Arrays.binarySearch(nieposortowanaTablicaIntow, 2));


    }

    private static boolean czyWTablicyJestLiczba(int[] tablicaIntow, int i) {
        for (int j = 0; j < tablicaIntow.length; j++) {
            if (tablicaIntow[j] == i) {
                return true;
            }
        }
        return false;
    }


}
