package Atividades3_LaçosDeRepetição;
import java.util.Scanner;
public class Atv7 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int cond = 0;

            double num1, num2;

            System.out.println("------------CALCULADORA-------------");

            do {

                System.out.println("\nDigite 2 números: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();

                System.out.println("Digite o código da operação a ser realizada: ");

                System.out.println("1- Divisão");
                System.out.println("2- Soma");
                System.out.println("3- Multplicação");
                System.out.println("4- Subtração");
                System.out.println("Caso deseja sair digite 0 ");
                cond = sc.nextInt();

                switch (cond){
                    case 1:
                        System.out.println("O resultado da Divisão é: " +

                                (num1 / num2));
                        break;
                    case 2:
                        System.out.println("O resultado da Soma é: " + (num1 +

                                num2));

                        break;
                    case 3:
                        System.out.println("O resultado da Multiplicação é: "

                                + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("O resultado da Subtração é: " +

                                (num1 - num2));
                    case 0:
                        System.out.println("Programa finalizado");

                        break;
                    default:
                        System.out.println("Digite uma das opções solicitadas");

                }
            }
            while(cond != 0);

            sc.close();
        }
    }

