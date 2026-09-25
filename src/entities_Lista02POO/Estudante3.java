package entities_Lista02POO;

public class Estudante3 {
    private String nome;
    private String email;
    private Integer numQuarto;

    public Estudante3() {

    }

    public Estudante3(String nome, String email, Integer numQuarto) {
        this.nome = nome;
        this.email = email;
        this.numQuarto = numQuarto;
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
        return numQuarto;
    }

    public String toString() {
        return numQuarto + ": " + nome + ", " + email;
    }

}
