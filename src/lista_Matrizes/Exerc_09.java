package lista_Matrizes;

import java.util.Scanner;

public class Exerc_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=====SISTEMA DE LOTERIA=====");

		int[][] aposta = new int[13][3];
		int[][] resultado = new int[13][3];

		System.out.println("\n______DIGITE AS SUAS APOSTAS______");
		System.out.println("Digite 1 para marcar 'x' e 0 para deixar o espaço vazio.");
		lerMatriz(aposta, sc);

		System.out.println("\nSuas apostas: ");
		imprimirMatrizVisual(aposta);

		System.out.println("\n_____DIGITE OS RESULTADOS OFICIAIS_____");
		System.out.println("Use 1 para o resultado correto e 0 para os demais.");
		lerMatriz(resultado, sc);

		System.out.println("\nResultados Oficiais: ");
		imprimirMatrizVisual(resultado);

		int pontosFinais = calcularPontos(aposta, resultado);

		System.out.println("\n==============================");
		System.out.println("Resultado final = " + pontosFinais + " pontos.");
		System.out.println("=================================");

		sc.close();
	}

	public static void lerMatriz(int[][] matriz, Scanner sc) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Jogo " + (i + 1) + " (col1 | col2 | col3): ");
			for (int j = 0; j < matriz[i].length; j++) {
				int entrada = sc.nextInt();

				while (entrada != 0 && entrada != 1) {
					System.out.println("ERRO!O valor informado está incorreto.");
					System.out.println("Digite apenas os valores (0-1).");
					entrada = sc.nextInt();
				}
				
				matriz[i][j] = entrada;
			}
			
		}
	}

	public static void imprimirMatrizVisual(int[][] matriz) {
		System.out.println("        Col1 Col2 Col3");

		for (int i = 0; i < matriz.length; i++) {
			System.out.printf("Jogo %2d: ", (i + 1));

			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 1) {
					System.out.print("[x]  ");
				} else {
					System.out.print("[ ]  ");
				}
			}

			System.out.println();
		}
	}

	public static int calcularPontos(int[][] aposta, int[][] resultado) {
		int pontos = 0;

		for (int i = 0; i < aposta.length; i++) {
			for (int j = 0; j < aposta[i].length; j++) {
				if (resultado[i][j] == 1 && aposta[i][j] == 1) {
					pontos++;
					break;

				}
			}
		}

		return pontos;

	}

}
