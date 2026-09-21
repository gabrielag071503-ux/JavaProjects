package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaVetor_media_pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdPares = 0;
        double somaPares = 0, mediaPares;

        System.out.print("Quantos elementos vai ter o vetor?");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                somaPares += vect[i];
                qtdPares++;
            }
        }

        if (qtdPares == 0) {
            System.out.println("Nenhum número Par");
        } else {
            mediaPares = (double) somaPares / qtdPares;

            System.out.printf("MEDIA DOS PARES = %.1f", mediaPares);
        }

        sc.close();
    }

}
