package aula2703_Exercicio2;

public class ContasJava {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Joao", 1234, 5000, 2);
        contaPoupanca.sacar(200);
        contaPoupanca.depositar(50);
        contaPoupanca.calcularNovoSaldo(10);
        System.out.println("Cliente: " + contaPoupanca.getCliente());
        System.out.println("Numero da conta: " + contaPoupanca.getNum_conta());
        System.out.println("Saldo: " + contaPoupanca.getSaldo());

    }
}
