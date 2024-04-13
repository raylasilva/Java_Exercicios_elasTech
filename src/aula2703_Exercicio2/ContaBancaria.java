package aula2703_Exercicio2;

public class ContaBancaria {
    private String cliente;
    private int num_conta;
    private float saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //construtor

public ContaBancaria(String cliente, int num_conta, float saldo){
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
}

public void sacar(float valor) {
    if (saldo - valor >= 0) {
        saldo -= valor;
        System.out.println("Valor sacado: " + valor);
    } else {
        System.out.println("Saldo Insuficiente");
    }

}

public void depositar(float valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso, " + "novo saldo: " + saldo);
        }
         else{
            System.out.println("Valor invalido");
            }
}

public void mostrarDados(){
    System.out.println("Cliente: " + cliente);
    System.out.println("Numero da conta: " + num_conta);
    System.out.println("Saldo: " + saldo);

}
}
