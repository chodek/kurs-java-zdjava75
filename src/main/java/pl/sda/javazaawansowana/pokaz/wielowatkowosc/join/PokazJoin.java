package pl.sda.javazaawansowana.pokaz.wielowatkowosc.join;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PokazJoin {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        final List<Integer> ints = new ArrayList<>();
        final Thread thread1 = new Thread(new SimpleThread(ints));
        final Thread thread2 = new Thread(new SimpleThread(ints));

        thread1.start();
        thread2.start();

        thread2.interrupt();


        thread1.join(1000);

        thread2.join(1000);

        System.out.println(ints.size());

        long end = System.currentTimeMillis();
        System.out.println(end - start);


    }
}


class SimpleThread implements Runnable {

    private final List<Integer> ints;

    public SimpleThread(List<Integer> ints) {
        this.ints = ints;
    }

    @Override
    public void run() {
        while (true) {
            ints.add(new Random().nextInt());
        }
    }
}