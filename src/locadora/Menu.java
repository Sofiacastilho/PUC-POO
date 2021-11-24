package locadora;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    CadastroVeiculos cadastroV = new CadastroVeiculos();
    CadastroClientes clientes = new CadastroClientes();
    CadastroClientesDAO cadastroC = new CadastroClientesDAO();
    LocacaoVeiculos locacaoVeiculos = new LocacaoVeiculos();
    private int opcao = 0;

    public void menu() {
        try {
            System.out.println("Escolha uma das opções:\n" +
                    "1) Cadastro de veículos (carros e motos)\n" +
                    "2) Cadastro de clientes\n" +
                    "3) Locação de veículos\n" +
                    "4) Listagem de veículos cadastrados\n" +
                    "5) Listagem de clientes\n" +
                    "6) Listagem das locações\n" +
                    "7) Listagem de veículos disponíveis\n");
            opcao = Integer.parseInt(scan.nextLine());
            switch (opcao) {
                case 1: {
                    System.out.println("Cadastrar Veículos: ");
                    cadastroV.cadastroVeiculos();
                    break;
                }
                case 2: {
                    System.out.println("Cadastrar Clientes: ");
                    cadastroC.cadastroCliente();
                    break;
                }
                case 3: {
                    System.out.println("Locar veículos: ");
                    locacaoVeiculos.calcularLocacaoCarro();
                    break;
                }
                case 4: {
                    System.out.println("Listagem de veículos cadastrados: ");

                    break;
                }
                case 5: {
                    System.out.println("Listagem de clientes:");
                    cadastroC.obterPessoa(clientes.getCpf());
                    break;
                }
                case 6: {
                    System.out.println("Listagem de locações:");

                    break;
                }
                case 7: {
                    System.out.println("Listagem de veículos disponiveis:");

                    break;
                }
                default:
                    System.out.println("Opção inválida");
            }
        }catch(NumberFormatException n) {
            System.out.println("Digite números!");
        }
    }
}