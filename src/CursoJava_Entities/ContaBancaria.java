package CursoJava_Entities;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
        this(numeroConta, nomeTitular);
        depositar(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor + 5.0;
    }

    public String toString() {
        return "Account "
                + numeroConta
                + ", Holder: "
                + nomeTitular
                + ", Balance: $ "
                + String.format("%.2f", saldo);
    }
}
