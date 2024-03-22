package Atividade4_Encapsulamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //teste da classe

        System.out.println("Digite os suprimentos: ");
        System.out.println("o número do item faturado");
        int num = sc.nextInt();
        System.out.println("o preço unitário do item");
        double preco_unitario = sc.nextDouble();
        System.out.println("a descrição do item");
        sc.nextLine();
        String descricao = sc.nextLine();
        System.out.println("a quantidade comprada do item ");
        int qtd_comprada = sc.nextInt();

        Suprimentos suprimentos = new Suprimentos(num, preco_unitario, descricao, qtd_comprada);



        System.out.println("Olá, a fatura do item  ");
        System.out.println("Número do item: " + suprimentos.getNum_item_faturado() + "\nPreço unitario: " + suprimentos.getPreco_unitario_item() + "\nItem: " + suprimentos.getDescricao_item() +"\nQuantidade comprada: " + suprimentos.getQtd_comprada_item());
        System.out.println("Valor da fatura: " + suprimentos.getInvoice(suprimentos.getQtd_comprada_item(), suprimentos.getPreco_unitario_item()));

    }
}
