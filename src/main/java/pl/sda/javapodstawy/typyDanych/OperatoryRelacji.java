package pl.sda.javapodstawy.typyDanych;

public class OperatoryRelacji {
    public static void main(String[] args) {
        String tekstowa = "TEKST";
        char znakowa = 'g';
        int liczbowa = 154;
        liczbowa += 6;
        liczbowa -= 52;
        System.out.println("7a. " + liczbowa + znakowa + tekstowa);
        int kodAsciiznakowa = znakowa;
        System.out.println("7b. " + liczbowa + kodAsciiznakowa + tekstowa);
    }
}
