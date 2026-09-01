package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, totalPares = 0, qtdPares = 0;
		double mediaPares;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		int vet[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				totalPares = totalPares + vet[i];
				qtdPares++;
			}
		}

		if (qtdPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			mediaPares = (double) totalPares / qtdPares;

			System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
		}

		sc.close();

	}

}
