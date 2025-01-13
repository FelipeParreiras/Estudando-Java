package aula37;

public class EscopoDeVariaveis {

private int valor;

public int getValor() {
return valor;
}

public void setValor(int valor) {
    this.valor = valor;
}

public int clacularValor(int valor) {
    valor = valor + 10;
    return valor;
}

public int teste1() {
    int valor = 5;
    if (true) {
        valor--;
    }
    this.valor = valor;
    return valor;
}
public void teste2() {
for(int i=0; i<10; i++) {
    System.out.println(i);
}

int j;
for(j=0; j<10; j++) {
    System.out.println(j);
}
}

public void teste3() {
boolean flag = true;

if (flag) {
    int umaVariavel = 10;
    umaVariavel++;
    System.out.println(umaVariavel);
}
}

public void teste4(int num) {
    int total = 0;
try{
    int outroNumero = 0;
    total = num/outroNumero;
}catch (Exception e) {
   e.printStackTrace();
}finally{
    total++;
    //outroNumero++; //erro de compilação
}
    num++;
    //outroNumero++;
}
}