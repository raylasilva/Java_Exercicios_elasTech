package aula1903;
import java.util.*;

public class Main_modeloCerto {

    static Scanner leitura = new Scanner(System.in);
    static ArrayList<String> tarefas = new ArrayList<>();
    public static void adcionarTarefa(){
        leitura.nextLine();
        System.out.println("Entrei no adicionar");
        System.out.println("Digite a tarefa que voce completou");
        tarefas.add(leitura.nextLine());
        System.out.println("Cadastrado com Sucesso");
    }
    public static void excluirTarefa(){
        System.out.println("Excluir tarefa");
        for(int i = 0 ; i < tarefas.size() ; i++){
            System.out.println(" Indice "+ (i+1) + " Tarefa : "+ tarefas.get(i));
        }
        System.out.println("Digite o numero da tarefa que quer apagar");
        int apagar = leitura.nextInt();
        tarefas.remove((apagar-1));
        System.out.println("Tarefa apagada com sucesso");
    }
    public static void mostrarTarefa(){
        System.out.println("Mostrando as tarefas cadastradas");
        for (String tarefasMostrar : tarefas){
            System.out.println(tarefasMostrar);
        }
        System.out.println("Mostrar");
    }
    public static void main(String[] args) {
        while(true){
            System.out.println("=== Menu Principal ===");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Excluir Tarefa");
            System.out.println("3 - Mostrar as Tarefas");
            System.out.println("4 - Sair");


            int opcaomenu = leitura.nextInt();


            switch (opcaomenu){
                case 1:
                    adcionarTarefa();
                    break;
                case 2 :
                    excluirTarefa();
                    break;
                case 3:
                    mostrarTarefa();
                    break;
                case 4:
                    System.out.println("Sair");
                    return;
                default:
                    System.out.println("Digite uma opcao valida ");
            }
        }






    }
}

/*
Exemplo 2:
Estilo diferente de fazer, com o Array e o Scanner dentro do “public static void main”:

public class ListadeTarefas {
    public static void main(String[] args) {
        ArrayList<String> listaTarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            exibirMenu();
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner


            switch (escolha) {
                case 1:
                    adicionarTarefa(listaTarefas, scanner);
                    break;
                case 2:
                    removerTarefa(listaTarefas, scanner);
                    break;
                case 3:
                    listarTarefas(listaTarefas);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
    }


    public static void exibirMenu() {
        System.out.println("\n===== Menu =====");
        System.out.println("1. Adicionar Tarefa");
        System.out.println("2. Remover Tarefa");
        System.out.println("3. Listar Tarefas");
        System.out.println("4. Sair do Programa");
        System.out.print("Escolha uma opção: ");
    }


    public static void adicionarTarefa(ArrayList<String> listaTarefas, Scanner scanner) {
        System.out.print("Digite a nova tarefa: ");
        String tarefa = scanner.nextLine();
        listaTarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }


    public static void removerTarefa(ArrayList<String> listaTarefas, Scanner scanner) {
        if (listaTarefas.isEmpty()) {
            System.out.println("Não há tarefas para remover.");
            return;
        }


        System.out.println("Tarefas pendentes:");
        for (int i = 0; i < listaTarefas.size(); i++) {
            System.out.println((i + 1) + ". " + listaTarefas.get(i));
        }
        System.out.print("Digite o número da tarefa que deseja remover: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpar o buffer do scanner
        if (indice >= 0 && indice < listaTarefas.size()) {
            String tarefaRemovida = listaTarefas.remove(indice);
            System.out.println("Tarefa '" + tarefaRemovida + "' removida com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }


    public static void listarTarefas(ArrayList<String> listaTarefas) {
        if (listaTarefas.isEmpty()) {
            System.out.println("Não há tarefas pendentes.");
            return;
        }


        System.out.println("Tarefas pendentes:");
        for (int i = 0; i < listaTarefas.size(); i++) {
            System.out.println((i + 1) + ". " + listaTarefas.get(i));
        }
    }


*/