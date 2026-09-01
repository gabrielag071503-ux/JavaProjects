package lista_02POO;

import java.util.Locale;
import java.util.Scanner;
import entities_Lista02POO.Estudante2;

public class Exerc_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante2[] quartos = new Estudante2[10];

        System.out.println("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nAluguel Número " + i + ": ");
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("quarto: ");
            int numeroQuarto = sc.nextInt();

            while (numeroQuarto < 0 || numeroQuarto > 9 || quartos[numeroQuarto] != null) {
                if (numeroQuarto < 0 || numeroQuarto > 9) {
                    System.out.println("Quarto inválido! Digite um número de 0 a 9: ");
                } else {
                    System.out.println("Quarto ocupado! Escolha outro quarto: ");
                }
                numeroQuarto = sc.nextInt();

            }
            quartos[numeroQuarto] = new Estudante2(nome, email);
        }

        System.out.println("\nQuartos ocupados: ");

        for (int i = 0; i < 10; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);

            }

        }

        sc.close();
    }

}
