package pl.sda.zdjavapol75.tablice.powtorka;


public class Main {


    public static void main(String[] args) {

        int[] tablicaIntow = new int[]{1, 23, 4};

        // dwa posoby na wypisanie elementow z tablicy
        for (int i = 0; i < tablicaIntow.length; i++) {
            System.out.println(tablicaIntow[i]);
        }

        for (int i : tablicaIntow) {
            System.out.println(i);
        }


        int[][] tablica2D = new int[][]{new int[]{1, 23}, new int[]{1, 2, 3, 4, 5}};

        tablica2D[0] = new int[10];
        tablica2D[1] = new int[500];

        String slowo = " cos";

        String[] tablicaStringow;


        int[] wartoscOtrzymanaZMetody = metodaX(5, 10);

    }


    public static int[] metodaX(int jedna, int druga) {
        int[] liczby = new int[]{6, 7, 8, 9};
        return liczby;
    }
}
