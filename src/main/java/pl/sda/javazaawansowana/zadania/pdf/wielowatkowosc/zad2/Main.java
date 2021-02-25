package pl.sda.javazaawansowana.zadania.pdf.wielowatkowosc.zad2;

public class Main {

    public static void main(String[] args) {
        Bridge bridge = new Bridge();
        Car car1 = new Car("BMW", "coupe");
        Car car2 = new Car("Ford", "sedan");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.goThrough(car1);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.goThrough(car2);
            }
        });
        
        thread1.start();
        thread2.start();

    }
}
