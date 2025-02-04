public class RegistroStudenti {
    private Studente[] studenti;
    private int count;

    public RegistroStudenti(){
        studenti = new Studente[20];
        count = 0;
    }

    public void addStudente(Studente studente){
        if (count< studenti.length) {
            studenti[count] = studente;
            count++;
        } else {
            System.out.println("La classe e' piena!");
        }
    }

    public void stampaRegistro(){
        for (int i = 0; i < count; i++){
            System.out.println(studenti[i].getDettagli());
        }
    }
}
