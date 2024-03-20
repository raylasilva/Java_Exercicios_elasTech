package Atividades3_LaçosDeRepetição;
import java.util.Scanner;
public class Atv5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int sucessor, anterior = 0, atual = 1;

            System.out.println("Os 20 primeiros números da sequência de Fibonacci são:");
            for(int i = 0; i < 20; i++) {
                System.out.print(anterior + " ");
                sucessor = anterior + atual;
                anterior = atual;
                atual = sucessor;
            }
        }
    }

