package pl.sda.javazaawansowana.pokaz.funkcyjne;

public class Main {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Uzywam klasy anonimowej");
            }
        });

        thread.start();



        Thread thread1 = new Thread( () -> {
            System.out.println("Uzywam lambdy!");

        });

        thread1.start();
    }
}
