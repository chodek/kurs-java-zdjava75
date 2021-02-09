package javazaawansowana.zadania.prezentacje.slajd84;

public class Main {

    public static void main(String[] args) {

        Samochod auto = new Samochod("BMW","czerwone", 1994, 120, false);

        Kabriolet cabrio = new Kabriolet("BMW","czerwone", 1994, 120, false, true);
        Kabriolet cabrio2 = new Kabriolet("BMW","czarne", 1994, 120, false, true);
        Kabriolet cabrio3 = new Kabriolet("BMW","czerwone", 1994, 120, false, true);

        System.out.println(auto.equals(cabrio));
        System.out.println(auto.equals(cabrio2));


        System.out.println(cabrio.equals(cabrio2));
        System.out.println(cabrio.equals(cabrio3));

        System.out.println(cabrio2.equals(cabrio3));



        /*for (int i = 0; i < 20; i++) {
            System.out.print(auto);
            auto.przyspiesz();
            System.out.print(cabrio);
            cabrio.przyspiesz();
        }

        cabrio.equals(cabrio2); */


    }
}