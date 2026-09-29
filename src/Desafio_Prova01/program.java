package Desafio_Prova01;

import java.util.Locale;
import java.util.Scanner;

import entities_DesafioProva01.Produto;
import entities_DesafioProva01.Cliente;
import entities_DesafioProva01.ItensNota;
import entities_DesafioProva01.NotaVenda;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados do cliente: ");
        System.out.print("NOME: ");
        String nome = sc.nextLine();
        System.out.print("EMAIL: ");
        String email = sc.next();
        System.out.print("Data de Nascimento (DD/MM/YYYY): ");
        String dataNascimento = sc.next();

        Cliente cliente = new Cliente(nome, email, dataNascimento);

        System.out.println("\nInforme os Dados da Nota de vendas: ");
        System.out.print("Qual a data da nota: ");
        String data = sc.next();
        System.out.println("Numero: ");
        int numero = sc.nextInt();
        NotaVenda nota = new NotaVenda(data, numero, cliente);

        System.out.print("\nQuantos itens estarão na nota: ");
        int qtdItens = sc.nextInt();

        for (int i = 1; i <= qtdItens; i++) {
            System.out.println("Informe os Dados do pedido " + i + ": ");
            System.out.print("Nome do Produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preco do produto: ");
            double preco = sc.nextDouble();
            Produto produto = new Produto(nomeProduto, preco);
            System.out.print("Qual a quantidade do produto: ");
            int quantidade = sc.nextInt();
            ItensNota itens = new ItensNota(quantidade, preco, produto);

            nota.addItem(itens);
        }

        System.out.println("\nResumo do Pedido: ");
        System.out.println(nota);

        sc.close();
    }

}
