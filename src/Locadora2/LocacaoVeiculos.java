package Locadora2;

import java.util.ArrayList;
import java.util.Scanner;

public class LocacaoVeiculos {

    private Cliente cliente;
    private Veiculos veiculos;
    private Integer numeroDiasLocacao;
    private String dataLocacao;
    private boolean seguro;
    private int valorDesconto;
    private double valorLocacao = 0;
    private String placa;
    private String cpf;

    Locadora locadora = new Locadora();

    @Override
    public String toString() { //lista a locação
        StringBuffer buffer = new StringBuffer();
        buffer.append("Locação [Cliente=" + this.cliente.getNome() +
                ", veiculo=" + this.veiculos.getPlacaVeiculo() + "," +
                " data=" + this.dataLocacao + ", dias locados=" + this.numeroDiasLocacao + "]");
        return buffer.toString();
    }

    public void locaVeiculo(){
        Scanner scan = new Scanner(System.in);
        /*Na locação de um veículo deve ser informado:
    O cliente que está locando o veículo
    O número de dias da locação
    A data da locação
    Se a locação é com seguro ou não.
    Valor do desconto. */

        System.out.println("Informe o cpf");
        cpf = scan.nextLine();
        Cliente clienteAchado = null;
        for(Cliente clienteBusca : locadora.getListaCliente()){
            if(clienteBusca.getCpf() == cpf){
                clienteAchado = clienteBusca;

            }
        }
        if(clienteAchado!=null){
            clienteAchado.getCpf();
        }else{
            System.out.println("Cliente não encontrado para " + cpf);
        }

    }

        //-----carro--------

    public double calcularLocacaoCarro() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de locação: ");
        double valorLocacao = scan.nextDouble();
        System.out.println("Digite quantos dias será locado: ");
        int numeroDiasLocacao = scan.nextInt();
        System.out.println("Deseja seguro?\n1 - SIM\n2 - não ");
        int opcao = scan.nextInt();
        
        //boolean seguro;
        switch (opcao){
            case 1:{
                seguro = true;

                System.out.println("Digite a quantidade de passageiros: ");
                int qtdPassageiros = scan.nextInt();
                double calcularSeguroCarro = (0.05f * valorLocacao * (1 + qtdPassageiros / 20));

                valorLocacao = (valorLocacao * numeroDiasLocacao) + (calcularSeguroCarro * numeroDiasLocacao);
                System.out.println(valorLocacao);
                break;
               
            } case 2: {
                seguro = false;
                valorLocacao = (valorLocacao * numeroDiasLocacao);
                System.out.println(valorLocacao);
                break;
            }
            default:
                System.out.println("Escolha algo valido.");
        }

        
        return valorLocacao;
    }

    public double calcularSeguroCarro() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de locação: ");
        double valorLocacao = scan.nextDouble();
        System.out.println("Digite a quantidade de passageiros: ");
        int qtdPassageiros = scan.nextInt();
        double valorSeguro = (0.05f * valorLocacao * (1 + qtdPassageiros / 20));
        //System.out.println(valorSeguro);
        return valorSeguro;
    }

        //-----moto--------

    public double calcularLocacaoMoto(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos dias será locado: ");
        int numeroDiasLocacao = scan.nextInt();
        System.out.println("Deseja seguro?\n1 - SIM\n2 - não ");
        int opcao = scan.nextInt();

        switch (opcao){
            case 1:{
                seguro = true;

                System.out.println("Digite o valor de locação: ");
                double valorLocacao = scan.nextDouble();
                double calcularSeguroMoto = (0.09f * valorLocacao);


                valorLocacao = (valorLocacao * numeroDiasLocacao) + (numeroDiasLocacao * calcularSeguroMoto);
                System.out.println(valorLocacao);
                break;

            } case 2: {
                seguro = false;

                System.out.println("Digite o valor de locação: ");
                double valorLocacao = scan.nextDouble();
                valorLocacao = (valorLocacao * numeroDiasLocacao);
                System.out.println(valorLocacao);
                break;
            }
            default:
                System.out.println("Escolha algo valido.");
        }
        return valorLocacao;
    }


    //-----get e set--------

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculos getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculos veiculos) {
        this.veiculos = veiculos;
    }

    public Integer getNumeroDiasLocacao() {
        return numeroDiasLocacao;
    }

    public void setNumeroDiasLocacao(Integer numeroDiasLocacao) {
        this.numeroDiasLocacao = numeroDiasLocacao;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Boolean getSeguro() {
        return seguro;
    }

    public void setSeguro(Boolean seguro) {
        this.seguro = seguro;
    }

    public int getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(int valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

}
