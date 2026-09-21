package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaVetor_dados_pessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdHomens, qtdMulheres;
        double maiorAltura, menorAltura, totalAlturaF, mediaAlturaF;

        System.out.print("Quantas pessoas serao digitadas?");
        n = sc.nextInt();

        double[] alturas = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %sa pessoa: ", (i + 1));
            alturas[i] = sc.nextDouble();
            System.out.printf("Genero da %sa pessoa: ", (i + 1));
            genero[i] = sc.next().charAt(0);
        }

        maiorAltura = alturas[0];
        menorAltura = alturas[0];

        for (int i = 0; i < n; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }

        qtdHomens = 0;
        qtdMulheres = 0;
        totalAlturaF = 0;

        for (int i = 0; i < n; i++) {
            if (genero[i] == 'm') {
                qtdHomens++;
            } else {
                qtdMulheres++;
                totalAlturaF += alturas[i];
            }
        }

        mediaAlturaF = totalAlturaF / qtdMulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaF);
        System.out.printf("Numero de homens = %d\n", qtdHomens);

        sc.close();
    }

}
