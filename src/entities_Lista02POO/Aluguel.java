package entities_Lista02POO;

public class Aluguel {
    private Integer quarto;
    private Estudante3 estudante3;

    public Aluguel(Integer numQuarto, Estudante3 estudante) {
        this.quarto = numQuarto;
        this.estudante3 = estudante;
    }

    public Integer getQuarto() {
        return quarto;
    }

    public Estudante3 getEstudante3 () {
        return estudante3;
    }

        public String toString() {
        return quarto + ", " + estudante3;
    }
    
}
