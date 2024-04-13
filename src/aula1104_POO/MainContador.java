package aula1104_POO;

import java.util.Scanner;

public class MainContador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item;

       Contador contador = new Contador(1000);

        System.out.println("Valor do contador: " +  contador. getValor_contador());
        System.out.println("Inclementando....");
        contador.inclementar();
        contador.inclementar();
        contador.inclementar();
        System.out.println("Valor do contador: " +  contador. getValor_contador());
        System.out.println("Contador Zerado.... ");
        contador.zerar();
        contador.inclementar();
        System.out.println("Inclementando....");
        System.out.println("Retornando valor: " + contador.retornarValor());



    }
}
