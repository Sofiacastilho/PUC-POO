package Locadora2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao;
        Locadora locadora = new Locadora();
        try {
            while (true) {
                System.out.println("1 - Menu clientes");
                System.out.println("2 - Menu veiculos");
                System.out.println("3 - Menu locações");
                System.out.println("4 - Sair");
                opcao = Integer.parseInt(scan.nextLine());

                switch (opcao) {
                    case 1: {
                        menu.menuClientes();
                        //scan.nextLine();
                        break;
                    }
                    case 2: {
                        menu.menuVeiculo();

                        break;
                    }
                    case 3: {
                        menu.menuLocacoes();
                        break;
                    }
                    case 4: {
                        System.out.println("Aplicação encerrada");
                        System.exit(0);

                    }
                    default:
                        System.out.println("Opção inválida");
                }
                }

            }catch(NumberFormatException n){
                System.out.println("Digite números!");
            }
        }
    }

