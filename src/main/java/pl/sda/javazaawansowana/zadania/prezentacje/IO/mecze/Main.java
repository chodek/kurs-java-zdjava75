package pl.sda.javazaawansowana.zadania.prezentacje.IO.mecze;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int gamesCount = askHowManyGames();
        List<Game> gamesList = Game.loadNGames(gamesCount);

        try {
            IOHelper.saveToFile(getFileName(), gamesList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getFileName() {
        System.out.println("Pod jaka nazwa pliku chcesz zapisac wyniki?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static int askHowManyGames() {
        System.out.println("How many games u want to enter?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
