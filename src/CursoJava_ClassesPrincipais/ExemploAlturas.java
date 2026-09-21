package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

public class ExemploAlturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();
        double[] alturas = new double[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            alturas[i] = sc.nextDouble();
        }

        double soma = 0.0;

        for(int i = 0; i < n; i++) {
            soma += alturas[i];
        }

        System.out.printf("Altura média: %.2f%n", soma / n);
        sc.close();

    }
}