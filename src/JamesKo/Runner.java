package JamesKo;

public class Runner {
    public static void main(String[] args) {
        int[] scores0 = { 50, 50, 20, 80, 53 };
        int[] scores1 = { 20, 50, 50, 53, 80 };
        int[] scores2 = { 20, 50, 50, 80 };

        StudentRecord sr0 = new StudentRecord(scores0);
        StudentRecord sr1 = new StudentRecord(scores1);
        StudentRecord sr2 = new StudentRecord(scores2);

        StudentRecord[] sr = { sr0, sr1,  sr2 };

        for (int i = 0; i < sr.length; i++) {
            System.out.println("Score " + i + " improved? " + sr[i].improved());
            System.out.println("Score " + i + " final average? " + sr[i].finalAverage());
        }
    }
}
