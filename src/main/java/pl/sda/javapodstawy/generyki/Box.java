package pl.sda.javapodstawy.generyki;

public class Box<T>  {

    private T item;


    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class NiegenerycznyDziedziczasyBox extends Box<String> {


}

class GenerycznyDziedziczacyBox<T> extends Box<T> {


}