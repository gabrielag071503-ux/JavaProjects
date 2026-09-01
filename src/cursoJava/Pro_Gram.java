package cursoJava;

import java.util.Locale;
import java.util.Scanner;

import entites.Employe;

public class Pro_Gram {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Employe emp = new Employe();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("grossSalary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employe: " + emp);
		
		System.out.println();
		System.out.print("Wich percentage to increse salary? ");
		double percentage = sc.nextDouble();
		emp.increseSalary(percentage);
		
		System.out.println();
		System.out.print("Update employe: " + emp);
		
		sc.close();
		
	}

}
