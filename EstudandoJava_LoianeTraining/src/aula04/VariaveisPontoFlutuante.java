package aula04;

public class VariaveisPontoFlutuante {

    public static void main(String[] args) {
        // Exemplos de variáveis de ponto flutuante em Java

        // float: 32 bits, com precisão de 6-7 dígitos decimais
        float meuFloat = 3.1416f; // O sufixo 'f' indica que é do tipo float
        System.out.println("Float: " + meuFloat);

        // double: 64 bits, com precisão de 15 dígitos decimais
        double meuDouble = 3.141592653589793;
        System.out.println("Double: " + meuDouble);

        // Exemplo de uso de notação científica para números de ponto flutuante
        double cientifico = 1.23e3; // 1.23 * 10^3
        System.out.println("Notação Científica: " + cientifico);
    }
}

