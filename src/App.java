public class App {
    public static void main(String[] args) throws Exception {
        Studente studente1 = new Studente("Lara", "Bitta", 15);
        Studente studente2 = new Studente("Luigi", "Rossi", 16);
        Studente studente3 = new Studente("Rosalinda", "Villani", 14);
        System.out.println(studente1.getDettagli());
        System.out.println(studente2.getDettagli());
        System.out.println(studente3.getDettagli());
    }
}
