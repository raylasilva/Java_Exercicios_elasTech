package aula2703_Exercicio2;

public class ContaEspecial extends ContaBancaria {
    private float limite;
    public float getLimite() {
        return limite;
    }
    public ContaEspecial(String cliente, int num_conta, float saldo, float limite){
        super(cliente, num_conta, saldo);
        this.limite = limite;

    }
    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void sacar(float valor){
        double saldo = getSaldo();
        if(valor <= saldo + limite){
            saldo -= valor;
            System.out.println("Valor sacado");
        }
        else{
            System.out.println("Saldo insuficiente");
        }

    }

}
