package lista_Matrizes;

import java.util.Scanner;

public class Exerc_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean achou = false;
		int mat[][] = new int[3][5];

		System.out.println("Informe os valores da matriz: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Mat[" + i + "][" + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();

		System.out.println("informe o valor que deseja encontra na matriz: ");
		int X = sc.nextInt();
		int linha = 0;
		int coluna = 0;

		System.out.println();
		System.out.println("A matriz é: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
        System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == X) {
					achou = true;
					linha = i;
					coluna = j;
					System.out.println("O valor " + X + " fora encontrado na matriz, e está na linha " + linha
							+ " e na coluna " + coluna + "!");
					break;
				}

			}
		}

		if (!achou) {
			System.out.println("O valor " + X + " não se encontra na matriz.");

		}
		sc.close();

	}

}
