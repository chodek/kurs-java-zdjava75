package pl.sda.javapodstawy.petle;

import java.util.Scanner;

public class ZadanieDomowe {

    public static void main(String[] args) {

        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a:");
        a = scanner.nextInt();
        System.out.println("Podaj b:");
        b = scanner.nextInt();
        scanner.nextLine();

        if(a > b){ // to trzeba zamienic miejscami a z b
            int temp = b;
            b = a;
            a = temp;
        }

        System.out.println("Czy chcesz wyswietlic [parzyste] czy [nieparzyste]?");
        String parzystosc = scanner.nextLine();

        switch (parzystosc){
            case "parzyste":
                for (int i = a + 1; i < b; i++) {
                    if (i % 2 == 0){
                        System.out.println(i);
                    }
                }
                break;
            case "nieparzyste":
                for (int i = a + 1; i < b; i++) {
                    if (i % 2 == 1){
                        System.out.println(i);
                    }
                }
                break;
            default:
                System.out.println("Nie rozumiem jakie liczby chcesz wyświetlić!");
                break;
        }
    }
}
