package javazaawansowana.zadania.prezentacje.slajd84;

public class Main {

    public static void main(String[] args) {

        Samochod auto = new Samochod();

        Kabriolet cabrio = new Kabriolet();
        Kabriolet cabrio2 = new Kabriolet();

        System.out.println(cabrio.equals(cabrio2));

        cabrio.przyspiesz();

        System.out.println(cabrio.equals(cabrio2));

        /*for (int i = 0; i < 20; i++) {
            System.out.print(auto);
            auto.przyspiesz();
            System.out.print(cabrio);
            cabrio.przyspiesz();
        }

        cabrio.equals(cabrio2); */


    }
}