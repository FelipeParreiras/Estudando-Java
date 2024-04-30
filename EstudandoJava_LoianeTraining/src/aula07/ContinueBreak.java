package aula07;

public class ContinueBreak {
    public static void main(String[] args) {
        // Exemplo de uso dos comandos break e continue em Java

        // Loop for para imprimir os números de 1 a 10, com break e continue
        System.out.println("Loop for com break e continue:");
        for (int i = 1; i <= 10; i++) {
            // Verifica se i é par
            if (i % 2 == 0) {
                continue; // Pula a iteração atual e continua para a próxima iteração
            }
            // Verifica se i é maior que 5
            if (i > 5) {
                break; // Sai do loop quando i for maior que 5
            }
            System.out.println("Número: " + i);
        }
    }
}
