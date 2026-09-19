package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

import CursoJava_Entities.Retangulo;

public class Program03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETER = %.2f%n", retangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
        sc.close();
    }
    
}
