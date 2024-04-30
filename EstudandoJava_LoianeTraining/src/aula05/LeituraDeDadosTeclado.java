package aula05;

import java.util.Scanner;

public class LeituraDeDadosTeclado {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); // Instanciação do objeto Scanner para leitura do teclado

        // Leitura de uma entrada de texto
        System.out.println("Insira uma Entrada:");
        String entrada01 = scan.nextLine(); // Leitura de uma linha inteira de texto
        System.out.println("A Entrada Inserida foi: " + entrada01); // Exibição da entrada

        // Leitura de uma entrada de texto utilizando apenas uma palavra
        System.out.println("Insira uma Entrada utilizando apenas uma palavra:");
        String entrada02 = scan.next(); // Leitura de uma única palavra
        System.out.println("A Entrada Inserida foi: " + entrada02); // Exibição da entrada

        // Leitura de uma entrada de números inteiros
        System.out.println("Insira uma Entrada utilizando apenas inteiros:");
        int entrada03 = scan.nextInt(); // Leitura de um número inteiro
        System.out.println("A Entrada Inserida foi: " + entrada03); // Exibição da entrada

        // Leitura de até três entradas de texto utilizando apenas uma palavra cada
        System.out.println("Insira até 3 Entradas utilizando apenas uma palavra:");
        String entrada04 = scan.next(); // Leitura da primeira palavra
        String entrada05 = scan.next(); // Leitura da segunda palavra
        String entrada06 = scan.next(); // Leitura da terceira palavra
        System.out.println("A 1ª Entrada Inserida foi: " + entrada04); // Exibição da primeira entrada
        System.out.println("A 2ª Entrada Inserida foi: " + entrada05); // Exibição da segunda entrada
        System.out.println("A 3ª Entrada Inserida foi: " + entrada06); // Exibição da terceira entrada
    }
}
