package lista_02POO;
import java.util.Locale;
import java.util.Scanner;
import entities_Lista02POO.ConversorMoeda;

public class Exerc_05 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Qual é o preço do Dólar? ");
        double cotacaoDolar = sc.nextDouble();

        System.out.print("Quantos Dólares serão comprados? ");
        double quantidadeDolares = sc.nextDouble();

        ConversorMoeda cm = new ConversorMoeda(cotacaoDolar, quantidadeDolares);

        System.out.print(cm);

        sc.close();
    }
}