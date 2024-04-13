package aula1104_POO;

public class Contador {
    private int valor_contador;

    public int getValor_contador() {//Mostrar/pegar o valor
        return valor_contador;
    }

    public void setValor_contador(int valor_contador) {//Colocar valor no atributo
        this.valor_contador = valor_contador;
    }

    public Contador(int valor_contador) {
        this.valor_contador = valor_contador;
    }

    public void zerar() {
        this.valor_contador = 0;
    }

    public void inclementar() {
        this.valor_contador++;
    }

    public int retornarValor() {
   return valor_contador;
    }


}
