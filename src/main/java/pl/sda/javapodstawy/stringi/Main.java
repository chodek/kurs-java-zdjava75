package pl.sda.javapodstawy.stringi;

public class Main {

    public static void main(String[] args) {

        String slowo = " Hello World ";
        slowo = slowo.trim(); // "Hello World";
        slowo = slowo.toUpperCase(); // "HELLO WORLD";
        slowo = slowo.replace("WORLD", "Poland"); // "HELLO Poland";


        System.out.println( "_____________________________________________________");
        StringBuilder sb = new StringBuilder(" Hello World ");
        sb.trimToSize();
        sb.reverse();
        System.out.println(sb.toString());

    }
}
