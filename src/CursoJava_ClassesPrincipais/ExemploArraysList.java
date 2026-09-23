package CursoJava_ClassesPrincipais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploArraysList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        /* Irá adicionar elementos na lista */
        list.add("Maria");
        list.add("Marcos");
        list.add("Joao");
        list.add("Joaquim");
        list.add("Gabriel");
        list.add("Anna");
        for (String obj : list) {
            System.out.println(obj);
        }

        /* Irá adicionar um elemento na segunda posição da lista. */
        System.out.println("_____________________________");
        list.add(2, "Pedro");
        for (String obj : list) {
            System.out.println(obj);
        }

        /* Irá informar o tamanho da Lista e em seguida imprimir a lista completa */
        System.out.println("_____________________________");
        System.out.println("Tamanho da lista: " + list.size());
        for (String obj : list) {
            System.out.println(obj);
        }

        /*
         * Irá remover o elemento que está ocupando a posição de número
         * 5 da lista
         */
        System.out.println("______________________________");
        list.remove(5);
        for (String obj : list) {
            System.out.println(obj);
        }

        /*
         * Irá remover elementos da lista que começam com a letra 'M',
         * Logo em seguida mostrará na tela os nomes que restaram
         */
        System.out.println("______________________________");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String obj : list) {
            System.out.println(obj);
        }

        /*
         * Saber a posição de um dado elemento da Lista,
         * caso o nome não esteja na lista retorna como: -1
         */
        System.out.println("______________________________");
        System.out.println("IndexOF Joaquim: " + list.indexOf("Joaquim"));
        System.out.println("IndexOF Joaquim: " + list.indexOf("Maria"));

        /*
         * Irá filtrar uma nova lista somente com Elementos que começem com a letra 'J'
         */
        System.out.println("________________________________");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        /*
         * Irá procurar a primeira posição e verificar se o primeiro elemento presente
         * na lista começa com 'J',
         * e em seguida irá mostrar na tela, senão irá mostrar na tela como 'null'
         */
        System.out.println("________________________________");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }

}
