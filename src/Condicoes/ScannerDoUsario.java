package Condicoes;

import java.util.Scanner;

public class ScannerDoUsario {
    public static void main(String[] args) {
        /*
        Scanner = É um jeito de trazer o usuario para dentro da aplicacao
        objetivo: O usuario vai criar um ninja e vamos validar os dados
         */

    //Abrir o Scanner
    Scanner caixaDeTexo = new Scanner(System.in);

    //Receber o nome do ninja
    System.out.println("Escreva aqui o nome do ninja: ");
    String nomeDoNinja = caixaDeTexo.nextLine();
    System.out.println("O nome do ninja é: " + nomeDoNinja);

    //Receber a idade do ninja
    System.out.println("Escreva aqui a idade do seu ninja: ");
    int idadeDoNinja = caixaDeTexo.nextInt();
    System.out.println("A idade do seu ninja é: " + idadeDoNinja + " anos");

    //tratamento de dados
    if (idadeDoNinja >= 18) {
        System.out.println("Esse ninja é maior de idade");
    } else {
        System.out.println("Esse ninja é menor de idade");
    }

    //Fechar o Scanner
    caixaDeTexo.close();
    }
}
