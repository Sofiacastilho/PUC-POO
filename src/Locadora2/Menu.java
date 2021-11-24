package Locadora2;

import java.util.Scanner;

public class Menu {

    public void menuClientes() {

        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Sair");
            System.out.println("----------------------------------");
            int opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1: {
                    //metodos

                    break;
                }
                case 2: {
                    //outros metodos

                    break;
                }
                case 3: {
                    //volta

                    break;
                }
            }
        }
    }

    public void menuVeiculo () {
        System.out.println("1 - Cadastrar veiculos");
        System.out.println("2 - Listar veiculos");
        System.out.println("3 - Sair");
        System.out.println("----------------------------------");
    }

    public void menuLocacoes () {
        System.out.println("1 - Locação de veiculos");
        System.out.println("2 - Listar locações");
        System.out.println("3 - Listar veículos locados");
        System.out.println("4 - Sair");
        System.out.println("----------------------------------");
    }

    public void menuPrincipal () {
        System.out.println("1 - Menu clientes");
        System.out.println("2 - Menu veiculos");
        System.out.println("3 - Menu locações");
        System.out.println("4 - Sair");
        System.out.println("----------------------------------");
    }

}
