package Locadora2;

import java.util.ArrayList;

public class Locadora {


    private ArrayList<Cliente> listaCliente = new ArrayList<>();
    private ArrayList<Veiculos> listaVeiculos = new ArrayList<>();
    private ArrayList<LocacaoVeiculos> listaLocacaoVeiculos = new ArrayList<>();


    public void cadastraCliente(Cliente cliente) {
        getListaCliente().add(cliente);
        System.out.println("Cadastro realizado com sucesso");
    }


    public void cadastraVeiculo(Veiculos veiculos) {
        getListaVeiculos().add(veiculos);
        System.out.println("Contrato cadastrado com sucesso");
    }

    public void listarClientes() {
        for(Cliente cliente: getListaCliente()) {
            System.out.println(cliente);
        }
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

