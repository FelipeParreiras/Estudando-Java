package aula07;

public class IfElse {

    public static void main(String[] args) {
        // Exemplos de uso de if e if-else em Java

        // Declaração de variáveis
        int a = 10;
        int b = 20;

        // Exemplo de if simples
        if (a < b) {
            System.out.println("a é menor que b");
        }

        // Exemplo de if-else
        if (a > b) {
            System.out.println("a é maior que b");
        } else {
            System.out.println("a não é maior que b");
        }

        // Exemplo de if-else aninhado
        if (a == b) {
            System.out.println("a é igual a b");
        } else if (a > b) {
            System.out.println("a é maior que b");
        } else {
            System.out.println("a é menor que b");
        }

        // Exemplo de uso do operador ternário
        String mensagem = (a > b) ? "a é maior que b" : "a não é maior que b";
        System.out.println(mensagem);
    }
}

