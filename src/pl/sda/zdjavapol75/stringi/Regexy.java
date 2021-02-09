package pl.sda.zdjavapol75.stringi;

import java.util.regex.Pattern;

public class Regexy {
    public static void main(String[] args) {

        String zdanie = "Ala  ma kota i a takze psa !";
        String[] podzielony = zdanie.split("\\s{2}");

        Pattern jakisWzor = Pattern.compile("(Hello | World!)");

        for (int i = 0; i < podzielony.length; i++) {
            System.out.println(podzielony[i]);
        }



    }
}
