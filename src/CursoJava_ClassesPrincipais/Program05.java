package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

import CursoJava_Entities.Student;

public class Program05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do estudante: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();

        Student estudante = new Student(nome, nota1, nota2, nota3);

        System.out.printf("Nota final: %.2f%n", estudante.mediaFinal());

        if (estudante.mediaFinal() < 60.0) {
            System.out.println("Reprovado");
            System.out.printf("Faltaram %.2f pontos%n", estudante.pontosFaltando());
        } else {
            System.out.println("Aprovado");
        }
        sc.close();
        
    }
    
}
