package pl.sda.javapodstawy.varargs;

public class Kalkulator {

    public static int dodaj(int... liczbyDoDodania) {
        int suma = 0;
        for (int i = 0; i < liczbyDoDodania.length; i++) {
            suma += liczbyDoDodania[i];
        }
        return suma;
    }

    public static int odejmij(int... liczbyDoOdjecia) {
        int roznica = 0;
        for (int i = 0; i < liczbyDoOdjecia.length; i++) {
            roznica -= liczbyDoOdjecia[i];
        }
        return roznica;
    }


    public static void main(String[] args) {
        System.out.println(dodaj(5,5,7,7));
        System.out.println(dodaj());

        System.out.println(odejmij(6,6,3,3));
        System.out.println(odejmij(70));
        System.out.println(odejmij());

        System.out.println(odejmij(new int[]{1,23}));


    }
}
