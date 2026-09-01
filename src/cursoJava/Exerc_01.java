package cursoJava;

import java.util.Scanner;

public class Exerc_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.print("Quantos números você vai digitar: ");
		n = sc.nextInt();
		
		int vet[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("INFORME UM NÚMERO: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS: ");
		
		for (int i = 0; i < n; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
			
		}
		
		
		sc.close();

	}

}
