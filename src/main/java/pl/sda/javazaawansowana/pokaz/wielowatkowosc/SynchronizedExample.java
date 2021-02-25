package pl.sda.javazaawansowana.pokaz.wielowatkowosc;

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {

        Value value = new Value(0);

        new Thread(new Incrementer(value)).start();
        new Thread(new Incrementer(value)).start();
        System.out.println("ide spac");
        Thread.sleep(10000);
        System.out.println("obudzilem sie");

        System.out.println(value.getSomeValue());
    }
}

class Incrementer implements Runnable{
    private final Value value;

    public Incrementer(Value value) {
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            value.increaseValue();
        }

        System.out.println(value.getSomeValue());

    }

}


class Value {
    private Integer someValue;

    public Value(Integer someValue) {
        this.someValue = someValue;
    }

    public void increaseValue() {

        synchronized (this) {
            someValue++;
        }

    }

    public Integer getSomeValue() {
        return someValue;
    }
}
