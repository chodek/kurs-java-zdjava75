package javazaawansowana.pokaz.interfejsy;

public class Main {

    public static void main(String[] args) {


        SilnikElektryczny silnikElektryczny = new SilnikElektryczny();

        IElektryczny iElektryczny = new SilnikElektryczny();


        IElektryczny[] tablicaUrzadzenElektrycznych = new IElektryczny[]{silnikElektryczny}; //tutaj moglyby byc jeszcze hulajnoga, piekarnik itp w tablicy


        for (int i = 0; i < tablicaUrzadzenElektrycznych.length; i++) {
            tablicaUrzadzenElektrycznych[i].wystawRachunekZaPrad();
        }



    }
}
