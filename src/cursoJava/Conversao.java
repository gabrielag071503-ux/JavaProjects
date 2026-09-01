package cursoJava;

import java.util.Locale;
import java.util.Scanner;

import entites.CurrenceConverter;

public class Conversao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the Dollar Price: ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many doollars will be bought? ");
		double amount = sc.nextDouble();
		
		double result = CurrenceConverter.DollarToReal(amount, dollarPrice);
		
		System.out.printf("Amount to be paid in reais: %.2f%n" , result);
		
		
		
		sc.close();

	}

}
