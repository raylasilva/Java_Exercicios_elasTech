package aula2503;

//herança
public class Main {
    public static void main(String[] args) {
        //Veiculo  veiculo = new Veiculo("gol","ford","vermelho",2009);
        Moto moto = new Moto("silinder","yamaha","branco", 2009, 1000);
        Carro carro = new Carro("gol","ford","vermelho",2009,4);

        //veiculo.mostrarDados();
        carro.mostrarDados2();
        System.out.println("------------------------");
        moto.mostrarDados3();
    }
}
