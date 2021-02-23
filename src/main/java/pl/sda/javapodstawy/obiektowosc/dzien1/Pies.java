package pl.sda.javapodstawy.obiektowosc.dzien1;

public class Pies {

    int wiek;
    String imie;
    String umaszczenie;

    public static void dajGlos(double cos){
        System.out.println("Hau hau!");
    }

    public static void dajGlos(int cos){
        int liczba = 5;
        System.out.println("Hau hau!");
    }

    public static void main(String[] args) {
        dajGlos(123.0);
        dajGlos(123);

    }

    public String aportuj(String kijek){
        System.out.println("Biegne biegne biegne po kijek");
        return kijek;
    }

    public void przedstawSie(){
        System.out.println("Jestem: " + imie + " mam " + wiek + " lat, jestem koloru " + umaszczenie);
    }


}
