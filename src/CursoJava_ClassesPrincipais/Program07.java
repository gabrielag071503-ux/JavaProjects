package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

import CursoJava_Entities.ContaBancaria;

public class Program07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta;

        System.out.print("Enter Account Number:");
        int numeroConta = sc.nextInt();

        System.out.print("Enter Account Holder: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char res = sc.next().charAt(0);
        
        if (res == 'y') {
            System.out.print("Enter initial deposit value:");
            double depositoInicial = sc.nextDouble();
            conta = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
        } else {
            conta = new ContaBancaria(numeroConta, nomeTitular);
        }

        System.out.println("Account data:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Updated account data:");
        System.out.println(conta);

        System.out.println();

        System.out.print("Enter a Withdraw value: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);
        System.out.println("Updated account data: ");
        System.out.println(conta);
        sc.close();
    }

}
