package aula06;

public class OperadoresAritimeticos {

    public static void main(String[] args) {
        // Exemplos de operadores aritméticos em Java

        // Declaração de variáveis
        int a = 10;
        int b = 5;

        // Adição: soma dois operandos
        int soma = a + b;
        System.out.println("Soma: " + soma);

        // Subtração: subtrai o segundo operando do primeiro
        int subtracao = a - b;
        System.out.println("Subtração: " + subtracao);

        // Multiplicação: multiplica dois operandos
        int multiplicacao = a * b;
        System.out.println("Multiplicação: " + multiplicacao);

        // Divisão: divide o primeiro operando pelo segundo
        int divisao = a / b;
        System.out.println("Divisão: " + divisao);

        // Módulo: retorna o resto da divisão do primeiro operando pelo segundo
        int modulo = a % b;
        System.out.println("Módulo: " + modulo);

        // Incremento: aumenta o valor de uma variável em 1
        int incremento = a++;
        System.out.println("Incremento: " + incremento);

        // Decremento: diminui o valor de uma variável em 1
        int decremento = b--;
        System.out.println("Decremento: " + decremento);
    }
}

