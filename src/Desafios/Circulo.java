package Desafios;

public class Circulo {
    private static final double PI = 3.14159;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            System.out.println("Raio inválido. O raio deve ser maior que zero.");
        }
    }

    public double areaCirculo() {
        return PI * Math.pow(raio, 2);
    }

    public double perimetroCirculo() {
        return 2 * PI * raio;
    }

}
