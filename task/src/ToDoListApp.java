import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    private static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("\nComandos disponíveis:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Marcar tarefa como concluída");
            System.out.println("5. Sair");
            System.out.print("Escolha um comando: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    addTask(scanner);
                    break;
                case "2":
                    removeTask(scanner);
                    break;
                case "3":
                    listTasks();
                    break;
                case "4":
                    markTaskAsCompleted(scanner);
                    break;
                case "5":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Comando inválido. Tente novamente.");
                    break;
            }
        } while (!command.equals("5"));

        scanner.close();
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Digite a descrição da tarefa: ");
        String description = scanner.nextLine();
        tasks.add(new Task(description));
        System.out.println("Tarefa adicionada.");
    }

    private static void removeTask(Scanner scanner) {
        listTasks();
        System.out.print("Digite o índice da tarefa a ser removida: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Tarefa removida.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.println(i + ": " + task.getDescription() + " ["
                        + (task.isCompleted() ? "Concluída" : "Pendente") + "]");
            }
        }
    }

    private static void markTaskAsCompleted(Scanner scanner) {
        listTasks();
        System.out.print("Digite o índice da tarefa a ser marcada como concluída: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
            System.out.println("Tarefa marcada como concluída.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}

class Task {
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
