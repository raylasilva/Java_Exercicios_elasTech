package aula1104_POO;

import java.util.ArrayList;
import java.util.Scanner;

public class MainContinente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String addPaises = "";
        ArrayList<Double> dimensao = new ArrayList<>();
        ArrayList<Double> populacao = new ArrayList<>();
        int[][] guardarArrays = new int[3][];

        Continente continente = new Continente("America", 42.550, 925.200);
        Continente paisesContinente = new Continente();



        for (int i = 0; i <= 2; i++) {
            System.out.println("Adicione paises ao continente");
            addPaises = sc.nextLine();
            paisesContinente.adicionarPaises(addPaises);
        }
        Paises paises1 = new Paises(paisesContinente.getPaisesContinentes().get(0),8.510,200.000);
        Paises paises2 = new Paises(paisesContinente.getPaisesContinentes().get(1),2.780,50.000);
        Paises paises3 = new Paises(paisesContinente.getPaisesContinentes().get(2),1.500,10.000);
        Paises pais = new Paises();



                System.out.println("-----------------------------");
        System.out.println("Continente: " + continente.getNomeContinente());
        continente.dimensaoTotal();
        continente.densidadePopulacional();
        continente.populacao();
        System.out.println("--------------------");
        System.out.println("Todos paises da lista: ");
        System.out.println("Pais: "+ paisesContinente.getPaisesContinentes().get(0) + ", Dimensão: " + paises1.getDimensao() + ", População: " + paises1.getPopulacao());
        System.out.println("Pais: "+ paisesContinente.getPaisesContinentes().get(1) + ", Dimensão: " + paises2.getDimensao() + ", População: " + paises2.getPopulacao());
        System.out.println("Pais: "+ paisesContinente.getPaisesContinentes().get(2) + ", Dimensão: " + paises3.getDimensao() + ", População: " + paises3.getPopulacao());
        System.out.println("Maior população: " + paisesContinente.getPaisesContinentes().get(0));
        pais.maiorPopulacao(paises1);
        System.out.println("Menor população: " + paisesContinente.getPaisesContinentes().get(2));
        pais.maiorPopulacao(paises3);
        System.out.println("Maior dimensão: " + paisesContinente.getPaisesContinentes().get(0));
        pais.maiorDimensao(paises1);
        System.out.println("Menor dimensão: " + paisesContinente.getPaisesContinentes().get(2));
        pais.menorDimensao(paises3);
        System.out.println("Razao territorial: " +  " de " + paisesContinente.getPaisesContinentes().get(0) + " para " + paisesContinente.getPaisesContinentes().get(2));
        pais.razaoTerritorial(paises1.getDimensao(),paises3.getDimensao());




    }
}
