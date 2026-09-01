package lista_Vetores;

import java.util.Scanner;

public class Exerc_03 {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int vect[] = new int [10];
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		
		for (int i =0; i < vect.length; i++) {
			if (vect[i] % 2 != 0) {
				System.out.println("O número " + vect[i] + " é impar e se encontra no índice " + i + " .");
			}
			
		}
		
		
		
		
		sc.close();
	}

}
