package Atividades3_LaçosDeRepetição;
import java.util.Scanner;
public class Atv4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero;
            boolean primo = true;

            System.out.println("Digite um número: ");
            numero = sc.nextInt();

            if (numero <= 1) {
                primo = false;
            } else {
                for (int i = 2; i <= numero / 2; i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.printf("O número %d é primo", numero);
            } else {
                System.out.printf("O número %d não é primo", numero);
            }

            sc.close();
        }
    }

