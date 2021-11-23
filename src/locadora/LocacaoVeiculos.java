package locadora;

import java.util.Scanner;

public class LocacaoVeiculos {
    CadastroClientes cliente;
    private Integer numeroDiasLocacao;
    private String dataLocacao;
    private Boolean seguro;
    private int valorDesconto;
    CadastroVeiculos veiculo;

    public double calcularLocacaoCarro(){
        float valor = veiculo.getValorLocacaoDiaria();
        double valorLocacao;
        if (seguro == true){
            valorLocacao = (valor * numeroDiasLocacao) + calcularSeguroCarro();
            System.out.println(valorLocacao);
        }
        else {
            valorLocacao = (valor * numeroDiasLocacao);
            System.out.println(valorLocacao);
        }
        return valorLocacao;
    }

    public double calcularLocacaoMoto(){
        float valor = veiculo.getValorLocacaoDiaria();
        double valorLocacao;
        if ( seguro == true){
            valorLocacao = (valor * numeroDiasLocacao) + calcularSeguroMoto();
            System.out.println(valorLocacao);
        }
        else {
            valorLocacao = (valor * numeroDiasLocacao);
            System.out.println(valorLocacao);
        }
        return valorLocacao;
    }

    public double calcularSeguroCarro() {
        float valor = veiculo.getValorLocacaoDiaria();
        double valorSeguro = (0.05f * valor * (1 + 4/20));
        //System.out.println(valorSeguro);
        return valorSeguro;
    }

    public Float calcularSeguroMoto() {
        float valor = veiculo.getValorLocacaoDiaria();
        float valorSeguro = (0.09f * valor);
        //System.out.println(valorSeguro);
        return valorSeguro;
    }

}