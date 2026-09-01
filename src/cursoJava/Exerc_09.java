package cursoJava;

import java.util.Scanner;

public class Exerc_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, maiorIdade, posMaior;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		
		String name[] = new String[n];
		int idade[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		maiorIdade = idade[0];
		posMaior = 0;
		
		for (int i = 1; i < n; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posMaior = i;	
			}
		}
		
		System.out.printf("Pessoa mais velha: %s\n", name[posMaior]);
		
		
		
		sc.close();

	}

}
