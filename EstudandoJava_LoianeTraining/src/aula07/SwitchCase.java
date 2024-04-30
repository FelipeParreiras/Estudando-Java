package aula07;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        // Exemplo de uso do switch-case em Java
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Insira um dia da semana:");
    	
        // Declaração de uma variável para representar o dia da semana (1 a 7)
        int dia = scan.nextInt();

        // Switch-case para imprimir o nome do dia da semana com base no número fornecido
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido de dia da semana");
                break;
        }
    }
}

