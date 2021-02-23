package pl.sda.javapodstawy.metody;

public class Parzystosc {

    public static void main(String[] args) {
        drukujParzystoscLiczby(12);
        System.out.println(czyLiczbaJestParzysta(179));
    }

    public static void drukujParzystoscLiczby(int liczbaDoSprawdzenia) {
        if (liczbaDoSprawdzenia % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
    }

    public static boolean czyLiczbaJestParzysta(int liczbaDoSprawdzenia) {
        return liczbaDoSprawdzenia % 2 == 0;
        /* linijka powyzej, jest skrocym zapisem tego:

        if(liczbaDoSprawdzenia % 2 == 0){
            return true;
        } else {
            return false;
        }

         */
    }
}
