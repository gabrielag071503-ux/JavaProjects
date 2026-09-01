package lista_02POO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities_Lista02POO.Aluguel;
import entities_Lista02POO.Estudante3;

public class Exerc_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Aluguel> alugueis = new ArrayList<>();

        System.out.print("Quantos quartos serão alugados: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nAluguel #" + i + ": ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.println("Quarto: ");
            int quarto = sc.nextInt();

            Estudante3 estudante3 = new Estudante3(nome, email);
            Aluguel aluguel = new Aluguel(quarto, estudante3);

            alugueis.add(aluguel);
        }

        alugueis.sort(Comparator.comparingInt(Aluguel::getQuarto));

        System.out.println("\nQuartos ocupados: ");
        for (Aluguel a : alugueis) {
            System.out.println(a);
        }
        sc.close();

    }
}
