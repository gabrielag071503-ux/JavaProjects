package lista_01POO;

import entities_Lista01POO.ContaMesa;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("______SISTEMA DE RESTAURANTE_____");

        System.out.print("Informe o numero da mesa: ");
        int mesa = sc.nextInt();
        System.out.print("Informe a quantidade de pessoas: ");
        int pessoas = sc.nextInt();

        ContaMesa mesaAtual = new ContaMesa(mesa, pessoas);
        System.out.println("Pedido aberto com sucesso!");

        int opcao = 0;

        while (opcao != 6) {
            System.out.println("_____Menu da mesa " + mesa + "____");
            System.out.println("1. Adicionar comida (kg)");
            System.out.println("2. Adicionar sobremesa");
            System.out.println("3. Adicionar refrigerante");
            System.out.println("4. Adicionar cerveja");
            System.out.println("5. Adicionar pessoa(Chegou atrasado)");
            System.out.println("6. Encerrar e emitir nota fiscal.");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            while (opcao < 1 || opcao > 6) {
                System.out.println("Opção inválida!");
                System.out.print("Informe a opção novamente: ");
                opcao = sc.nextInt();
            }

            switch(opcao) {
                case 1:
                    System.out.print("Quantos KG de comida serão adicionaos: ");
                    double peso = sc.nextDouble();
                    mesaAtual.adicionarComida(peso);
                    System.out.println("Comida adicionada com sucesso!");
                    break;

                case 2:
                    System.out.print("Quantas sobremesas serão adicionais: ");
                    int sobremesa = sc.nextInt();
                    mesaAtual.adicionarSobremesa(sobremesa);
                    System.out.println("Sobremesas adicionadas com sucesso!");
                    break;

                case 3:
                    System.out.print("Quantos refrigerantes serão adicionais: ");
                    int refri = sc.nextInt();
                    mesaAtual.adicionarRefrigerante(refri);
                    System.out.println("Refrigerantes adicionadas com sucesso!");
                    break;

                case 4:
                    System.out.print("Quantas cervejas serão adicionais: ");
                    int cerve = sc.nextInt();
                    mesaAtual.adicionarCerveja(cerve);
                    System.out.println("Cervejas adicionadas com sucesso!");
                    break;

                case 5:
                    System.out.print("Quantas pessoas serão adicionadas a mesa: ");
                    int pess = sc.nextInt();
                    mesaAtual.adicionarPessoas(pess);
                    System.out.println("Pessoas adicionadas com sucesso!");
                    break;

                case 6:
                    System.out.println("\nEncerrando os pedidos...");
                    break;
            }
        }

        System.out.println("Gerando Nota Fiscal...");
        mesaAtual.fecharConta();
        mesaAtual.emitirNotaFiscal();
        System.out.println("Muito obrigado pela escolha, voltem sempre!");

        sc.close();
    }
}
