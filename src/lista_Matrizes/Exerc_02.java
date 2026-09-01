package lista_Matrizes;

import java.util.Scanner;

public class Exerc_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mat[][] = new int [5][2];
		
		System.out.println("Informe os valores da matriz: ");
		for(int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Mat[" + i + "][" + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		int produto = 1;
		
		for(int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				produto *= mat[i][j];
			}
		}
		System.out.println();
		
		System.out.print("O produto dos valores da matriz é: " + produto);
		
		
		
		sc.close();

	}

}
