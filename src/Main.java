import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(aktualnyCzas(pobranaData()));


    }

    public static LocalDate pobranaData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj date następnych zajęc w formacie YYYY-MM-DD:");
        String dataZajec = scanner.nextLine();
        return LocalDate.parse(dataZajec);
    }

    public static Period aktualnyCzas(LocalDate dataKolejnegoSpotkania) {
        LocalDate obecnyCzas = LocalDate.now();
        return Period.between(obecnyCzas, dataKolejnegoSpotkania);
    }



}