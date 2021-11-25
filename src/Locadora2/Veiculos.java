package Locadora2;

public class Veiculos {

    private float valorLocacaoDiaria;
    private String descricaoVeiculo;
    private String placaVeiculo;

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Veículo [placa=" + this.placaVeiculo + ", descrição=" + this.descricaoVeiculo + ", valor diaria=" + this.valorLocacaoDiaria + "]");
        return buffer.toString();
    }

    public float getValorLocacaoDiaria() {
        return valorLocacaoDiaria;
    }

    public void setValorLocacaoDiaria(float valorLocacaoDiaria) {
        this.valorLocacaoDiaria = valorLocacaoDiaria;
    }

    public String getDescricaoVeiculo() {
        return descricaoVeiculo;
    }

    public void setDescricaoVeiculo(String descricaoVeiculo) {
        this.descricaoVeiculo = descricaoVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }


}
