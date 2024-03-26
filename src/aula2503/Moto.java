package aula2503;

public class Moto extends Veiculo{
    private int cilindradas;


    public Moto(String marca, String modelo, String cor, int ano, int cilindradas){
        super(marca, modelo, cor, ano);
        this.cilindradas = cilindradas;
    }
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void mostrarDados3(){
        mostrarDados();
        System.out.println(getCilindradas());
    }

}
