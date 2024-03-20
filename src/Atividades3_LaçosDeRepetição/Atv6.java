package Atividades3_LaçosDeRepetição;
import java.util.Scanner;
public class Atv6 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int cont, numero=0, soma=0;
            double media=0;

            cont = 0;
            while(numero>=0) {

                System.out.println("digite um numero: ");
                numero = sc.nextInt();

                for(int i = numero; i<=numero; i++){
                    soma += i;
                }
                cont++;

                if (numero < 0) {
                    media = (double) soma/cont;
                    break;
                }
            }
            System.out.println("A media dos numeros inseridos é: " +
                    media);

            sc.close();
        }
    }

