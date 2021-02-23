package pl.sda.javapodstawy.tablice;

public class PodstawyTablic {


    public static void main(String[] args) {
        // Zadanie 1
        System.out.println("Zadanie 1");
        int[] liczby = new int[]{1, 30, 50, 10};

        // Zadanie 2
        System.out.println("Zadanie 2");
        System.out.println(liczby[0]);
        System.out.println(liczby[1]);

        // Zadanie 3
        System.out.println("Zadanie 3");
        System.out.println(liczby); // To nie zadziala tak ladnie jak sie spodziewacie







        for (int i = 0; i < liczby.length; i++) {
            System.out.println(liczby[i]);
        }

        for (int koljenyElementTablicy : liczby){
            System.out.println(koljenyElementTablicy);
        }













        // Zadanie 4
        System.out.println("Zadanie 4");
        for (int i = 0; i < liczby.length; i++) {
            if (i % 2 == 0) {
                System.out.println(liczby[i]);
            }
        }

        // Zadanie 5
        System.out.println("Zadanie 5");
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] % 2 == 0) {
                System.out.println(liczby[i]);
            }
        }
    }

    public static void metodaNiestartowa(){
        System.out.println("adasdasdas");
        System.out.println("adasdasdas");
        System.out.println("adasdasdas");
        System.out.println("adasdasdas");
    }


}
