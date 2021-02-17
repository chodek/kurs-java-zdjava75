
public class Main {
    public static void main(String[] args) {
        Candidate perfectCandidate = new Candidate(3, "remote, Poland");
        perfectCandidate.approachPerfectCandidate();
    }

    public static class Candidate {

        private final int minYearsOfExp;
        private final String location;

        public Candidate(int a, String b) {
            minYearsOfExp = a;
            location = b;
        }

        public void approachPerfectCandidate() {
            System.out.println(
                    "Dzień dobry Panie Marcinie!");
            System.out.println(
                    "Poszukuję obecnie Senior Java Developera.Forma zatrudnienia to UoP lub B2B.Czy byłby Pan zainteresowany"
                            + " ? Chętnie opowiem więcej podczas rozmowy telefonicznej. Pozdrawiam, Kamila");
        }

    }
}

