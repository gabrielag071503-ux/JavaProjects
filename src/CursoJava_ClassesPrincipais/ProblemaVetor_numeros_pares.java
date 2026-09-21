package CursoJava_ClassesPrincipais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaVetor_numeros_pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdPares;

        System.out.print("Quantos números serão lidos? ");
        n = sc.nextInt();
        int[] vect = new int[n];
 
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        qtdPares = 0;

        System.out.println("\nNúmeros pares = ");
        for(int i = 0; i < n; i++) {
            if(vect[i] % 2 == 0) {
               System.out.printf("%d ",vect[i]);
               qtdPares++; 
            }
        }

        System.out.printf("\n\nQuantidade de números pares = %d", qtdPares);
        sc.close();
    }
    
}
