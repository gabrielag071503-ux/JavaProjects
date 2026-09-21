package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaVetor_soma_vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];

        System.out.println("Digite os valores do vetorA: ");
        for (int i = 0; i < n; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetorB: ");
        for (int i = 0; i < n; i++) {
            vectB[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("Vetor Resultante: ");
        for(int i = 0; i < n; i++) {
            System.out.printf("%d\n", vectC[i]);
        }

        sc.close();
    }
}