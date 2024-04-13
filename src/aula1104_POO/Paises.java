package aula1104_POO;

import java.util.ArrayList;

public class Paises extends Continente{



    public Paises(String paisesContinentes, double dimensao,Double populacao){
        super(paisesContinentes, dimensao,populacao);

    }
    public Paises(){
        new Continente();
    }


    public void maiorPopulacao(Paises paises) {
        System.out.println(paises.getPopulacao());

    }

    public void menorPopulacao(Paises paises) {
        System.out.println(paises.getPopulacao());

    }

    public void maiorDimensao(Paises paises) {
        System.out.println(paises.getDimensao());

    }

    public void menorDimensao(Paises paises) {
        System.out.println(paises.getDimensao());

    }

    public void razaoTerritorial( double paises1, double paises2){
        double resultado =  (paises1 - paises2);
        System.out.println(resultado);
    }




}


