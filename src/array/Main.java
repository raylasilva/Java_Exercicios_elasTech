package array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(proc(5));
       /* ArrayList<String>  nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Gil");

        for(String nome : nomes){ //mostrar o que tem no array
            System.out.println(nome);
        }
        System.out.println(nomes.get(0));//mostrar o que tem nessa posição
    */

        /*
                ArrayList<Integer> x = new ArrayList<Integer>();
                for (int i = 2; i < 6; i++)
                    x.add(0, i);
                int n = x.size() / 2;
                x.add(n,9);
                int w = x.get(0);
                for (int i = 1; i < x.size(); i++) {
                    if (x.get(i) > w)
                        w= x.get(i);
                }
                System.out.println(w);*/

        /*int[] v = {3, 7, 2, 3, 10};

        int index, aux, i, j;

        for (i = 0; i <= 3; i++) {
            index = i;

            for (j = i + 1; j <= 4; j++) {
                if (v[j] < v[index]) {
                    index = j;
                }
            }
            if (index != i) {
                aux = v[index];
                v[index] = v[i];
                v[i] = aux;
            }
        }
        for (int n = 0; n < 5; n++) {
            System.out.println(v[n]);
        }*/


    }
            public static int proc(int k) {
                if (k >0) return proc(k-2) + proc(k-1);
                return 1;
            }
        }




