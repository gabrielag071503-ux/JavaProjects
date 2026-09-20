package CursoJava_Entities;

public class ConversorDollar {
    public static double IOF = 0.06;

    public static double converter(double cotacao, double quantidade) {
        double valorSemIOF = cotacao * quantidade;
        double valorComIOF = valorSemIOF * (1 + IOF);
        return valorComIOF;
    }
}
