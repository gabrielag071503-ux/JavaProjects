package CursoJava_ClassesPrincipais;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import CursoJava_Entities.Employee;

public class ExercicioFixaçãoListas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" + (i + 1) + ": ");
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

            Employee emp = new Employee(name, id, salary);

            list.add(emp);
        }

        System.out.print("\nEnter employee ID that will have salary increse: ");
        int idSalary = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This ID does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("\nList of employes: ");
        for (Employee obj : list) {
                System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List <Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
