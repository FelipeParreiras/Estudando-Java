package aula04;

public class VariaveisString {

    public static void main(String[] args) {
        // Exemplos de variáveis do tipo String em Java

        // Declaração e inicialização de uma String
        String minhaString1 = "Olá, mundo!";
        System.out.println("String 1: " + minhaString1);

        // Concatenação de Strings
        String minhaString2 = "Java";
        String minhaString3 = " é uma linguagem de programação.";
        String resultadoConcatenacao = minhaString2 + minhaString3;
        System.out.println("Concatenação: " + resultadoConcatenacao);

        // Comprimento de uma String
        int comprimentoString = minhaString1.length();
        System.out.println("Comprimento da String 1: " + comprimentoString);

        // Comparação de Strings
        String string1 = "java";
        String string2 = "Java";
        boolean saoIguais = string1.equals(string2); // Verifica se as strings são iguais, considerando maiúsculas e minúsculas
        System.out.println("As strings são iguais? " + saoIguais);

        // Conversão de outras variáveis para String
        int numero = 42;
        String stringNumero = Integer.toString(numero);
        System.out.println("String do número: " + stringNumero);
    }
}

