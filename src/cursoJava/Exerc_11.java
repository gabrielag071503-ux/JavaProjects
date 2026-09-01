package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, qtdHomens, qtdMulheres;
		double maiorAltura, menorAltura, mediaMulheres, totalAlturaMulheres;

		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();

		double altura[] = new double[n];
		char sexo[] = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Gênero da %da pessoa: ", i + 1);
			sexo[i] = sc.next().charAt(0);
		}

		menorAltura = altura[0];
		maiorAltura = altura[0];

		for (int i = 1; i < n; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}

		}
		qtdHomens = 0;
		qtdMulheres = 0;
		totalAlturaMulheres = 0;

		for (int i = 0; i < n; i++) {
			if (sexo[i] == 'm') {
				qtdHomens++;
			} else {
				qtdMulheres++;
				totalAlturaMulheres = totalAlturaMulheres + altura[i];
			}
		}

		mediaMulheres = totalAlturaMulheres / qtdMulheres;

		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Menor Altura = %.2f\n", menorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaMulheres);
		System.out.printf("Numero de homens = %d\n", qtdHomens);

		sc.close();

	}

}
