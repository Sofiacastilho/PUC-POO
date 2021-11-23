package locadora;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    CadastroVeiculos cadastroV = new CadastroVeiculos();
    CadastroClientes clientes = new CadastroClientes();
    CadastroClientesDAO cadastroC = new CadastroClientesDAO();
    LocacaoVeiculos a = new LocacaoVeiculos();
    private int opcao = 0;

    public void menu() {
        try {
            System.out.println("Escolha uma das opções:\n1)Cadastrar Veículos\n2)Cadastrar Clientes\n3)Locação Veículos");
            opcao = Integer.parseInt(scan.nextLine());
            switch (opcao) {
                case 1: {
                    System.out.println("Cadastrar Veículos: ");
                    this.cadastroV.cadastroVeiculos();
                    break;
                }
                case 2: {
                    System.out.println("Cadastrar Clientes: ");
                    cadastroC.cadastroCliente();
                    break;
                }
                case 3: {
                    System.out.println("Locação Veículos: ");
                    this.a.calcularLocacaoCarro();
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