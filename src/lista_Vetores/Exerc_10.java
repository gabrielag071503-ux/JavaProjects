package lista_Vetores;

import java.util.Scanner;

public class Exerc_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[5];
		int auxiliar;
		
		System.out.println("Inform 5 valores para o vetor: ");
		for (int i  = 0; i < 5; i++) {
			vect[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 5 - 1; i++) {
			for (int j = 0; j < 5 - i - 1; j++)  {
				if (vect[j] > vect[j + 1]) {
					auxiliar = vect[j];
					vect[j] = vect[j + 1];
					vect[j + 1] = auxiliar;
				}
			}
		}
		
		System.out.println("O vetor ordenado em ordem crescente é: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(vect[i] + " ");
		}
		
		System.out.println();
		sc.close();

	}

}
