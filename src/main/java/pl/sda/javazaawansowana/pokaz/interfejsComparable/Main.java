package pl.sda.javazaawansowana.pokaz.interfejsComparable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
       /* // tak moglismy sortowac inty
        int[] tablicaIntow = new int[]{30, 1234, 23, 546, 67};
        for (int i : tablicaIntow) {
            System.out.println(i);
        }
        Arrays.sort(tablicaIntow);
        for (int i : tablicaIntow) {
            System.out.println(i);
        }*/


        Student student = new Student("Marcin", 3.5);
        Student student1 = new Student("Artur", 4.0);
        Student student2 = new Student("Borek", 2.0);
        Student student3 = new Student("Artur", 5.0);
        Student student4 = new Student("Artur", 5.5);
        Student student5 = new Student("Artur", 2.3);
        Student student6 = new Student("Artur", 3.7);
        Student student7 = new Student("Artur", 3.2);

        Student[] tablicaStudenciakow = new Student[]{student, student1, student2, student3, student4, student5, student6, student7};
        System.out.println("Przed posortowaniem");
        for (Student s : tablicaStudenciakow) {
            System.out.println(s);
        }

        Arrays.sort(tablicaStudenciakow);


        System.out.println("Po posortowaniu");
        for (Student s : tablicaStudenciakow) {
            System.out.println(s);
        }




        Arrays.sort(tablicaStudenciakow, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               return Double.compare(o1.sredniaOcen, o2.sredniaOcen);
            }
        });




        System.out.println("Po posortowaniu klasa anonimowa");
        for (Student s : tablicaStudenciakow) {
            System.out.println(s);
        }

        Arrays.sort(tablicaStudenciakow);


    }
}
