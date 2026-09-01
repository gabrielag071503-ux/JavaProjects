package lista_02POO;
import java.util.Locale;
import java.util.Scanner;
import entities_Lista02POO.ContaBancaria;

public class Exerc_06 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        ContaBancaria conta;

        System.out.print("Informe o número da Conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Informe o nome do titular: ");
        String titular = sc.nextLine();

        System.out.print("Haverá um deposito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's') {
            System.out.print("Informe o valor para deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new ContaBancaria(numero, titular, depositoInicial);
        } else {
            conta = new ContaBancaria(numero, titular);
        }

        System.out.println("\nDados da conta: ");
        System.out.println(conta);

        System.out.print("Informe um valor de deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("\nDados da conta atualizados: ");
        System.out.println(conta);

        System.out.print("Informe o valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);

        System.out.println("\nDados da conta atualizados: ");
        System.out.println(conta);
        sc.close();
    } 
}