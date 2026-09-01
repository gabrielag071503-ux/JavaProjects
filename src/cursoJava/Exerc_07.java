package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double media, totalValor;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		double vet[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}

		totalValor = 0.0;
		for (int i = 0; i < n; i++) {
			totalValor = totalValor + vet[i];
		}

		media = totalValor / n;

		System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

		for (int i = 0; i < n; i++) {
			if (vet[i] < media) {
				System.out.printf("%.1f\n", vet[i]);

			}
		}

		sc.close();

	}

}
