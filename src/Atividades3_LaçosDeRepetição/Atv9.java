package Atividades3_LaçosDeRepetição;
import java.util.Random;
import java.util.Scanner;
public class Atv9 {


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double temperatura;
            int cond = 0;

            do {

                System.out.println("Digite a temperatura: ");
                temperatura = sc.nextDouble();

                System.out.println("Para converter a celsius digite '1', para converter a Fahrenheit digite '2' ");

                System.out.println("Se deseja sair digite 0");
                cond = sc.nextInt();

                switch(cond){
                    case 1:
                        System.out.println("A temperatura em celsius é: " + ((temperatura - 32)/1.8));

                        break;
                    case 2:
                        System.out.println("A temperatura em Farenheit é: " + ((temperatura * 1.8) + 32));

                        break;
                    case 0:
                        System.out.println("Programa finalizado");
                    default:
                        System.out.println("Digite o código solicitado");
                }
            }

            while(cond != 0);

        }
    }
}
