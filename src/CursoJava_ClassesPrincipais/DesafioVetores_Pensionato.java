package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

import CursoJava_Entities.Rent;

public class DesafioVetores_Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] room = new Rent[10];

        System.out.print("How many rooms will be rented?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextLine();

            System.out.printf("Rent #%d: \n", i);
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("EMAIL: ");
            String email = sc.next();

            System.out.print("ROOM: ");
            int roomNumber = sc.nextInt();

            while(roomNumber < 1 || roomNumber > 10 || room[roomNumber] != null) {
                if(roomNumber < 1 || roomNumber > 10) {
                    System.out.print("The room number is invalid; please enter only digits from (1 a 10): ");
                } else {
                    System.out.print("The requested room is occupied; please provide another number so we can check: ");
                }
                roomNumber = sc.nextInt();
            }

            room[roomNumber] = new Rent(name, email);

        }

        System.out.println("\nBusy Rooms: ");

        for (int i = 0; i < room.length; i++) {
            if(room[i] != null) {
                System.out.println(i + ": " + room[i]);
            }

        }



        sc.close();
    }
    
}
