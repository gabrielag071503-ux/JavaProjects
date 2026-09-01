package first_project;

import java.util.Scanner;

public class BatalhaNaval {

	static String[] nomesNavios = { "Porta-aviões", "Encouraçado", "Submarino", "Destroyer" };
	static int[] tamanhosNavios = { 5, 4, 3, 2 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] tabuleiro1 = new char[10][10];
		char[][] tabuleiro2 = new char[10][10];

		System.out.println("==========Batalha Naval===========");

		inicializarTabuleiro(tabuleiro1);
		inicializarTabuleiro(tabuleiro2);

		System.out.println("Jogador 1, posicione os seus navios");
		System.out.println();
		posicionarNavios(tabuleiro1, sc);

		System.out.println("Jogador 2, posicione seus navios");
		System.out.println();
		posicionarNavios(tabuleiro2, sc);

		int jogadorAtual = 1;
		boolean fimDeJogo = false;

		while (!fimDeJogo) {
			char[][] tabAlvo;
			char[][] tabProprio;
			if (jogadorAtual == 1) {
				tabAlvo = tabuleiro2;
				tabProprio = tabuleiro1;
			} else {
				tabAlvo = tabuleiro1;
				tabProprio = tabuleiro2;
			}
			System.out.println("\n============================");
			System.out.println("Vez do jogador " + jogadorAtual);
			System.out.println("\nSeu tabuleiro:");
			imprimirTabuleiro(tabProprio, true);
			System.out.println("\nTabuleiro do Adversário:");
			imprimirTabuleiro(tabAlvo, false);

			realizarAtaque(tabAlvo, sc);

			if (verificarVitoria(tabAlvo)) {
				System.out.println("\n jogador " + jogadorAtual + " Venceu!");
				System.out.println("\nTabuleiro final do adversario:");
				imprimirTabuleiro(tabAlvo, true);
				fimDeJogo = true;
			} else {
				jogadorAtual = alternarJogador(jogadorAtual);
			}
		}

		sc.close();
	}

	public static void inicializarTabuleiro(char[][] tabuleiro) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				tabuleiro[i][j] = '~';
			}
		}
	}

	public static void imprimirTabuleiro(char[][] tabuleiro, boolean revelarNavios) {
		System.out.print("   ");
		for (int j = 0; j < 10; j++) {
			System.out.print((char) ('A' + j) + " ");
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.printf("%2d ", i + 1);
			for (int j = 0; j < 10; j++) {
				char c = tabuleiro[i][j];
				if (!revelarNavios && c == 'N') {
					c = '~';
				}
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}

	public static void posicionarNavios(char[][] tabuleiro, Scanner sc) {
		for (int n = 0; n < nomesNavios.length; n++) {
			boolean posicionado = false;

			while (!posicionado) {
				imprimirTabuleiro(tabuleiro, true);
				System.out.println("\nPosicionando: " + nomesNavios[n] + "(tamanho: " + tamanhosNavios[n] + ")");

				System.out.print("Coluna inicial (A-J): ");
				int coluna = sc.next().toUpperCase().charAt(0) - 'A';

				System.out.print("Linha inicial (1-10): ");
				int linha = sc.nextInt() - 1;

				System.out.print("Horizontal? (s/n): ");
				boolean horizontal = sc.next().equalsIgnoreCase("s");

				if (posicionamentoValido(tabuleiro, tamanhosNavios[n], linha, coluna, horizontal)) {
					for (int i = 0; i < tamanhosNavios[n]; i++) {
						int l, c;

						if (horizontal) {
							l = linha;
							c = coluna + i;
						} else {
							l = linha + i;
							c = coluna;
						}
						tabuleiro[l][c] = 'N';
					}
					posicionado = true;
				} else {
					System.out.println("Posição invalida! Tente Novamente. \n");
				}
			}
		}
	}

	public static boolean posicionamentoValido(char[][] tabuleiro, int tamanho, int linha, int coluna,
			boolean horizontal) {
		for (int i = 0; i < tamanho; i++) {
			int l, c;

			if (horizontal) {
				l = linha;
				c = coluna + i;
			} else {
				l = linha + i;
				c = coluna;
			}

			if (l < 0 || l >= 10 || c < 0 || c >= 10) {
				return false;
			}
			if (tabuleiro[l][c] != '~') {
				return false;
			}
		}
		return true;
	}

	public static void realizarAtaque(char[][] tabAlvo, Scanner sc) {
		boolean entradaValida = false;

		while (!entradaValida) {
			System.out.print("Coluna inicial (A-J): ");
			int coluna = sc.next().toUpperCase().charAt(0) - 'A';

			System.out.print("Linha inicial (1-10): ");
			int linha = sc.nextInt() - 1;

			if (linha < 0 || linha >= 10 || coluna < 0 || coluna >= 10) {
				System.out.println("Coordenada fora do tabuleiro! Tente novamente.");
			} else if (tabAlvo[linha][coluna] == 'X' || tabAlvo[linha][coluna] == 'O') {
				System.out.println("Voce ja atacou essa posicao! Tente novamente.");
			} else {
				if (tabAlvo[linha][coluna] == 'N') {
					tabAlvo[linha][coluna] = 'X';
					System.out.println("ACERTOU!");
				} else {
					tabAlvo[linha][coluna] = 'O';
					System.out.println("ERROU!");
				}
				entradaValida = true;
			}
		}
	}

	public static boolean verificarVitoria(char[][] tabuleiro) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (tabuleiro[i][j] == 'N') {
					return false;
				}
			}
		}
		return true;
	}

	public static int alternarJogador(int jogadorAtual) {
		return (jogadorAtual % 2) + 1;
	}

}
