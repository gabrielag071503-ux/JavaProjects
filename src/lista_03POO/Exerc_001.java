package lista_03POO;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities_Lista02POO.Produto;
import entities_Lista03POO.Exerc_01.Cliente;
import entities_Lista03POO.Exerc_01.ItemPedido;
import entities_Lista03POO.Exerc_01.Pedido;

public class Exerc_001 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        String dataNascimento = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        Cliente cliente = new Cliente(nome, email, dataNascimento);

        System.out.println("Informe os dados do pedido:");
        System.out.print("Status do pedido: ");
        String status = sc.nextLine();
        System.out.print("Quantos itens para este pedido? ");
        int quantidadeItens = sc.nextInt();
        sc.nextLine();

        Pedido pedido = new Pedido(new Date(), status, cliente);

        for (int i = 1; i <= quantidadeItens; i++) {
            System.out.println("Informe os dados do item #" + i + ":");
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidadeProduto = sc.nextInt();
            sc.nextLine();

            Produto produto = new Produto(nomeProduto, precoProduto);
            ItemPedido itemPedido = new ItemPedido(quantidadeProduto, precoProduto, produto);

            pedido.addItem(itemPedido);
        }

        System.out.println("\nRESUMO DO PEDIDO:");
        System.out.println(pedido);

        sc.close();
    }

}
