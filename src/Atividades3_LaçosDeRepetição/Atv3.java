package Atividades3_LaçosDeRepetição;
import java.util.Scanner;
public class Atv3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int par = 0;

            System.out.println("-----------SOMA DOS PARES------------");

            for(int i=1; i<=100; i++){
                if(i%2 == 0){
                    par += i;
                }

            }
            System.out.println("A soma dos pares é: " + par);
            sc.close();
        }
    }

