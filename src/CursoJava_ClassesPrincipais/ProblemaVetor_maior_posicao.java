package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaVetor_maior_posicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posMaior;
        double maior;

        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        maior = vect[0];
        posMaior = 0;

        for (int i = 0; i < n; i++) {
            if (vect[i] > maior) {
                maior = vect[i];
                posMaior = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f", maior);
        System.out.printf("\nPOSICAO DO MAIOR VALOR = %d", posMaior);

        sc.close();
    }
    
}
