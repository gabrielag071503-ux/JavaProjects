package lista_03POO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities_Lista03POO.Exerc_01.Produto;
import entities_Lista03POO.Exerc_01.StatusPedido;
import entities_Lista03POO.Exerc_01.Cliente;
import entities_Lista03POO.Exerc_01.ItemPedido;
import entities_Lista03POO.Exerc_01.Pedido;

public class Exerc_001 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");/*Formatador de data */

        System.out.println("Informe os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoTexto = sc.nextLine();
        Date dataNascimento = sdf.parse(dataNascimentoTexto);/*Faz a formatação de String para Date */

        System.out.print("Email: ");
        String email = sc.nextLine();

        Cliente cliente = new Cliente(nome, email, dataNascimento);

        System.out.println("Informe os dados do pedido:");
        System.out.print("Status do pedido: ");
        String statusTexto = sc.nextLine();
        StatusPedido status = StatusPedido.valueOf(statusTexto); /*Faz uma correção do nome da variavel para a que foi criada
                                                                   no StatusPedido */

        System.out.print("Quantos itens para este pedido? ");
        int quantidadeItens = sc.nextInt();
        sc.nextLine();

        Pedido pedido = new Pedido(new Date(), status, cliente);/*Gera automaticamente o instante do Pedido */

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
