package pl.sda.javapodstawy.typyDanych;

public class KonwersjeTypow {
    public static void main(String[] args) {

        short shortA = 20000;
        int intA = shortA;

        short shortF = 1000;
        byte byteF = (byte) shortF;

        System.out.println(byteF);
    }
}
