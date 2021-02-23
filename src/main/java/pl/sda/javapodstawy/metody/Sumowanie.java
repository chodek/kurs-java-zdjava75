package pl.sda.javapodstawy.metody;

public class Sumowanie {

    public static void main(String[] args) {
        int wynikObliczen = sumujDwaInty(1,10);
        System.out.println(wynikObliczen);
        int jakasLiczba = 10;
    }


    public static int sumujDwaInty(int pierwszaLiczba, int drugaLiczba) {

        int suma = pierwszaLiczba + drugaLiczba;
        return suma;
    }

}
