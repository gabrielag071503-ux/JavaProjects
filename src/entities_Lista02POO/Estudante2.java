package entities_Lista02POO;

public class Estudante2 {
    private String nome;
    private String email;
    private Integer numeroQuarto;

    public Estudante2(String nome, String email, Integer numeroQuarto) {
        this.nome = nome;
        this.email = email;
        this.numeroQuarto = numeroQuarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNumQuarto() {
        return numeroQuarto;
    }

    public String toString() {
        return nome + ", " + email;
    }

    
}
