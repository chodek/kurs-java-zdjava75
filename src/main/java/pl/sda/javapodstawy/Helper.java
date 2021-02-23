package pl.sda.javapodstawy;

import java.util.Scanner;

public class Helper {

    public static int pobierzInta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj inta: ");
        return scanner.nextInt();
    }

    public static void wypiszTablice(Object[] tablicaDoWypisania){
        for (Object o : tablicaDoWypisania) {
            System.out.println(o);
        }
    }

}
