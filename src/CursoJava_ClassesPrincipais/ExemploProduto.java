package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

import CursoJava_Entities.Produto2;

public class ExemploProduto {
    public static void main(String[] ags) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos produtos você vai digitar?");
        int n = sc.nextInt();

        Produto2[] vect = new Produto2[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Informe os dados do produto #" + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            vect[i] = new Produto2(nome, preco);
        }

        System.out.println();
        System.out.println("Produtos cadastrados:");
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i].getNome());
            System.out.println(vect[i].getPreco());
        }

        System.out.println();

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPreco();
        }

        double media = soma / vect.length;
        System.out.printf("Preço médio: %.2f%n", media);
        
        sc.close();
    }
    
}
