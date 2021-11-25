package Locadora2;

import java.util.ArrayList;
import java.util.Scanner;

public class Locadora {

    private ArrayList<Cliente> listaCliente = new ArrayList<>();
    private ArrayList<Veiculos> listaVeiculos = new ArrayList<>();
    private ArrayList<LocacaoVeiculos> listaLocacaoVeiculos = new ArrayList<>();

    public void cadastraCliente(Cliente cliente) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = scan.nextLine();

        System.out.println("Informe o cpf: ");
        String cpf = scan.nextLine();

        System.out.println("Informe a idade: ");
        int idade = Integer.parseInt(scan.nextLine());


        //Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setIdade(idade);

        getListaCliente().add(cliente);
    }


    public void cadastraVeiculo(Veiculos veiculos) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a placa: ");
        String placa = scan.nextLine();

        System.out.println("Informe a descrição: ");
        String descricao = scan.nextLine();

        System.out.println("Informe o valor: ");
        float valor = Float.parseFloat(scan.nextLine());

        System.out.println("Informe o tipo de veiculo: \n1 - Carro\n2 - Moto");
        int tipo = scan.nextInt();

        if(tipo == 1){
            Carro carro = new Carro();
            System.out.println("Informe a quantidade de passageiros");
            int qtdPassageiros = scan.nextInt();
            carro.setQtdPassageiros(qtdPassageiros);

        }else if(tipo == 2){
            Moto moto = new Moto();
            System.out.println("Informe se há partida elétrica\n1 - Há\n2 - Não há");
            int partidaEletrica = scan.nextInt();

            switch (partidaEletrica){
                case 1:{
                    boolean partidaEletricaBoolean = true;
                    moto.setPartidaEletricaBoolean(partidaEletricaBoolean);
                    System.out.println("Há");
                    break;
                }
                case 2:{
                    boolean partidaEletricaBoolean = false;
                    moto.setPartidaEletricaBoolean(partidaEletricaBoolean);
                    System.out.println("Não há");
                    break;
                }
                default:
                    System.out.println("opção invalida");
            }
        }
        veiculos.setPlacaVeiculo(placa);
        veiculos.setDescricaoVeiculo(descricao);
        veiculos.setValorLocacaoDiaria(valor);

        getListaVeiculos().add(veiculos);
    }







    public void listarClientes() {

        for(Cliente cliente: getListaCliente()) {
            System.out.println(cliente);
        }
        Cliente cliente = new Cliente();
        cliente.lePessoa("listaClientes.txt");
    }

    public void listarVeiculos() {
        for(Veiculos veiculos: getListaVeiculos()) {
            System.out.println(veiculos);
        }
    }

    public void listarLocacoes() {
        for(LocacaoVeiculos locacaoVeiculos: getLocacaoVeiculos()) {
            System.out.println(locacaoVeiculos);
        }
    }


    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public ArrayList<Veiculos> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(ArrayList<Veiculos> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public ArrayList<LocacaoVeiculos> getLocacaoVeiculos() {
        return listaLocacaoVeiculos;
    }

    public void setLocacaoVeiculos(ArrayList<LocacaoVeiculos> locacaoVeiculos) {
        this.listaLocacaoVeiculos = locacaoVeiculos;
    }
}

