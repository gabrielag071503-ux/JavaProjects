package entities_DesafioProva01;

public class Cliente {
    private String nome;
    private String email;
    private String dataNascimento;

    public Cliente() {

    }

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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getdataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " (" + dataNascimento + ") " + "-" + email;
    }

    
}
