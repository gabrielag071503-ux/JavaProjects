package lista_Vetores;

import java.util.Scanner;

public class Exerc_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int [12];
		
		System.out.println("Informe 12 valores inteiros para o vetor: ");
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		
		int maior = vect[0];
		int posMaior = 0;
		int menor = vect[0];
		int posMenor = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posMaior = i;
			}
			
			if (vect[i] < menor) {
				menor = vect[i];
				posMenor = i;
			}
		}
		System.out.println("____________________________________________________________________________");
		System.out.println("O maior valor é o numero " + maior + " que se encontra no indice " + posMaior);
		System.out.println("O menor valor é o numero " + menor + " que se encontra no indice " + posMenor);


		
		sc.close();

	}

}
