package lista_Matrizes;

import java.util.Scanner;

public class Exerc_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("De quantas linhas sera composta a matriz: ");

		int n = sc.nextInt();

		System.out.println("De quantas colunas sera composta a matriz: ");

		int m = sc.nextInt();

		int A[][] = new int[n][m];

		int At[][];

		System.out.println("Ler matriz A: ");

		lerMatriz(A, sc);

		System.out.println("\nMatriz A: ");

		imprimirMatriz(A);

		At = calcularTransposta(A);

		System.out.println("\nA matriz transposta At: ");

		imprimirMatriz(At);

		sc.close();

	}

	public static void lerMatriz(int A[][], Scanner sc) {

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {

				System.out.println("Digite o valor para [" + i + "][" + j + "]: ");

				A[i][j] = sc.nextInt();

			}

		}

	}

	public static void matriz(int A[][]) {

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {

				System.out.print(A[i][j] + " ");

			}

			System.out.println();

		}

	}

	public static int[][] calcularTransposta(int A[][]) {

		int linhas = A.length;

		int colunas = A[0].length;

		int At[][] = new int[colunas][linhas];

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {

				At[j][i] = A[i][j];

			}

		}

		return At;

	}

	public static void imprimirMatriz(int A[][]) {

		int i, j;

		for (i = 0; i < A.length; i++) {

			for (j = 0; j < A[0].length; j++) {

				System.out.print(A[i][j] + " ");

			}

			System.out.println();

		}

	}

}
