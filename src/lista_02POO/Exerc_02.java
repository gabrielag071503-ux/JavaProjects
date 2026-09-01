package lista_02POO;

import entities_Lista02POO.Retangulo2;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a largura e a altura do retangulo:");
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();

        Retangulo2 retangulo = new Retangulo2(largura, altura);

        System.out.printf("Area = %.2f%n", retangulo.area());
        System.out.printf("Perimetro = %.2f%n", retangulo.perimetro());
        System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());


        sc.close();
    }
}
