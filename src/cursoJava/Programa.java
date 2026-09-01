package cursoJava;

import java.util.Locale;
import java.util.Scanner;

import entites.Retangulo;
public class Programa {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Retangulo x;
		
		x = new Retangulo();
		
		System.out.println("Informe as dimensões do triangulo: ");
		System.out.print("Altura: ");
		x.a = sc.nextDouble();
		System.out.print("Comprimento: ");
		x.b = sc.nextDouble();
		
		double areaX = x.area();
		double perimetroX = x.perimetro();
		double diagonalX = x.diagonal();
		
		System.out.printf("AREA = %.2f%n", areaX);
		System.out.printf("PERIMETRO = %.2f%n", perimetroX);
		System.out.printf("DIAGONAL = %.2f%n", diagonalX);
		
		
		
		
		sc.close();
	}

}
