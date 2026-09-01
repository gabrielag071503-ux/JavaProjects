package first_project;

import java.util.Locale;
import java.util.Scanner;

public class CampeonatoSkate {

	 public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[][] tabelaNotas = new double[3][4];
		double[] mediasFinais;

		coletarNotas(tabelaNotas, sc);
		mediasFinais = calcularMedias(tabelaNotas);
		exibirRelatorio(tabelaNotas, mediasFinais);

		sc.close();
	}

	public static void coletarNotas(double[][] matriz, Scanner sc) {
		System.out.println("_____SISTEMA DE COLETA DE NOTAS______\n");

		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Notas do Skatista " + (i + 1) + ":");

			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = lerNotaValida(sc, j + 1);
			}
			System.out.println();
		}
	}

	public static double lerNotaValida(Scanner sc, int numManobra) {
		double nota = -1;

		while (nota < 0.0 || nota > 10.0) {
			System.out.print("Nota da Manobra " + numManobra + ": ");
			nota = sc.nextDouble();

			if (nota < 0.0 || nota > 10.0) {
				System.out.println("ERRO! A nota deve estar entre (0.0 e 10.0).");
			}
		}
		return nota;
	}

	public static double[] calcularMedias(double[][] matriz) {
		double[] medias = new double[matriz.length];

		for (int i = 0; i < matriz.length; i++) {
			double soma = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				soma += matriz[i][j];
			}
			medias[i] = soma / matriz[i].length;
		}

		return medias;
	}

	public static void exibirRelatorio(double[][] matriz, double[] medias) {
		System.out.println("=========================================================================");
		System.out.println("RELATÓRIO FINAL DO CAMPEONATO DE SKATE");
		System.out.println("==========================================================================");
		System.out.println("Skatista  | Manobra 1 | Manobra 2 | Manobra 3 | Manobra 4 | MÉDIA FINAL");
		System.out.println("==========================================================================");

		for (int i = 0; i < matriz.length; i++) {
			System.out.printf("Skatista %d  |   %.1f    |   %.1f    |   %.1f    |   %.1f    |   %.2f\n", (i + 1),
					matriz[i][0], matriz[i][1], matriz[i][2], matriz[i][3], medias[i]);
		}
		System.out.println("==========================================================================");
	}
}
