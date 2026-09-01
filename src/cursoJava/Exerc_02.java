package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_02 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int n;
		double soma, media;
		
		System.out.print("Quantos números você vai digitar: ");
		n = sc.nextInt();
		
		double vect[] = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		System.out.println();
		System.out.print("Valores = ");
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf(" %.2f ", vect[i]);
		}
		
		soma = 0.0;
		
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		media = soma / n;
		
		System.out.println();
		System.out.printf("Soma = %.2f%n", soma);
		System.out.printf("Média = %.2f%n", media);
		
		
		
		sc.close();
	}

}
