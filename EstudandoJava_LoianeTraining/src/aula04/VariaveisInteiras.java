package aula04;

public class VariaveisInteiras {

    public static void main(String[] args) {
        // Exemplos de variáveis inteiras em Java

        // byte: 8 bits, com valor mínimo de -128 e máximo de 127
        byte meuByte = 100;
        System.out.println("Byte: " + meuByte);

        // short: 16 bits, com valor mínimo de -32,768 e máximo de 32,767
        short meuShort = 20000;
        System.out.println("Short: " + meuShort);

        // int: 32 bits, com valor mínimo de -2^31 e máximo de 2^31 - 1
        int meuInt = 1000000;
        System.out.println("Int: " + meuInt);

        // long: 64 bits, com valor mínimo de -2^63 e máximo de 2^63 - 1
        long meuLong = 1000000000L; // O sufixo 'L' indica que é do tipo long
        System.out.println("Long: " + meuLong);

        // Exemplo de uso de tipos literais para expressar números em binário, octal e hexadecimal
        int binario = 0b1010; // Número binário, prefixo '0b'
        int octal = 012; // Número octal, prefixo '0'
        int hexadecimal = 0xA; // Número hexadecimal, prefixo '0x'

        System.out.println("Número binário: " + binario);
        System.out.println("Número octal: " + octal);
        System.out.println("Número hexadecimal: " + hexadecimal);
    }
}

