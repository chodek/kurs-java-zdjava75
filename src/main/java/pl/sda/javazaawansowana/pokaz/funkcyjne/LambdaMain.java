package pl.sda.javazaawansowana.pokaz.funkcyjne;

import java.util.function.Consumer;

public class LambdaMain {

    public static void main(String[] args) {

        Action action = (int x, int y) -> {
            return x + "-" + y;
        };

        Action action1 = (x, y) -> x + "-" + y;





        Runnable runnable = () -> {
            System.out.println("Hello from runnable");
            System.out.println("{ and } cannot be omitted");
        };




        AppleEater<String> appleEater = apple -> System.out.println("Zjadam: " + apple);
        AppleEater<String> appleEater2 = String::toUpperCase;

        appleEater.consume("Czempion");


        Consumer<String> consumer = someString -> System.out.println(someString);
        Consumer<String> consumer2 = System.out::println;

        consumer2.accept("cokolwiek do consumera2");
















    }
}
