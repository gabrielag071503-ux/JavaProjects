package cursoJava;

import java.util.Scanner;

import entites.Rent;

public class DesafioJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rent vect[] = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.printf("RENT #" + i + " :");
			System.out.print("NAME: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("EMAIL: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			Rent rent = new Rent(name,email);
			
			vect[room] = rent;
		}
		
		System.out.println();
		System.out.println("BUSY ROOMS: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();

	}

}
