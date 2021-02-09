package pl.sda.zdjavapol75.obiektowosc.dzien3.enumy.robot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Robot walle = new Robot("Wall-e");

        System.out.println("Podaj komende robota: ");
        String[] wczytaneKomendy;
        do {
            Scanner scanner = new Scanner(System.in);
            wczytaneKomendy = scanner.nextLine().trim().toLowerCase().split(" ");

            switch (wczytaneKomendy[0]) {
                case "wlacz":
                    walle.wlaczRobota();
                    break;
                case "wylacz":
                    walle.wylaczRobota();
                    break;
                case "ruch":
                    walle.poruszRobotem(ustalRuchRobota(wczytaneKomendy));
                    break;
            }
        } while (!wczytaneKomendy[0].equalsIgnoreCase("koniec"));


    }

    private static RuchRobota ustalRuchRobota(String[] wczytaneKomendy) {
        if (wczytaneKomendy[1].equalsIgnoreCase(RuchRobota.KROK_LEWA.name())) {
            return RuchRobota.KROK_LEWA;
        }


        return RuchRobota.BRAK;
    }
}
