package pl.sda.javazaawansowana.zadania.prezentacje.IO.mecze;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Game {
    private final String teamOne;
    private final String teamTwo;
    private final int scoreOne;
    private final int scoreTwo;
    private int penaltyScoreOne;
    private int penaltyScoreTwo;

    public static List<Game> loadNGames(int n) {
        List<Game> gameList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            gameList.add(loadSingleGame());
        }
        return gameList;
    }

    private static Game loadSingleGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj druzyne 1:");
        String teamOne = scanner.nextLine();
        System.out.println("Podaj druzyne 2:");
        String teamTwo = scanner.nextLine();
        System.out.println("Podaj wynik druzyny 1:");
        int scoreOne = scanner.nextInt();
        System.out.println("Podaj wynik druzyny 2:");
        int scoreTwo = scanner.nextInt();
        Integer penaltyOne, penaltyTwo;
        if (scoreOne == scoreTwo) {
            System.out.println("Podaj wynik karnych druzyny 1:");
            penaltyOne = scanner.nextInt();
            System.out.println("Podaj wynik karnych druzyny 2:");
            penaltyTwo = scanner.nextInt();
            return new Game(teamOne, teamTwo, scoreOne, scoreTwo, penaltyOne, penaltyTwo);
        } else {
            return new Game(teamOne, teamTwo, scoreOne, scoreTwo);
        }
    }

    @Override
    public String toString() {
        if (penaltyScoreOne == 0 && penaltyScoreTwo == 0) {
            return teamOne + " " + scoreOne + " : " + scoreTwo + " " + teamTwo;
        } else {
            return teamOne + " " + scoreOne
                    + " <" + penaltyScoreOne + "> : <" + penaltyScoreTwo + "> "
                    + scoreTwo + " " + teamTwo;
        }

    }
}
