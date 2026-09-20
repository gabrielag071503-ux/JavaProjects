package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

import CursoJava_Entities.ConversorDollar;

public class Program06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double cotacao = sc.nextDouble();
        
        System.out.print("How many dollars will be bought? ");
        double quantidade = sc.nextDouble();

        double valorConvertido = ConversorDollar.converter(cotacao, quantidade);
        System.out.printf("Value to be paid in reais = %.2f%n", valorConvertido);
        sc.close();
    }

}
