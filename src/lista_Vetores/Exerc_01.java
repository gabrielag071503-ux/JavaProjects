package lista_Vetores;

import java.util.Scanner;

public class Exerc_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[8];
		
		System.out.println("Informe 8 elementos para o vetor");
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Vect[" + i + "]: ");
			vect[i] = sc.nextInt();
		}
		System.out.println();
		
		int mult = 1;
		for (int i = 0; i < vect.length; i++) {
			mult *= vect[i];
		}
		
		System.out.println("A multiplicação dos valores da matriz é: " + mult);
		
		
		
		sc.close();
	}

}
