package CursoJava_ClassesPrincipais;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import CursoJava_Entities.Employee2;

public class ExercicioFixaçãoListas_forma2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee2> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" + (i + 1) + ": ");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while(hasId(list, i)) {
                System.out.print("I've already taken this ID; try another one: " );
                id = sc.nextInt();
            }

            System.out.print("NAME: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee2 emp = new Employee2(name, id, salary);
            list.add(emp);
        }

        System.out.print("\nEnter employee ID that will have salary increse: ");
        int idSalary = sc.nextInt();
        Integer emp = position(list, idSalary);

        if (emp == null) {
            System.out.print("This ID does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            list.get(emp).increaseSalary(percentage);
        }

        System.out.println("\nList of employes: ");
        for (Employee2 obj : list) {
            System.out.println(obj);
        }

        sc.close();

    }

    public static boolean hasId(List <Employee2> list, int id) {
        Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

    public static Integer position(List<Employee2> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

}
