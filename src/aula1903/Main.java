
package aula1903;
import java.util.*;

//com metodos, meu modelo
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void menu(){
        System.out.println("=== Menu Principal ===");
        System.out.println("1 - Adicionar Tarefa");
        System.out.println("2 - Excluir Tarefa");
        System.out.println("3 - Mostrar as Tarefas");
        System.out.println("4 - Sair");
    }

    public static void case1(ArrayList<String> tarefas){
        System.out.println("Entrei no adicionar");
        System.out.println("Digite a tarefa que voce completou");

    }
    public static void case2_1(ArrayList<String>  tarefas) {
        System.out.println("Excluir tarefa");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(" Indice " + (i + 1) + " Tarefa : " + tarefas.get(i));
        }
    }
    public static void case2_2(ArrayList<String>  tarefas, int apagar){
        System.out.println("Digite o numero da tarefa que quer apagar");
        tarefas.remove((apagar-1));
        System.out.println("Tarefa apagada com sucesso");

    }

    public static void case3(ArrayList<String> tarefas){
        System.out.println("Mostrando as tarefas cadastradas");
        for (String tarefasMostrar : tarefas){
            System.out.println(tarefasMostrar);
        }
        System.out.println("Mostrar");
    }

    public static void case4(){
        System.out.println("Sair");
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while(true){
            menu();
            int opcaomenu = leitura.nextInt();


            switch (opcaomenu){
                case 1:
                    leitura.nextLine();
                    case1(tarefas);
                    tarefas.add(leitura.nextLine());
                    System.out.println("Cadastrado com Sucesso");

                    break;
                case 2 :
                    case2_1(tarefas);
                    int apagar = leitura.nextInt();
                    case2_2(tarefas,apagar);

                    break;
                case 3:
                    case3(tarefas);
                    break;
                case 4:
                    case4();
                    return;
                default:
                    System.out.println("Digite uma opcao valida ");
            }
        }


    }
}

