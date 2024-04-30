package aula08;

public class Array {
	
    public static void main(String[] args) {
        // Exemplo de uso de vetores em Java

        // Declarando e inicializando um vetor de inteiros
        int[] numeros = {10, 20, 30, 40, 50};

        // Imprimindo os elementos do vetor
        System.out.println("Vetor de inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }

        // Declarando um vetor de strings
        String[] nomes = new String[3];

        // Inicializando os elementos do vetor de strings
        nomes[0] = "Alice";
        nomes[1] = "Bob";
        nomes[2] = "Carol";

        // Imprimindo os elementos do vetor de strings
        System.out.println("\nVetor de strings:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Elemento " + i + ": " + nomes[i]);
        }
    }
}
