package aula2503;

public class Carro extends Veiculo{
    private int numero_portas;

    public Carro(String marca, String modelo, String cor, int ano, int numero_portas){
        super(marca, modelo, cor, ano);
        this.numero_portas = numero_portas;
    }
    public int getNumero_portas() {
        return numero_portas;
    }

    public void setNumero_portas(int numero_portas) {
        this.numero_portas = numero_portas;
    }

    public void mostrarDados2() {
        mostrarDados();
        System.out.println(numero_portas);

    }



}
