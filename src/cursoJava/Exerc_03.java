package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, contMenor;
		double totalAltura, mediaAltura, percentualMenor;

		System.out.print("Quantas pessoas serão digitadas: ");
		n = sc.nextInt();

		String nomes[] = new String[n];
		int idade[] = new int[n];
		double altura[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("NOME: ");
			nomes[i] = sc.next();

			System.out.print("IDADE: ");
			idade[i] = sc.nextInt();

			System.out.print("ALTURA: ");
			altura[i] = sc.nextDouble();
		}
		contMenor = 0;
		totalAltura = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				contMenor++;
			}
			totalAltura = totalAltura + altura[i];
		}

		mediaAltura = totalAltura / n;
		percentualMenor = (contMenor * 100.0) / n;

		System.out.printf("Altura média: %.2f%n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualMenor);

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}

}
