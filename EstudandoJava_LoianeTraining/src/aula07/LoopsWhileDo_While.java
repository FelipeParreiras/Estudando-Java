package aula07;

public class LoopsWhileDo_While {

	public static void main(String[] args) {
	        // Exemplos de uso dos loops while e do-while em Java

	        // Loop while para imprimir os números de 1 a 5
	        System.out.println("Loop while:");
	        int contador = 1; // Inicialização do contador
	        while (contador <= 5) { // Condição de continuação
	            System.out.println("Contador: " + contador);
	            contador++; // Atualização do contador
	        }

	        // Loop do-while para imprimir os números de 1 a 5
	        System.out.println("\nLoop do-while:");
	        int contador2 = 1; // Inicialização do contador
	        do {
	            System.out.println("Contador: " + contador2);
	            contador2++; // Atualização do contador
	        } while (contador2 <= 5); // Condição de continuação
	    }
	}