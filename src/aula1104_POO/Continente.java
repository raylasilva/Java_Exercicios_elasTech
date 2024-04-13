package aula1104_POO;

import java.util.ArrayList;

public class Continente {
    private String nomeContinente;
    private double dimensao;
    private double populacao;
    private ArrayList<String>  paisesContinentes = new ArrayList<>();



    public Continente(String nomeContinente, double dimensao, double populacao){//inicializar nome do continente
        this.nomeContinente = nomeContinente;
        this.dimensao = dimensao;
        this.populacao = populacao;
    }
   public Continente() {
    }

    public String getNomeContinente() {
        return nomeContinente;
    }

    public void setNomeContinente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }



    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public ArrayList<String> getPaisesContinentes() {
        return paisesContinentes;
    }

    public void setPaisesContinentes(ArrayList<String> paisesContinentes) {
        this.paisesContinentes = paisesContinentes;
    }

    public void adicionarPaises(String paises) {//permitir adicionar paises ao continente
        paisesContinentes.add(paises);
        }
    public void mostrarPaises(String paises){
        System.out.println("Lista com todos paises: ");
        for (String paisContinente : paisesContinentes) {
            System.out.println(paisContinente);
        }
    }
        public void dimensaoTotal(){//dimensao do continente
            System.out.println("Dimensão do continente: " + getDimensao());
        }

        public void populacao(){//populacao do continente
            System.out.println("População do continente: " + getPopulacao());
        }
        public void densidadePopulacional(){//densidade populacional do continente
            System.out.println("Densidade populacional do continente: " + (getPopulacao()/getDimensao()));
        }



    }






