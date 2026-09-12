package Desafios;

public class ContaBancaria {
    private static final double taxa = 3.50;
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public ContaBancaria(int numeroConta, String titular, double depositoInicial) {
        this(numeroConta, titular);
        depositar(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double quantia) {
        this.saldo += quantia;
    }

    public void sacar(double quantia) {
        this.saldo -= quantia + taxa;
    }

    public String toString() {
        return "Conta"
        + numeroConta
        + ", Titular: "
        + titular
        + ", Saldo: R$"
        + String.format("%.2f", saldo);

    }

}
