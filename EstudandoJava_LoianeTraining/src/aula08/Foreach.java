package aula08;

public class Foreach {
    public static void main(String[] args) {
        // Exemplo de uso do loop foreach em Java

        // Vetor de inteiros
        int[] numeros = {1, 2, 3, 4, 5};

        // Usando foreach para iterar sobre os elementos do vetor
        System.out.println("Vetor de inteiros:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Matriz de inteiros
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Usando foreach para iterar sobre os elementos da matriz
        System.out.println("\nMatriz de inteiros:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println(); // Nova linha para cada linha da matriz
        }
    }
}
