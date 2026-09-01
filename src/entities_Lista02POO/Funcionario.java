package entities_Lista02POO;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double imposto;

    public Funcionario (String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * (porcentagem / 100.0);

    }

    public String toString() {
        return String.format("%s, R$ %.2f", nome, salarioLiquido());

    }
}
