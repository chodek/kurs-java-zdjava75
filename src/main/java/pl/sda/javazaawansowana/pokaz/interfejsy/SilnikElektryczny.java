package pl.sda.javazaawansowana.pokaz.interfejsy;

public class SilnikElektryczny implements IElektryczny{

    double zuzyciePradunaGodzine = 5.5;
    int ileGodzinWlaczony;


    @Override
    public void zuzyjPrad() {
        System.out.println("Mniam mniam, pyszny prad");
    }

    @Override
    public double wystawRachunekZaPrad() {
        return zuzyciePradunaGodzine * ileGodzinWlaczony;
    }

    public void whatever(){

    }
}
