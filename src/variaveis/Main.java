package variaveis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declarando o scanner

        int idade, idade_animal, numero;//criando as variaveis
        idade =18;
        idade_animal = 20;
        numero = 50;

        int[] numeros = {1,2,3};//vetores
        numeros[1] = 1;
        for(int i=0; i<3; i++){
        System.out.println(numeros[i]);
    }
}}
