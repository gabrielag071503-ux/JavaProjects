package entities_Lista03POO.Exerc_01;

import java.util.Date;

public class Cliente {
    private String nome;
    private String email;
    private Date dataNascimento;

    public Cliente(String nome, String email, Date dataNascimento2) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento2;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }
    
}
