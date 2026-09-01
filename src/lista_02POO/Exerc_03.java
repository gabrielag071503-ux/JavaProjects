package lista_02POO;

import entities_Lista02POO.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("SalarioBruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        double imposto = sc.nextDouble();

        Funcionario f = new Funcionario(nome, salarioBruto, imposto);

        System.out.println("\nEmpregado: " + f);

        System.out.print("\nQual o percentual de aumento de salario? ");
        double porcentagem = sc.nextDouble();
        f.aumentarSalario(porcentagem);

        System.out.println("\nDados atualizados: " + f);

        sc.close();
    }
}
