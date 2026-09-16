package entities_Lista03POO.Exerc_01;

public class Cliente {
    private String nome;
    private String email;
    private String dataNascimento;

    public Cliente(String nome, String email, String dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
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

    public String getDataNascimento() {
        return dataNascimento;
    }
    
}
