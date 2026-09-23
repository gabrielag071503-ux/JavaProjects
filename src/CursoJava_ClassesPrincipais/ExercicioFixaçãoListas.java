package CursoJava_ClassesPrincipais;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import CursoJava_Entities.Funcionario2;

public class ExercicioFixaçãoListas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Funcionario2> list = new ArrayList<>();

        System.out.print("How many eployees will be registered? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("\nEmployee #" + i + ": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("I've already taken this ID; try another one: " );
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Funcionario2(name, id, salary));
        }

        System.out.println("Enter employee ID that will have salary increse: ");
        int id = sc.nextInt();

        Funcionario2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This ID does not exist.");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.salaryIncrese(percentage);
        }

        System.out.println("\nList of employes: ");
        for (Funcionario2 x : list) {
            if (list != null) {
                System.out.println(x);
            }
        }

        sc.close();
    }

    public static boolean hasId(List <Funcionario2> list, int id) {
        Funcionario2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
    
}
