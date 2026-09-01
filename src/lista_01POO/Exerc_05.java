package lista_01POO;

import entities_Lista01POO.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("_____Sistema Bancário_____");

        System.out.print("Informe o nome do Titular da Conta: ");
        String nome = sc.nextLine();
        System.out.print("Informe o numero da Conta: ");
        int numero = sc.nextInt();
        System.out.print("Informe o valor para deposito inicial(ou 0 para iniciar a conta zerada): ");
        double valor = sc.nextDouble();

        ContaBancaria minhaConta = new ContaBancaria();

        minhaConta.abrirConta(nome, numero, valor);
        System.out.println("A sua conta foi aberta com sucesso, BEM VINDO!");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("_____Menu de Operações_____");
            System.out.println("1 - Emitir Saldo(Mostra os Dados da Conta)");
            System.out.println("2 - Fazer deposito");
            System.out.println("3 - Fazer um Saque");
            System.out.println("4 - Sair do Sistema");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            while (opcao < 1 || opcao > 4) {
                System.out.println("Esta opcao está inválida!");
                System.out.print("Informe a opcao novamente: ");
                opcao = sc.nextInt();
            }

            switch (opcao) {
                case 1:
                    minhaConta.emitirSaldo();
                    break;
                case 2:
                    System.out.print("Informe o valor para deposito: ");
                    double valorDeposito = sc.nextDouble();
                    minhaConta.deposito(valorDeposito);
                    break;
                case 3:
                    System.out.print("Informe o valor para saque: ");
                    double valorSaque = sc.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.print("Encerrando o Sistema...");
            }
        }
        sc.close();
    }

}
