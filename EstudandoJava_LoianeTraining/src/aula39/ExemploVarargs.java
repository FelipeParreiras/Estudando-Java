package aula39;

public class ExemploVarargs {
    public static void main(String[] args) {
        System.out.println(soma(1, 2));
        System.out.println(soma(1, 2, 3));

        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println(soma(vetor));

        System.out.println(somaVarArgs(1, 2, 3, 4, 5));
    }

    static int soma(int a, int b){
        return a + b;
    }
    static int soma(int a, int b, int c){
        return a + b + c;
    }
    static int soma(int[] numeros){
        int total = 0;
        for (int i = 0; i < numeros.length; i++){
            total += numeros[i];
        }
        return total;
    }

    static int somaVarArgs(int... numeros){
        int total = 0;
        for (int i = 0; i < numeros.length; i++){
            total += numeros[i];
        }
        return total;
    }
}
