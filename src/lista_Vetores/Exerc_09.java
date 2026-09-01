package lista_Vetores;

import java.util.Scanner;

public class Exerc_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] A = new int[10];
		int[] B = new int[10];
		int[] C = new int[20];
		int[] D = new int[10];

		int tamA = 0;
		int tamB = 0;
		int tamC = 0;
		int tamD = 0;

		System.out.println("digite valores inteiros positivos para o vetor A(999 para encerrar): ");
		while (tamA < 10) {
			int num = sc.nextInt();

			if (num == 999) {
				break;
			}

			boolean repetido = false;
			for (int i = 0; i < tamA; i++) {
				if (A[i] == num) {
					repetido = true;
					break;
				}
			}
			if (!repetido) {
				A[tamA] = num;
				tamA++;
			} else if (num <= 0) {
				System.out.println("Erro!Digite apenas números positivos.");
			} else {
				System.out.println("Erro!Esse valor ja foi digitado.");
			}

		}

		System.out.println("digite valores inteiros positivos para o vetor B(999 para encerrar o programa): ");
		while (tamA < 10) {
			int num = sc.nextInt();

			if (num == 999) {
				break;
			}

			boolean repetido = false;
			for (int i = 0; i < tamB; i++) {
				if (B[i] == num) {
					repetido = true;
					break;
				}
			}
			if (!repetido) {
				B[tamB] = num;
				tamB++;
			} else if (num <= 0) {
				System.out.println("Erro!Digite apenas números positivos.");
			} else {
				System.out.println("Erro!Esse valor ja foi digitado.");
			}

		}

		for (int i = 0; i < tamA; i++) {
			C[tamC] = A[i];
			tamC++;
		}

		for (int i = 0; i < tamB; i++) {
			boolean existeC = false;

			for (int j = 0; j < tamC; j++) {
				if (B[i] == C[j]) {
					existeC = true;
					break;
				}
			}
			if (!existeC) {
				C[tamC] = B[i];
				tamC++;
			}
		}

		for (int i = 0; i < tamA; i++) {
			boolean existeB = false;

			for (int j = 0; j < tamB; j++) {
				if (A[i] == B[j]) {
					existeB = true;
					break;
				}
			}
			if (!existeB) {
				D[tamD] = A[i];
				tamD++;
			}
		}
		System.out.println("O vetor A é: ");
		for (int i = 0; i < tamA; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		
		System.out.println("O vetor B é: ");
		for (int i = 0; i < tamB; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();
		
		System.out.println("O vetor C (Uniao) é: ");
		for (int i = 0; i < tamC; i++) {
			System.out.print(C[i] + " ");
		}
		System.out.println();
		
		System.out.println("O vetor D(coplementar) é: ");
		for (int i = 0; i < tamD; i++) {
			System.out.print(D[i] + " ");
		}

		sc.close();
	}

}
