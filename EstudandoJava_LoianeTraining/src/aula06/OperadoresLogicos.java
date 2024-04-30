package aula06;

public class OperadoresLogicos {

    public static void main(String[] args) {
        // Exemplos de operadores lógicos em Java

        // Declaração de variáveis
        boolean a = true;
        boolean b = false;

        // Operador AND (&&): Retorna verdadeiro se ambas as expressões forem verdadeiras
        boolean resultadoAND = a && b;
        System.out.println("Operador AND: " + resultadoAND);

        // Operador OR (||): Retorna verdadeiro se pelo menos uma das expressões for verdadeira
        boolean resultadoOR = a || b;
        System.out.println("Operador OR: " + resultadoOR);

        // Operador NOT (!): Inverte o valor da expressão
        boolean resultadoNOT_A = !a;
        boolean resultadoNOT_B = !b;
        System.out.println("Operador NOT para A: " + resultadoNOT_A);
        System.out.println("Operador NOT para B: " + resultadoNOT_B);
    }
}

