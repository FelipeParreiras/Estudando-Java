package aula08;

public class Matriz {
	    public static void main(String[] args) {
	        // Exemplo de uso de matrizes em Java

	        // Declarando e inicializando uma matriz de inteiros
	        int[][] matriz = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Imprimindo os elementos da matriz
	        System.out.println("Matriz de inteiros:");
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println(); // Nova linha para cada linha da matriz
	        }

	        // Declarando uma matriz de strings
	        String[][] matrizStrings = new String[2][2];

	        // Inicializando os elementos da matriz de strings
	        matrizStrings[0][0] = "Hello";
	        matrizStrings[0][1] = "World";
	        matrizStrings[1][0] = "Java";
	        matrizStrings[1][1] = "Programming";

	        // Imprimindo os elementos da matriz de strings
	        System.out.println("\nMatriz de strings:");
	        for (int i = 0; i < matrizStrings.length; i++) {
	            for (int j = 0; j < matrizStrings[i].length; j++) {
	                System.out.print(matrizStrings[i][j] + " ");
	            }
	            System.out.println(); // Nova linha para cada linha da matriz de strings
	        }
	    }
	}

