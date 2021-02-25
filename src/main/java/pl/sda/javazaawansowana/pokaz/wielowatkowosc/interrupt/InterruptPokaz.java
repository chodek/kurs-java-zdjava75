package pl.sda.javazaawansowana.pokaz.wielowatkowosc.interrupt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InterruptPokaz {


    public static void main(String[] args) throws InterruptedException {
        final Thread sleepingThread = new Thread(new AnotherSleepingThread());

        sleepingThread.start();
        sleepingThread.interrupt();
    }
}

class AnotherSleepingThread implements Runnable {

    @Override
    public void run() {
        final List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            ints.add(new Random().nextInt());
        }
        if (Thread.currentThread().isInterrupted()) { // badz Thread.interrupted() - resetuje status
            System.out.println(Thread.currentThread().isInterrupted());
            System.out.println("I was interrupted");
            return;
        }
        int sum = 0;
        for (Integer anInt : ints) {
            sum += anInt;
        }
        System.out.println("suma: " + sum);


    }
}

class SleepingThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Ide spac!");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(" I was interrupted during sleep");
        } finally {
            System.out.println("Koniec spania");
        }

    }
}