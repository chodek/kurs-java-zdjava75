package pl.sda.javazaawansowana.pokaz.wielowatkowosc.deadlock;

import java.security.spec.RSAOtherPrimeInfo;

public class Deadlock {

    public static void main(String[] args) throws InterruptedException {
        final String resource1 = "resoruce 1";
        final String resource2 = "resoruce 2";

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                synchronized (resource1){
                    System.out.println("Watek 1 blokuje zasob 1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource2){
                        System.out.println("Watek 1 blokuje zasob 2");
                    }

                }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                synchronized (resource2){
                    System.out.println("Watek 2 blokuje zasob 2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1){
                        System.out.println("Watek 2 blokuje zasob 1");
                    }

                }
            }
        };


        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();
        System.out.println("Czy dojdziemy do tej linijki kodu?");
    }
}
