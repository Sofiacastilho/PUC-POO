package Locadora2;

public class LocacaoVeiculos {

    private Cliente cliente;
    private Veiculos veiculos;
    private Integer numeroDiasLocacao;
    private String dataLocacao;
    private Boolean seguro;
    private int valorDesconto;
    private Carro carro;
    private Moto moto;

    @Override
    public String toString() { //lista a locação
        StringBuffer buffer = new StringBuffer();
        buffer.append("Locação [Cliente=" + this.cliente.getNome() +
                ", veiculo=" + this.veiculos.getPlacaVeiculo() + "," +
                " data=" + this.dataLocacao + ", dias locados=" + this.numeroDiasLocacao + "]");
        return buffer.toString();
    }


    public double calcularLocacaoCarro() {
        float valor = veiculos.getValorLocacaoDiaria();
        double valorLocacao;
        if (seguro == true) {
            valorLocacao = (valor * numeroDiasLocacao) + calcularSeguroCarro();
            System.out.println(valorLocacao);
        } else {
            valorLocacao = (valor * numeroDiasLocacao);
            System.out.println(valorLocacao);
        }
        return valorLocacao;
    }

    public double calcularSeguroCarro() {
        float valor = veiculos.getValorLocacaoDiaria();
        double valorSeguro = (0.05f * valor * (1 + carro.getQtdPassageiros() / 20));
        //System.out.println(valorSeguro);
        return valorSeguro;
    }


    public double calcularLocacaoMoto(){
        float valor = veiculos.getValorLocacaoDiaria();
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

    public Float calcularSeguroMoto() {
        float valor = veiculos.getValorLocacaoDiaria();
        float valorSeguro = (0.09f * valor);
        //System.out.println(valorSeguro);
        return valorSeguro;
    }


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
