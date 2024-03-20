package Atividades3_LaçosDeRepetição;
import java.util.Scanner;

    public class Atv2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double numero;

            System.out.println("Digite um número: ");
            numero = sc.nextDouble();

            System.out.println("-----------Tabuada------------");

            for(int i=1; i<=10; i++){
                System.out.println(i + " x " + numero + " = " + (i *

                        numero));
            }
            sc.close();
        }
    }



