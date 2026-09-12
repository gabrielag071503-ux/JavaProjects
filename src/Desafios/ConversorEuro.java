package Desafios;

public class ConversorEuro {
    private static final double IOF = 0.05;

    public double calcularValorEmReais(double cotacaoEuro, double quantidadeComprada) {
        double valorEmReais = cotacaoEuro * quantidadeComprada;
        double valorComIOF = valorEmReais * (1 + IOF);
        return valorComIOF;
    }

}
