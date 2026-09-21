package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaVetor_Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdMenores;
        double alturaTotal, mediaAltura, percentualMenores;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            sc.nextLine();

            System.out.print("Nome: ");
            nome[i] = sc.nextLine();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

            qtdMenores = 0;
            alturaTotal = 0;

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                qtdMenores++;
            }
            
            alturaTotal += altura[i];
        }

        mediaAltura = alturaTotal / n;
        percentualMenores = ((double) qtdMenores / n) * 100.00;

        System.out.printf("\nAltura Média: %.2f", mediaAltura);
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%", percentualMenores);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.printf("\n%s", nome[i]);
            }
        }
        sc.close();
    }
    
}
