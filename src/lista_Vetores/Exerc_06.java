package lista_Vetores;

import java.util.Scanner;

public class Exerc_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean encontrou = false;
		int[] vect = new int[10];

		System.out.println("Informe os valores do vetor: ");
		for (int i = 0; i < 10; i++) {
			vect[i] = sc.nextInt();
		}

		System.out.println("Informe o número que deseja encontrar no vetor: ");
		int N = sc.nextInt();
		int indice = 0;

		for (int i = 0; i < 10; i++) {
			if (vect[i] == N) {
				indice = i;
				encontrou = true;
				System.out.println("O valor " + N + " foi encontrado na posição " + indice + " do vetor.");
				break;
			}
		}

		if (!encontrou) {
			System.out.println("O valor informado não foi encontrado no vetor.");
		}

		sc.close();
	}

}
