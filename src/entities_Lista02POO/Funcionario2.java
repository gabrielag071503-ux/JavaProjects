package entities_Lista02POO;

public class Funcionario2 {
    private int id;
    private String nome;
    private double salario;

    public Funcionario2(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * (percentual/100.0);
    }

    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }




    
}
