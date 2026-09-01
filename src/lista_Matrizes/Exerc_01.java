package lista_Matrizes;

import java.util.Scanner;

public class Exerc_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A[][] = new int [3][2];
		int B[][] = new int [3][2];
		int C[][] = new int [3][2];
		
		System.out.println("Inform os valores da Matriz A: ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print("matrizA[" + i + "][" + j + "]: " );
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Inform os valores da Matriz B: ");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print("matrizB[" + i + "][" + j + "]: " );
				B[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		System.out.println("A matriz C é: ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
