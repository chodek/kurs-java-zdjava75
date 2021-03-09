package pl.sda.javazaawansowana.pokaz.rekurencja;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumujTabliceRekurencyjnie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));

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

    public static int sumujTabliceRekurencyjnie(int[] tablica){
        return sumujTabliceRekurencyjnie(tablica, 0);
    }

    public static int sumujTabliceRekurencyjnie(int[] tablica, int i) {
        if (i < tablica.length - 1) {
            return tablica[i] + sumujTabliceRekurencyjnie(tablica, i + 1);
        } else {
            return tablica[i];
        }
    }

}
