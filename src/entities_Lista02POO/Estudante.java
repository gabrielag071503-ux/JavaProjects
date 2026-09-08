package entities_Lista02POO;

public class Estudante {
    private float nota1;
    private float nota2;
    private float nota3;

    public Estudante(String nome, float nota1, float nota2, float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNotaFinal() {
        return nota1 + nota2 + nota3;
    }

    public float getPontosFaltantes() {
        if (getNotaFinal() < 60.0) {
            return (float) (60.0 - getNotaFinal());
        } else {
            return (float) 0.0;
        }
    }

}
