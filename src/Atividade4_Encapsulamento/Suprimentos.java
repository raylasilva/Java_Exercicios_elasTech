package Atividade4_Encapsulamento;

public class Suprimentos {
    private int num_item_faturado;
    private double preco_unitario_item;
    private String descricao_item;
    private int qtd_comprada_item;


    ////////Metodos gets e sets

    public int getNum_item_faturado() {

        return num_item_faturado;
    }

    public void setNum_item_faturado(int num_item_faturado) {

        this.num_item_faturado = num_item_faturado;
    }

    public double getPreco_unitario_item() {

            return preco_unitario_item;

    }

    public void setPreco_unitario_item(double preco_unitario_item) {
        if (preco_unitario_item > 0.0) {
            this.preco_unitario_item = preco_unitario_item;
        }
        else {
            this.preco_unitario_item = 0.0;
        }
    }
    public String getDescricao_item() {
        return descricao_item;
    }

    public void setDescricao_item(String descricao_item) {
        this.descricao_item = descricao_item;
    }
    public int getQtd_comprada_item() {
        return qtd_comprada_item;
    }

    public void setQtd_comprada_item(int qtd_comprada_item) {
        if (qtd_comprada_item > 0) {
             this.qtd_comprada_item = qtd_comprada_item ;
        }
        else {
            this.qtd_comprada_item =  0;
        }

    }

    public double getInvoice(int qtd_comprada_item, double preco_unitario_item){
        return (double) qtd_comprada_item * preco_unitario_item;

    }


       /////////////Construtores
    public Suprimentos(){

    }

    public Suprimentos(int num_item_faturado, double preco_unitario_item,String descricao_item, int qtd_comprada_item){
        this.num_item_faturado = num_item_faturado;
        this.descricao_item = descricao_item;

        if(qtd_comprada_item > 0) {
            this.qtd_comprada_item=qtd_comprada_item ;
        }
        else {
            this.qtd_comprada_item =  0;
        }

        if(preco_unitario_item  > 0.0) {
            this.preco_unitario_item = preco_unitario_item;
        }
        else {
            this.preco_unitario_item  =  0.0;
        }

    }

}
