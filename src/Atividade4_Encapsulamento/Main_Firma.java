package Atividade4_Encapsulamento;

public class Main_Firma {
    public static void main(String[] args) {

        Colaborador colaborador = new Colaborador("Joao", "Silva", 2000);
        Colaborador colaborador2 = new Colaborador("Pablo", "Reis", -4000);

        System.out.println("Colaboraador " + colaborador.getNome() + " " + colaborador.getSobrenome() + " salario anual: " +  colaborador.getSalarioAnual());
        System.out.println("Colaboraador " + colaborador2.getNome() + " " + colaborador2.getSobrenome() + " salario anual: " +  colaborador2.getSalarioAnual());;

        System.out.println("---------Aumento de salario--------------");
        System.out.println("Colaboraador " + colaborador.getNome() + " " + colaborador.getSobrenome() + " Salario Anual: " +  colaborador.getSalarioComAumento());
        System.out.println("Colaboraador " + colaborador2.getNome() + " " + colaborador2.getSobrenome() + " Salario Anual: " +  colaborador2.getSalarioComAumento());

    }
}
