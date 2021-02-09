package pl.sda.zdjavapol75.podstawyjavaprogramowanie.zad19;

public class Poem {

    private int stropheNumbers;
    private Author author;

    public Poem(int stropheNumbers, Author author) {
        this.stropheNumbers = stropheNumbers;
        this.author = author;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }

    public Author getAuthor() {
        return author;
    }

    public static Poem findLongestPoem(Poem[] poemsTable) {
        int currentMaxLength = 0, indexOfCurrentMaxLength = -1;
        for (int i = 0; i < poemsTable.length; i++) {
            if (poemsTable[i].getStropheNumbers() > currentMaxLength) {
                currentMaxLength = poemsTable[i].getStropheNumbers();
                indexOfCurrentMaxLength = i;
            }
        }
        return poemsTable[indexOfCurrentMaxLength];
    }


}
