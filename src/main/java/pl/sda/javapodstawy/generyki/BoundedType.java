package pl.sda.javapodstawy.generyki;

public class BoundedType<T extends Number & Cloneable & Comparable<T>> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
