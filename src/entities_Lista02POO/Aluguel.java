package entities_Lista02POO;

public class Aluguel {
    private int quarto;
    private Estudante3 estudante3;

    public Aluguel(int numQuarto, Estudante3 estudante) {
        this.quarto = numQuarto;
        this.estudante3 = estudante;
    }

    public int getQuarto() {
        return quarto;
    }

    public Estudante3 getEstudante3 () {
        return estudante3;
    }

        public String toString() {
        return quarto + ", " + estudante3;
    }
    
}
