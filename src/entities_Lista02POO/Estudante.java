package entities_Lista02POO;

public class Estudante {
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudante(String nome, double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public double pontosFaltantes() {
        if (notaFinal() < 60.0) {
            return 60.0 - notaFinal();
        } else {
            return 0.0;
        }
    }

}
