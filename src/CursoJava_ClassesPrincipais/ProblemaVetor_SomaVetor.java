package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaVetor_SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Informe um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println();
        double soma = 0.0;

        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        double media = soma / n;

        System.out.print("Valores = ");
        for(int i = 0; i < n; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.printf("\nSoma = %.2f", soma);
        System.out.printf("\nMédia = %.2f", media);

        sc.close();
    }
}