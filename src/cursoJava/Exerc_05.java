package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, pMaior;
		double maior;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		double vet[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}

		maior = vet[0];
		pMaior = 0;

		for (int i = 1; i < n; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				pMaior = i;
			}
		}

		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", pMaior);

		sc.close();

	}

}
