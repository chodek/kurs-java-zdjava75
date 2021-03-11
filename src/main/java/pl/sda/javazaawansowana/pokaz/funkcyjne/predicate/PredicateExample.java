package pl.sda.javazaawansowana.pokaz.funkcyjne.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> predicate = value -> value >= 0;

        checkTest(predicate, -10);
        checkTest(predicate, 100);
    }


    static void checkTest(Predicate<Integer> predicate, int valueToCheck) {
        System.out.println(predicate.test(valueToCheck));
    }


}
