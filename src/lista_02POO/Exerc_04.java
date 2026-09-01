package lista_02POO;

import entities_Lista02POO.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_04 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("nota1: ");
        double nota1 = sc.nextDouble();

        System.out.print("nota2: ");
        double nota2 = sc.nextDouble();

        System.out.print("nota3: ");
        double nota3 = sc.nextDouble();

        Estudante estudante = new Estudante(nome, nota1, nota2, nota3);

        System.out.printf("Nota Final: %.2f%n", estudante.notaFinal());

        if(estudante.notaFinal() >= 60.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
            System.out.printf("Faltaram %.2f pontos%n ", estudante.pontosFaltantes());
        }

        sc.close();
    }
}
