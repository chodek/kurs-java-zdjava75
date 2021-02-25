import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class PierwszyProgram {

    public static void main(String[] args)throws IOException {
        Path path = Paths.get("wynikiMeczy.txt");
        //Files.createFile(path);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile wyników meczy podasz?");
        int iloscMeczy = scanner.nextInt(); // a co z enterem po liczbie sie dzieje, jak uzywamy scanner.nextInt?
        String poczatkowyTekst ="Wyniki"+iloscMeczy+"meczy:\n";
        Files.write(path, poczatkowyTekst.getBytes(StandardCharsets.UTF_8), StandardOpenOption.WRITE);
        for (int i = 0; i <=iloscMeczy ; i++) { // <= czy lepiej < ? co sie wtedy zmieni?
            System.out.println("Kto z kim grał podaj pierwszą drużynę?");
            String druzyna1 = scanner.nextLine();
            System.out.println("Kto z kim grał podaj drugą drużynę?");
            String druzyna2 = scanner.nextLine();
            System.out.println("Ile goli zdobyła drużyna"+druzyna1);
            int druzyna1gole = scanner.nextInt();
            System.out.println("Ile goli zdobyła drużyna"+druzyna2);
            int druzyna2gole = scanner.nextInt();
            if (druzyna1gole==druzyna2gole){
                System.out.println("Jaki był wynik karnych. Podaj zdobyte gole"+druzyna1);
                int druzyna1goleKarne = scanner.nextInt();
                System.out.println("Jaki był wynik karnych. Podaj zdobyte gole"+druzyna1); //tutaj wyswietlamy druzyne2 raczej, a nie druzyne 1
                int druzyna2goleKarne = scanner.nextInt();
                String wynikMeczu =druzyna1 + "<" + druzyna1gole+">"+"("+druzyna1goleKarne+")"+":"
                        +"("+druzyna2goleKarne+")"+"<"+druzyna2gole+">"+druzyna2+"\n";
                Files.write(path, wynikMeczu.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
            } else {
                String wynikMeczu = druzyna1 + "<" + druzyna1gole+">" +":"+"<"+druzyna2gole+">"+druzyna2+"\n";
                Files.write(path, wynikMeczu.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND); // w ten sposob dopisujesz na koncu pliku dane
            }
        }
        Files.readAllBytes(path); // a co nam daje ta linijka?
    }


    // odejmowanie.dzialania.matematyka.zdjavapol75.sda.pl - proponowana nazwa domenowa dla dzialan matematycznych

}
