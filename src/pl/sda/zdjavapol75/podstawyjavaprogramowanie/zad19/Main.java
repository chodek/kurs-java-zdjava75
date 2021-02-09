package pl.sda.zdjavapol75.podstawyjavaprogramowanie.zad19;

public class Main {

    public static void main(String[] args) {
        Author[] authorsTable = new Author[3];
        authorsTable[0] = new Author("Brzechwa", "polska");
        authorsTable[1] = new Author("Milosz", "polska");
        authorsTable[2] = new Author("Mickiewicz", "polska");


        Poem[] poemsTable = new Poem[3];
        poemsTable[0] = new Poem(1, authorsTable[0]);
        poemsTable[1] = new Poem(110, authorsTable[1]);
        poemsTable[2] = new Poem(10, authorsTable[2]);

        System.out.println(Poem.findLongestPoem(poemsTable).getAuthor().getSurname());
    }


}
