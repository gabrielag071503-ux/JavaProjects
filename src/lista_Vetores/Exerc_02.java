package lista_Vetores;

import java.util.Scanner;

public class Exerc_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[4];
		int[] B = new int[4];
		int[] C = new int[4];

		System.out.println("Digite 4 elementos do vetor A: ");
		for (int i = 0; i < 4; i++) {
			A[i] = sc.nextInt();
		}

		System.out.println("Digite 4 elementos do vetor B: ");
		for (int i = 0; i < 4; i++) {
			B[i] = sc.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			C[i] = A[i] + B[i];
		}

		System.out.println("Resultado do vetor C: ");
		for (int i = 0; i < 4; i++) {
			System.out.print(C[i] + " ");
		}

		sc.close();
	}

}
