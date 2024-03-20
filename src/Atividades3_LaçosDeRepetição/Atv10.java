package Atividades3_LaçosDeRepetição;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String produto;
        int cond;
        List<String> mercado = new ArrayList<>();
        do {
            System.out.println("Digite o item na lista de compras: ");

                    produto = sc.next();
            mercado.add(produto);
            System.out.println("Lista completa: ");
            for(String item : mercado) {
                System.out.println(item);
            }
            System.out.println("Deseja inserir mais itens?\n se sim, digite '1',\n Se deseja sair digite '0' ");

            cond = sc.nextInt();
        }
        while(cond != 0);

    }
}