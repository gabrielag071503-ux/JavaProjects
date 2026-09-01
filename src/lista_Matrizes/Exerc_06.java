package lista_Matrizes;

import java.util.Scanner;

public class Exerc_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mat[][] = new int[4][4];
		int somaP = 0;
		int somaS = 0;

		System.out.println("informe os valores da matriz: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Matriz[" + i + "][" + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("A matriz é: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Os valores da diagonal principal é: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}
		System.out.println();
		

		System.out.println("Os valores da diagonal Secundária é: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][3 - i] + " ");
		}
		System.out.println();
		

		for (int i = 0; i < 4; i++) {
			somaP += mat[i][i];
		}

		for (int i = 0; i < 4; i++) {
			somaS += mat[i][3 - i];
		}

		System.out.println("A soma dos valores da diagonal principal é: " + somaP);
		System.out.println("A soma dos valores da diagonal secundária é: " + somaS);

		sc.close();

	}

}
