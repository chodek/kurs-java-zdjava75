import pl.sda.zdjavapol75.metody.Zadanie;

import java.util.Random;
import java.util.Scanner;

public class TestyZadanDomowych {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int a = scan.nextInt();
        for (int i = 2; i < a + 2; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
