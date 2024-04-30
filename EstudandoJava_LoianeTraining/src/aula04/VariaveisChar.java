package aula04;

public class VariaveisChar {

    public static void main(String[] args) {
        // Exemplos de variáveis do tipo char em Java

        // char: 16 bits, representando um único caractere Unicode
        char meuChar1 = 'A'; // Caractere A
        char meuChar2 = '\u0061'; // Caractere Unicode para 'a'

        System.out.println("Char 1: " + meuChar1);
        System.out.println("Char 2: " + meuChar2);

        // Exemplo de conversão de char para int
        int valorChar1 = meuChar1; // O valor numérico do caractere 'A'
        int valorChar2 = meuChar2; // O valor numérico do caractere 'a'

        System.out.println("Valor do Char 1: " + valorChar1);
        System.out.println("Valor do Char 2: " + valorChar2);

        // Exemplo de operações com char
        char meuChar3 = (char) (meuChar1 + 1); // Incrementando o valor do caractere 'A'
        System.out.println("Char 3: " + meuChar3);
    }
}

