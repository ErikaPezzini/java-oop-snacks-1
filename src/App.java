public class App {
    public static void main(String[] args) throws Exception {
        Studente studente1 = new Studente("Lara", "Bitta", 15);
        Studente studente2 = new Studente("Luigi", "Rossi", 16);
        Studente studente3 = new Studente("Rosalinda", "Villani", 14);
        System.out.println(studente1.getDettagli());
        System.out.println(studente2.getDettagli());
        System.out.println(studente3.getDettagli());

        System.out.println();

        ContoBancario conto = new ContoBancario("123456");
        conto.deposita(100.0);
        conto.preleva(20.50);
        System.out.println("Saldo attuale: " + conto.getSaldo());

        System.out.println();

        RegistroStudenti registro = new RegistroStudenti();
        registro.addStudente(studente1);
        registro.addStudente(studente2);
        registro.addStudente(studente3);
        registro.stampaRegistro();
    }
}
