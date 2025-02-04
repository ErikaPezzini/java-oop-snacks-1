public class ContoBancario {
    private String numeroConto;
    private double saldo;

    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0.0;
    }

    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
        } else {
            System.out.println("Importo non valido per il deposito.");
        }
    }

    public void preleva(double importo) {
        if (importo > 0 && saldo >= importo) {
            saldo -= importo;
        } else {
            System.out.println("Saldo insufficiente o importo non valido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConto() {
        return numeroConto;
    }
}
