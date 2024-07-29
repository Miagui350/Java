import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroDeVeiculos cadastro = new CadastroDeVeiculos();

        while (true) {
            System.out.println("\n--- Sistema de Cadastro de Veículos ---");
            System.out.println("1. Adicionar Veículo");
            System.out.println("2. Remover Veículo");
            System.out.println("3. Buscar Veículo");
            System.out.println("4. Listar Veículos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a marca do veículo: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o modelo do veículo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite o ano do veículo: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite a placa do veículo: ");
                    String placa = scanner.nextLine();
                    Veiculo veiculo = new Veiculo(marca, modelo, ano, placa);
                    cadastro.adicionarVeiculo(veiculo);
                    System.out.println("Veículo adicionado com sucesso.");
                    break;

                case 2:
                    System.out.print("Digite a placa do veículo a ser removido: ");
                    placa = scanner.nextLine();
                    cadastro.removerVeiculo(placa);
                    System.out.println("Veículo removido se existia.");
                    break;

                case 3:
                    System.out.print("Digite a placa do veículo a ser buscado: ");
                    placa = scanner.nextLine();
                    Veiculo encontrado = cadastro.buscarVeiculo(placa);
                    if (encontrado != null) {
                        System.out.println("Veículo encontrado: " + encontrado);
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Lista de veículos:");
                    cadastro.listarVeiculos();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
