package Locadora2;

import java.util.Scanner;

public class Menu {

    public void menuClientes() {

        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Voltar");
            System.out.println("----------------------------------");
            int opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1: {// cadastra cliente


                    break;
                }
                case 2: { //listar cliente


                    break;
                }
                case 3: {//volta


                    break;
                }
            }
        }
    }

    public void menuVeiculo () {
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("1 - Cadastrar veiculos");
            System.out.println("2 - Listar veiculos");
            System.out.println("3 - Voltar");
            System.out.println("----------------------------------");
            int opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1: {// cadastra veiculo


                    break;
                }
                case 2: { //listar veiculo


                    break;
                }
                case 3: {//volta


                    break;
                }
            }
        }
    }

    public void menuLocacoes () {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1 - Locação de veiculos");
            System.out.println("2 - Listar locações");
            System.out.println("3 - Listar veículos locados");
            System.out.println("4 - Voltar");
            System.out.println("----------------------------------");

            int opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1: {// lista veiculos


                    break;
                }
                case 2: { //listar locações


                    break;
                }
                case 3: {//lista veiculos locados


                    break;
                }
                case 4: {//volta


                    break;
                }
            }
        }
    }

    public void menuPrincipal () {
        System.out.println("1 - Menu clientes");
        System.out.println("2 - Menu veiculos");
        System.out.println("3 - Menu locações");
        System.out.println("4 - Sair");
        System.out.println("----------------------------------");
    }

}
