package pl.sda.javazaawansowana.pokaz.funkcyjne;

@FunctionalInterface
public interface AppleEater<T> {
    void consume(T t);
}
