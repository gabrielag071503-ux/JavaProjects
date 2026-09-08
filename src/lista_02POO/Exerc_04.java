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
        float nota1 = sc.nextFloat();

        System.out.print("nota2: ");
        float nota2 = sc.nextFloat();

        System.out.print("nota3: ");
        float nota3 = sc.nextFloat();

        Estudante estudante = new Estudante(nome, nota1, nota2, nota3);

        System.out.printf("Nota Final: %.2f%n", estudante.getNotaFinal());

        if(estudante.getNotaFinal() >= 60.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
            System.out.printf("Faltaram %.2f pontos%n ", estudante.getPontosFaltantes());
        }

        sc.close();
    }
}
