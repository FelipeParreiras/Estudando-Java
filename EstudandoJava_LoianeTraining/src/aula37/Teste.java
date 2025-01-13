package aula37;

public class Teste {
    public static void main(String[] args) {
        EscopoDeVariaveis escopo = new EscopoDeVariaveis();
        escopo.setValor(10);

        System.out.println(escopo.getValor());
        System.out.println(escopo.clacularValor(20));
        System.out.println(escopo.getValor());
        System.out.println(escopo.teste1());
        System.out.println(escopo.getValor());
    }
    
}
