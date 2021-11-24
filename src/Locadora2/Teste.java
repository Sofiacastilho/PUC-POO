package Locadora2;

import java.util.Scanner;

public class Teste {
    //add try catch e default no switch

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menu = 100;

        while(menu!= 4) {
            System.out.println("---Menu---");

            System.out.println("1 - Menu clientes");
            System.out.println("2 - Menu veiculos");
            System.out.println("3 - Menu locações");
            System.out.println("4 - Sair");

            menu = sc.nextInt();

            switch(menu) {
                case 1:{
                    menuClientes();
                    break;
                }
                case 2:{
                    menuVeiculos();
                    break;
                }
                case 3:{
                    menuLocacao();
                    break;
                }
                case 4:{

                }
            }
            System.out.println("");
        }
    }

    public static void menuClientes() {

        Scanner sc = new Scanner(System.in);

        int menu = 100;

        while(menu!= 3) {
            System.out.println("-- Menu Clientes---");

            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Voltar");
            System.out.println("----------------------------------");

            menu = sc.nextInt();

            switch(menu) {
                case 1:{

                    break;
                }
                case 2:{

                    break;
                }
                case 3:{

                    break;
                }



            }
            System.out.println("");
        }
    }


    public static void menuVeiculos() {

        Scanner sc = new Scanner(System.in);

        int menu = 100;

        while(menu!= 3) {
            System.out.println("--- Menu veiculos ---");

            System.out.println("1 - Cadastrar veiculos");
            System.out.println("2 - Listar veiculos");
            System.out.println("3 - Voltar");
            System.out.println("----------------------------------");


            menu = sc.nextInt();

            switch(menu) {
                case 1:{

                    break;
                }
                case 2:{

                    break;
                }
                case 3:{

                    break;
                }



            }
            System.out.println("");
        }
    }


    public static void menuLocacao() {

        Scanner sc = new Scanner(System.in);

        int menu = 100;

        while(menu!= 4) {
            System.out.println("--- Menu Locações ---");

            System.out.println("1 - Locação de veiculos");
            System.out.println("2 - Listar locações");
            System.out.println("3 - Listar veículos locados");
            System.out.println("4 - Voltar");
            System.out.println("----------------------------------");


            menu = sc.nextInt();

            switch(menu) {
                case 1:{

                    break;
                }
                case 2:{

                    break;
                }
                case 3:{

                    break;
                }
                case 4:{

                }


            }
            System.out.println("");
        }
    }


}
