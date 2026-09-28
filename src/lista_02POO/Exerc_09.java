package lista_02POO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities_Lista02POO.Funcionario2;

public class Exerc_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario2> list = new ArrayList<>();

        System.out.print("Quantos empregados serão cadastrados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEmpregado #" + i + ": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Ja peguei esse Id.Tente Novamente: ");
                id = sc.nextInt();

            }

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            Funcionario2 emp = new Funcionario2(id, nome, salario);

            list.add(emp);
        }

        System.out.print("Inform o ID do funcionario que terá o seu salário aumentado: ");
        int id = sc.nextInt();

        list.sort(Comparator.comparingInt(Funcionario2::getId));
        Funcionario2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null); 

        if (emp == null) {
            System.out.println("Este id não existe!");
        } else {
            System.out.print("Informe o percentual: ");
            double percentual = sc.nextDouble();
            emp.aumentarSalario(percentual);
        }

        System.out.println("\nLista de Empregados:");
        for (Funcionario2 x : list) {
            System.out.println(x);
        }
        sc.close();

    }

    public static boolean hasId(List<Funcionario2> list, int id) {
        Funcionario2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
