package pl.sda.javazaawansowana.pokaz.wielowatkowosc;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadExample {

    public static void main(String[] args) {

        HelloWorldThread helloWorldThread = new HelloWorldThread();

        Thread thread = new Thread(new HelloWorldRunnableThread());

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 1000; i++) {
                    System.out.println(i);
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = -1000; i < 0; i++) {
                    System.out.println(i);
                }
            }
        });

        helloWorldThread.start();
        thread.start();
        thread2.start();
        thread3.start();

        System.out.println("Hello world from Main Thread");
        System.out.println(Thread.currentThread().getId()+ " - id of main thread ");




    }
}


class HelloWorldThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello world from another Thread");
        System.out.println(Thread.currentThread().getId() + " - id of another thread ");
    }
}

class HelloWorldRunnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello world from another Thread from class implementing Runnable");
        System.out.println(Thread.currentThread().getId()+ " - id of main thread ");
    }
}
