package pl.sda.javapodstawy.petle;

import java.util.Scanner;

public class SumowanieWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxZakres = scanner.nextInt();
        int i = 0;
        int suma = 0;

        while (i <= maxZakres) {
            suma += i;
            i++;
        }
        System.out.println(suma);
    }
}
