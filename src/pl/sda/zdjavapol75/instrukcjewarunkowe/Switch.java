package pl.sda.zdjavapol75.instrukcjewarunkowe;

public class Switch {

    public static void main(String[] args) {
        String tekst = "Ala";

        switch (tekst) {
            case "Ala":
                System.out.println("Witaj Ala");
                break; // Brak break w tym miejscu spowoduje wykonywanie wszystkich instrukcji poniezej, az do napotkania break
            case "Ola":
                System.out.println("Witaj Ola");
                break;
            default:
                System.out.println("Witaj nieznajomy");
                break;
        }
    }
}
