package aula04;

public class VariaveisBoolean {

    public static void main(String[] args) {
        // Exemplos de variáveis do tipo boolean em Java

        // Declaração e inicialização de uma variável booleana
        boolean meuBoolean1 = true;
        System.out.println("Boolean 1: " + meuBoolean1);

        // Declaração de outra variável booleana
        boolean meuBoolean2;

        // Atribuição de valor à variável booleana
        meuBoolean2 = false;
        System.out.println("Boolean 2: " + meuBoolean2);

        // Exemplo de expressão booleana
        int x = 5;
        int y = 10;
        boolean resultadoExpressao = (x < y);
        System.out.println("Resultado da expressão: " + resultadoExpressao);

        // Exemplo de uso de variáveis booleanas em estruturas de controle
        if (meuBoolean1) {
            System.out.println("Esta mensagem será exibida, pois meuBoolean1 é verdadeiro.");
        } else {
            System.out.println("Esta mensagem não será exibida.");
        }
    }
}

