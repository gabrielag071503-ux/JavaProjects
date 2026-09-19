package CursoJava_Entities;

public class ConversorDollar {
    public static double IOF = 0.06;

    public static double converter(double cotacao, double quantidade) {
        return cotacao * quantidade * (1.0 + IOF);
    }
}
