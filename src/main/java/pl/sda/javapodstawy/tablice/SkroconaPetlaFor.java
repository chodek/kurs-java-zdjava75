package pl.sda.javapodstawy.tablice;

public class SkroconaPetlaFor {

    public static void main(String[] args) {
        String[] zdania = new String[]{" Ala ma kota ", "Bob ma psa ", " Pawel ma zolwia"};

        for (int i = 0; i < zdania.length; i++) {
            System.out.println( zdania[i] );
        }

        System.out.println("______________________________________________________________________");

        for (String zmiennaTypuString : zdania){
            System.out.println( zmiennaTypuString );
        }
    }
}
