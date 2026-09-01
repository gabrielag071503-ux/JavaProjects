package cursoJava;

import java.util.Locale;
import java.util.Scanner;

import entites.Product2;

public class Exemplo_02 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número de produtos que serão lidos: ");
		int n = sc.nextInt();
		
		Product2[] vect = new Product2[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product2(name, price);
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma / n;
		
		System.out.printf("Avarege price= %.2f%n ", media);
		
		sc.close();
	}

}
