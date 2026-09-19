package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

import CursoJava_Entities.Funcionario;

public class Program04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do funcionário: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        double salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        double imposto = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);

        System.out.println();
        System.out.println("Funcionário: " + funcionario);

        System.out.println();
        System.out.print("Digite a porcentagem para aumentar o salário: ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);
        sc.close();
    }
}
