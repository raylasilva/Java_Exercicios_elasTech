package aula2703_Exercicio2;

public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;


    public ContaPoupanca(String cliente, int num_conta, float saldo, int diaRendimento){
        super(cliente, num_conta, saldo);
        this.diaRendimento = diaRendimento;

    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

public void calcularNovoSaldo(float taxaRendimento){
        float novoSaldo = getSaldo();
        novoSaldo = novoSaldo + (novoSaldo * taxaRendimento/100);
        setSaldo(novoSaldo);
        System.out.println("Seu saldo é " + novoSaldo + " com o rendimento");
}




}
