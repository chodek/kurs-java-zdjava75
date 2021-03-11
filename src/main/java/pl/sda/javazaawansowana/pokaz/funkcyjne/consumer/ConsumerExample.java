package pl.sda.javazaawansowana.pokaz.funkcyjne.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> {
            s = s.trim();
            System.out.println(s);
        };

        trimValue("    text       ", stringConsumer);
    }

    static void trimValue(String s, Consumer<String> trimAction){
        trimAction.accept(s);
    }
}
