package lista_02POO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities_Lista02POO.Estudante3;

public class Exerc_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Estudante3> alugueis = new ArrayList<>();

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
            Integer numQuarto = sc.nextInt();

            while (hasQuarto(alugueis, numQuarto)) {
                System.out.print("O quarto informado está ocupado.Informe outro: ");
                numQuarto = sc.nextInt();
                
            }

            Estudante3 aluguel = new Estudante3(nome, email, numQuarto);

            alugueis.add(aluguel);
        }

        alugueis.sort(Comparator.comparingInt(Estudante3::getNumQuarto));

        System.out.println("\nQuartos ocupados: ");
        for (Estudante3 a : alugueis) {
            System.out.println(a);
        }
        sc.close();

    }

    public static boolean hasQuarto (List<Estudante3> list, Integer numQuarto) {
        Estudante3 aluguel = list.stream().filter(x -> x.getNumQuarto() == numQuarto).findFirst().orElse(null);
        return aluguel != null;
    }
}
