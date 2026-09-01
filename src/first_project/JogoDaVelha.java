/* Trabalho de lógica de programação(componentes):
* 1. Gabriel Araújo Gonçalves
* 2. Lucas Assis
* 3. Daniel Moura
* 4. Felipe couto
*/
package first_project;

import java.util.Scanner;

public class  JogoDaVelha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] tabuleiro = new char[3][3];

		boolean ganhou = false;
		int rodada = 1;
		int jogadas = 0;
		char jogadorAtual = 'X';

		System.out.println("========JOGO-DA-VELHA========");
		System.out.println();

		inicializarTabuleiro(tabuleiro);

		while (!ganhou && jogadas < 9) {
			System.out.println("RODADA " + rodada);
			System.out.println();

			imprimirTabuleiro(tabuleiro);

			String nomeDoJogador;
			if (jogadorAtual == 'X') {
				nomeDoJogador = "Jogador 1";
			} else {
				nomeDoJogador = "Jogador 2";
			}
			System.out.println();

			System.out.println("Vez do " + nomeDoJogador + "(" + jogadorAtual + ")");

			realizarJogadas(tabuleiro, jogadorAtual, sc);
			jogadas++;

			ganhou = verificarVitoria(tabuleiro, jogadorAtual);
			System.out.println();

			if (ganhou) {
				System.out.println("O " + nomeDoJogador + " Venceu!");
				System.out.println();
			} else if (jogadas == 9) {
				System.out.println("Deu velha! Ninguem ganhou.");
				System.out.println();
			} else {
				jogadorAtual = alternarJogador(jogadorAtual);
				if (jogadorAtual == 'X') {
					rodada++;
				}
			}
		}

		System.out.println("TABULEIRO FINAL:");
		System.out.println();
		imprimirTabuleiro(tabuleiro);

		sc.close();
	}

	public static void inicializarTabuleiro(char[][] tabuleiro) {
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				tabuleiro[linha][coluna] = ' ';
			}
		}
	}

	public static void imprimirTabuleiro(char[][] tabuleiro) {
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print(" " + tabuleiro[linha][coluna] + " ");
				if (coluna < 2) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (linha < 2) {
				System.out.println("-----------");
			}
		}
	}

	public static void realizarJogadas(char[][] tabuleiro, char jogador, Scanner sc) {
		boolean entradaValida = false;

		while (!entradaValida) {
			System.out.print("Digite a linha (1-3): ");
			int linhaEsc = sc.nextInt() - 1;

			System.out.print("Digite a coluna (1-3): ");
			int colunaEsc = sc.nextInt() - 1;

			if (linhaEsc >= 0 && linhaEsc <= 2 && colunaEsc >= 0 && colunaEsc <= 2) {
				if (tabuleiro[linhaEsc][colunaEsc] == ' ') {
					tabuleiro[linhaEsc][colunaEsc] = jogador;
					entradaValida = true;
				} else {
					System.out.println("Erro! Esta posição já está ocupada.");
					System.out.println();
				}
			} else {
				System.out.println("Erro! Digite apenas números de 1 a 3!");
				System.out.println();
			}
		}
	}

	public static boolean verificarVitoria(char[][] tab, char jogador) {

		for (int i = 0; i < 3; i++) {
			if (tab[i][0] == jogador && tab[i][1] == jogador && tab[i][2] == jogador) {
				return true;
			}
			if (tab[0][i] == jogador && tab[1][i] == jogador && tab[2][i] == jogador) {
				return true;
			}
		}

		if (tab[0][0] == jogador && tab[1][1] == jogador && tab[2][2] == jogador) {
			return true;
		}
		if (tab[0][2] == jogador && tab[1][1] == jogador && tab[2][0] == jogador) {
			return true;
		}

        return false;
    }

	public static char alternarJogador(char jogadorAtual) {
		if (jogadorAtual == 'X') {
			return 'O';
		} else {
			return 'X';
		}
	}
}