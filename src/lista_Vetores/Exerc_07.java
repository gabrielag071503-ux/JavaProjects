package lista_Vetores;

import java.util.Scanner;

public class Exerc_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] firstVect = new int[20];
		int[] secondVect = new int[20];
		int cont = 0;
		int contRep = 0;

		System.out.println("Infome um valor inteiro positivo(0 ou menor para encerrar o programa): ");
		while (cont < 20) {
			System.out.print("Vect[" + cont + "]: ");
			int num = sc.nextInt();

			if (num <= 0) {
				break;
			}
			firstVect[cont] = num;
			cont++;

		}
		System.out.println("O primeiro vetor é: ");
		for (int i = 0; i < cont; i++) {
			System.out.print(firstVect[i] + " ");
		}

		for (int i = 0; i < cont; i++) {
			boolean jaExiste = false;
			
			for (int j = 0; j < contRep; j++) {
				if (firstVect[i] == secondVect[j]) {
					jaExiste = true;
					break;
				}
			}
			if (!jaExiste) {
				secondVect[contRep] = firstVect[i];
				contRep++;
			}
		}
		System.out.println();
		System.out.print("Sequencia Original: ");
		for (int i = 0; i < cont; i++) {
			System.out.print(firstVect[i] + " ");
		}

		System.out.println();
		System.out.print("Sequencia com repetição: ");
		for (int i = 0; i < contRep; i++) {
			System.out.print(secondVect[i] + " ");
		}

		sc.close();

	}

}
