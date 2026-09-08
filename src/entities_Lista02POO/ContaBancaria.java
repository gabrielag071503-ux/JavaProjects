package entities_Lista02POO;

public class ContaBancaria {
    private static final double taxa = 5.00;
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular) {
        this.titular = titular;
        this.numero = numero;
    }

    public ContaBancaria(int numero, String titular, double depositoInicial) {
        this(numero, titular);
        depositar(depositoInicial);
    }

    public int getNumero() {
        return numero;
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
        return "Conta "
        + numero
        + ", Nome do titular: " 
        + titular
        + ", Saldo: R$ " 
        + String.format("%.2f", saldo);
    }   
}