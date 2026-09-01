package cursoJava;

import java.util.Locale;
import java.util.Scanner;

import entites.Calculator;

public class Raio_Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Value radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.cincunference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunference: %.2f%n ", c);
		System.out.printf("Volume: %.2f%n ", v);
		System.out.printf("PI: %.2f%n ", Calculator.PI);
		
		
		sc.close();

	}

}
