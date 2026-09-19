package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

import CursoJava_Entities.Produto;

public class Program02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String nome = sc.nextLine();
        System.out.print("Price: ");
        double preco = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println();
        System.out.println("Product data: " + produto);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int adicionar = sc.nextInt();
        produto.adicionarProdutos(adicionar);

        System.out.println();
        System.out.println("Updated product data: " + produto);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        int remover = sc.nextInt();
        produto.removerProdutos(remover);

        System.out.println();
        System.out.println("Final product data: " + produto);

        sc.close();
    }
    
}
