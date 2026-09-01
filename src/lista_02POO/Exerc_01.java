package lista_02POO;

import entities_Lista02POO.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados do Produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println("\nDados do produto: " + produto);

        System.out.print("Informe o número de produtos a serem adicionados ao estoque: ");
        quantidade = sc.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println("Dados atualizados: " + produto);

        System.out.print("\nInforme o número de produtos a serem removidos do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProdutos(quantidade);


        System.out.println("Dados atualizados: " + produto);


        sc.close();

    }
}
