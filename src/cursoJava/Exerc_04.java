package cursoJava;

import java.util.Scanner;

public class Exerc_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, qtdPares;

		System.out.print("Quantos números você vai digitar: ");
		n = sc.nextInt();

		int vet[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
		}

		System.out.println("\nNÚMEROS PARES: ");

		qtdPares = 0;
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				System.out.printf("%d ", vet[i]);
				qtdPares++;
			}
		}

		System.out.printf("\n\nQUANTIDADE DE NÚMEROS PARES = %d\n", qtdPares);

		sc.close();

	}

}
