package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaVetor_mais_velho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, maisVelho, posMaior;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for(int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        maisVelho = idade[0];
        posMaior = 0;

        for(int i = 0; i < n; i++) {
            if(idade[i] > maisVelho) {
                maisVelho = idade[i];
                posMaior = i;
            }
        }

        System.out.printf("Pessoa mais Velha: %s\n", nome[posMaior]);

        sc.close();
    }
    
}
