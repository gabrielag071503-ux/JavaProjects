package lista_02POO;
import java.util.Locale;
import java.util.Scanner;
import entities_Lista02POO.ConversorMoeda;

public class Exerc_05 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Qual é o preço do Dólar? ");
        double cotacao = sc.nextDouble();

        System.out.println("Quantos Dólares serão comprados? ");
        double quantia = sc.nextDouble();

        double totalReais = ConversorMoeda.valorEmReais(cotacao, quantia);

        System.out.printf("Valor a ser pago em reais= R$ %.2f%n", totalReais);

        sc.close();
    }
}