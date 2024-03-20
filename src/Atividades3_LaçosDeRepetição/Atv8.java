package Atividades3_LaçosDeRepetição;
import java.util.Random;
import java.util.Scanner;
public class Atv8 {

        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            Random random = new Random();

            int palpite = 0, numerodasorte = random.nextInt(100) + 1;;

            System.out.println("---------Vamos iniciar o jogo-------------");

                    System.out.println(" Voce deve acertar o numero que o robo esta pensando");
                            System.out.println("Voce tem 5 chances");

            for (int i = 5; i > 0; i++) {
                while (palpite != numerodasorte && i != 0) {
                    System.out.println("Digite um numero, vamos ver se voce acerta");

                            palpite = leitura.nextInt();
                    System.out.println("Olá voce tem: " + --i + " chances");

                    if (palpite!=numerodasorte && i!= 0) {
                        System.out.println("Tente novamente");

                    }

                    if (palpite>numerodasorte && i!= 0){
                        System.out.println("Digite um numero menor");
                    }
                    else if(palpite<numerodasorte && i!= 0){
                        System.out.println("Digite um numero maior");
                    }

                    if (palpite == numerodasorte ) {
                        System.out.println("Parabenssssss voce acertou");

                        break;
                    }

                }

                if(i==0 && palpite != numerodasorte){
                    System.out.println("Game over, o numero correto era " + numerodasorte);
                    break;
                }
            }

        }
    }

