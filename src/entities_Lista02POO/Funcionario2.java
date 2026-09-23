package entities_Lista02POO;

public class Funcionario2 {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario2(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void aumentarSalario(Double percentual) {
        this.salario += this.salario * (percentual / 100.0);
    }

    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }

}
