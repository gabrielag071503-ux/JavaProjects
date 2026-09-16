package Desafios;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double descontoPlanoSaude;

    public Funcionario(String nome, double salarioBruto) {
        this(nome, salarioBruto, 0.0);
    }

    public Funcionario(String nome, double salarioBruto, double descontoPlanoSaude) {
        this.nome = nome;
        this.setSalarioBruto(salarioBruto);
        this.descontoPlanoSaude = descontoPlanoSaude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        if (salarioBruto >= 0) {
            this.salarioBruto = salarioBruto;
        } else {
            System.out.println("Salário bruto inválido. O salário deve ser maior ou igual a zero.");
        }
    }

    public double getDescontoPlanoSaude() {
        return descontoPlanoSaude;
    }

    public void setDescontoPlanoSaude(double descontoPlanoSaude) {
        this.descontoPlanoSaude = descontoPlanoSaude;
    }

    public double calcularSalarioLiquido() {
        return salarioBruto - descontoPlanoSaude;
    }

    public void aumentarSalario(double percentual) {
        salarioBruto += salarioBruto * (percentual / 100);
    }

}
