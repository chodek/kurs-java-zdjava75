package pl.sda.javazaawansowana.zadania.pdf.wielowatkowosc.zad2;

public class Bridge {

    public void goThrough(Car car){
        synchronized (this) {
            System.out.println("Samochod: " + car + " bedzie przejezdzal przez most");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Przejechal");
        }
    }

}
