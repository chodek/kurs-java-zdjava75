package pl.sda.javazaawansowana.pokaz.interfejsComparable;

import java.util.Objects;

public class Student implements Comparable {

    String imie;
    double sredniaOcen;

    public Student(String imie, double sredniaOcen) {
        this.imie = imie;
        this.sredniaOcen = sredniaOcen;
    }

    public String getImie() {
        return imie;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.sredniaOcen, sredniaOcen) == 0 && Objects.equals(imie, student.imie);
    }


   /* metoda ktora posortuje nam obiekty wg sredniej rosnaco
    @Override
    public int compareTo(Object o) {
        Student os = (Student) o;
        if(this.sredniaOcen < os.sredniaOcen){
            return -1;
        } else if (this.sredniaOcen > os.sredniaOcen){
            return 1;
        } else {
            return 0;
        }
    }*/

    /* metoda ktora posortuje nam obiekty wg sredniej rosnaco - tylko ladniejsza forma, bo robi to samo co metoda wyzej
    @Override
    public int compareTo(Object o) {
        Student os = (Student) o;
        return Double.compare(sredniaOcen, os.sredniaOcen);
    }*/

   /* sortowanie studentow wg dlugosci ich imion rosnaco
    @Override
    public int compareTo(Object o) {
        return Integer.compare(imie.length(), ((Student)o).imie.length());
    }
*/
    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", sredniaOcen=" + sredniaOcen +
                '}';
    }



    @Override
    public int compareTo(Object o) {
        return Integer.compare(imie.length(), ((Student)o).imie.length());
    }
}
