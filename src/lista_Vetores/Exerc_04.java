package lista_Vetores;

import java.util.Scanner;

public class Exerc_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vect1 = new int[5];
		int[] vect2 = new int[5];
		int[] vect3 = new int[10];
		
		System.out.println("Informe 5 números para o vetor1 em ordem crescente.");
		for (int i = 0; i < 5; i++) {
			while(true) {
				System.out.print("Vect[" + i + "]: ");
				int numero = sc.nextInt();
				if (i == 0 || numero > vect1[i - 1]) {
					vect1[i] = numero;
					break;	
				} else {
					System.out.println("O valor informado está incorreto!Informe um número maior.");
				}
				
			}
		}
		
		System.out.println("Informe 5 números para o vetor2 em ordem crescente.");
		for (int i = 0; i < 5; i++) {
			while(true) {
				System.out.print("Vect[" + i + "]: ");
				int numero = sc.nextInt();
				if (i == 0 || numero > vect2[i - 1]) {
					vect2[i] = numero;
					break;	
				} else {
					System.out.println("O valor informado está incorreto!Informe um número maior.");
				}
				
			}
		}
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < 5 && j < 5) {
			if (vect1[i] < vect2[j]) {
				vect3[k] = vect1[i];
				i++;
			} else {
				vect3[k] = vect2[j];
				j++;
			}
			k++;
		}
		
		while (i < 5) {
			vect3[k] = vect1[i];
			i++;
			k++;
		}
		
		while (j < 5) {
			vect3[k] = vect2[j];
			j++;
			k++;
		}
		
		System.out.println("O vetor resultante em ordem crescente é: ");
		for (int posicao = 0; posicao < 10; posicao++)  {
			System.out.print(vect3[posicao] + " ");
		}
		
		
		
		sc.close();

	}

}
