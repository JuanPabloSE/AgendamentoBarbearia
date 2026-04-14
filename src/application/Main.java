package application;
import java.util.Scanner;
import entities.Cliente;
import service.BarbeariaService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BarbeariaService barbeariaService = new BarbeariaService();

        int opcao;

        do {
            System.out.println("=== Sistema de Agendamento de Barbearia ===");
            System.out.println("1. Novo Agendamento");
            System.out.println("2. Listar Agendamentos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Cliente: ");
                    String nome = sc.nextLine().trim();

                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine().trim();

                    System.out.print("Data: ");
                    String data = sc.nextLine().trim();

                    System.out.print("Horario: ");
                    String horario = sc.nextLine().trim();

                    Cliente cliente = new Cliente(nome, telefone);
                    barbeariaService.agendar(cliente, data, horario);

                    System.out.println("Agendamento concluido com sucesso!");
                    System.out.println();
                    break;
                case 2:
                    barbeariaService.listarAgendamentos();
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();

    }

}
