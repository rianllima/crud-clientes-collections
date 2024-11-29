import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    private static final Scanner scan = new Scanner(System.in);
    private static final ArrayList<Cliente> clientes = new ArrayList<>();
    private static long proximoId = 1;

    public static void main(String[] args) {

        int opcao = -1;
        do {
            try {
                exibirMenu();
                opcao = scan.nextInt();
                scan.nextLine(); // Limpar o teclado

                switch (opcao) {
                    case 1:
                        cadastrarCliente();
                        break;
                    case 2:
                        listarClientes();
                        break;
                    case 3:
                        atualizarDados();
                        break;
                    case 4:
                        removerCliente();
                        break;
                    case 5:
                        buscaCliente();
                        break;
                    default:
                        System.out.println("Opção Inválida, Digite novamente!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um número!");
                scan.nextLine(); //Limpar o teclado
            }
        } while (opcao != 0);
        scan.close();
    }

    public static void exibirMenu() {
        System.out.println("\n0 - Sair\n1 - Cadastrar\n2 - Listar\n3 - Atualizar\n"
                .concat("4 - Remover\n5 - Buscar"));
    }

    public static void cadastrarCliente() {
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Telefone: ");
        String telefone = scan.nextLine();

        //Passando os dados do Cliente e incrementando o Id
        clientes.add(new Cliente(proximoId++, nome, email, telefone));
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static void listarClientes() {
        //Verificar se a lista esta vazia
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado!");
        } else {
            for (Cliente listaDeClientes : clientes) {
                System.out.println(listaDeClientes);
            }
        }
    }

    /*
    Metodo utilizado para poder atualizar dados dos clientes
    , buscar cliente e remover cliente informando o id
    */
    public static Cliente buscaId(long id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public static void buscaCliente() {
        System.out.print("Digite o id do Cliente cadastrado: ");
        long id = scan.nextLong();
        scan.nextLine(); //Limpar o teclado

        Cliente cliente = buscaId(id);
        if (cliente != null) {
            System.out.println(cliente);
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    public static void atualizarDados() {
        System.out.print("Digite o id do Cliente cadastrado: ");
        long id = scan.nextLong();
        scan.nextLine(); //Limpar o teclado

        Cliente cliente = buscaId(id);
        //Caso o id informado exista
        if (cliente != null) {
            System.out.println("Digite os novos dados!");
            System.out.print("Nome: ");
            cliente.setNome(scan.nextLine());
            System.out.print("Email: ");
            cliente.setEmail(scan.nextLine());
            System.out.print("Telefone: ");
            cliente.setTelefone(scan.nextLine());
            System.out.println("\nDados do cliente atualizados!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    public static void removerCliente() {
        System.out.print("Digite o id do Cliente cadastrado: ");
        long id = scan.nextLong();
        scan.nextLine(); //Limpar o teclado

        Cliente cliente = buscaId(id);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente removido!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }
}
