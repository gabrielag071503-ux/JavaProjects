package entities_Lista02POO;

public class ConversorMoeda{
    public static final double IOF = 0.06;

    public static double valorEmReais(double cotacaoDolar, double quantidadeDolares) {
        double valorSemImposto = quantidadeDolares * cotacaoDolar;
        double valorComIOF = valorSemImposto + (valorSemImposto * IOF);
        return valorComIOF; 
    }

}