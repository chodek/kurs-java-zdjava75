package pl.sda.javazaawansowana.pokaz.rekurencja;

public class Main {

    public static void main(String[] args) {

        int[] tablicaLiczb = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(sumujTabliceRekurencyjnie(tablicaLiczb));

        System.out.println(silnia(14));

        System.out.println(silniaR(20));

    }


    public static int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }

    public static int gcd2(int a, int b) {
        if (b != 0) {
            return gcd2(b, a % b);
        } else {
            return a;
        }
    }

    public static int sumujTabliceIteracyjnie(int[] tablica) {
        int sum = 0;
        for (int i : tablica) {
            sum += i;
        }
        return sum;
    }

    public static int sumujTabliceRekurencyjnie(int[] tablica) {
        return sumujTabliceRekurencyjnie(tablica, 0);
    }

    private static int sumujTabliceRekurencyjnie(int[] tablica, int i) {
        if (i < tablica.length - 1) {
            return tablica[i] + sumujTabliceRekurencyjnie(tablica, i + 1);
        } else {
            return tablica[i];
        }
    }

    public static int silnia(int a) {
        int toDoCzegoSieDomnaza = 1;
        for (int i = 1; i <= a; i++) {
            toDoCzegoSieDomnaza *= i;
        }
        return toDoCzegoSieDomnaza;
    }

    /*
    5! = 5 * 4 * 3 * 2

    5! = 5 * 4!
    5! = 5 * (4 * 3!)
    5! = 5 * (4 * (3 * 2!)
    5! = 5 * (4 * (3 * ( 2 * 1!)
    5! = 5 * (4 * (3 * ( 2 * 1 )

     */

    public static long silniaR(int a) {
        if (a < 2) {
            return 1;
        }
        return a * silniaR(a - 1);
    }
}
