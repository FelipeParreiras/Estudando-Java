package aula06;

public class OperadoresRelacionais {

    public static void main(String[] args) {
        // Exemplos de operadores relacionais em Java

        // Declaração de variáveis
        int a = 5;
        int b = 10;

        // Operador de igualdade (==): Retorna verdadeiro se os operandos forem iguais
        boolean igualdade = (a == b);
        System.out.println("Operador de igualdade: " + igualdade);

        // Operador de desigualdade (!=): Retorna verdadeiro se os operandos forem diferentes
        boolean desigualdade = (a != b);
        System.out.println("Operador de desigualdade: " + desigualdade);

        // Operador de maior que (>): Retorna verdadeiro se o operando da esquerda for maior que o da direita
        boolean maiorQue = (a > b);
        System.out.println("Operador de maior que: " + maiorQue);

        // Operador de menor que (<): Retorna verdadeiro se o operando da esquerda for menor que o da direita
        boolean menorQue = (a < b);
        System.out.println("Operador de menor que: " + menorQue);

        // Operador de maior ou igual que (>=): Retorna verdadeiro se o operando da esquerda for maior ou igual ao da direita
        boolean maiorOuIgualQue = (a >= b);
        System.out.println("Operador de maior ou igual que: " + maiorOuIgualQue);

        // Operador de menor ou igual que (<=): Retorna verdadeiro se o operando da esquerda for menor ou igual ao da direita
        boolean menorOuIgualQue = (a <= b);
        System.out.println("Operador de menor ou igual que: " + menorOuIgualQue);
    }
}
