package Locadora2;

import java.io.*;
import java.util.Scanner;

public class Cliente implements Serializable {

    private String nome;
    private String cpf;
    private int idade;

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Cliente [nome=" + this.nome + ", cpf=" + this.cpf + ", idade=" + this.idade + "]");
        return buffer.toString();
    }

    public Cliente(){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }


    public String obterValorString(Scanner scan){

        String retorno = null;

        while (retorno == null || retorno.trim().equalsIgnoreCase("")){
            System.out.println("Digite algo válido.");
            retorno = scan.nextLine();
        }
        return retorno;
    }




    public static void gravaPessoa(String filename) {
        ObjectOutputStream outputStream = null;

        try {
            outputStream = new ObjectOutputStream (new FileOutputStream(filename));
            Locadora locadora = new Locadora();
            //cliente.validaCliente();

            outputStream.writeObject(locadora.getListaCliente()); //só escreve porque Person é seralizável

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally { //Close the ObjectOutputStream
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


    public void lePessoa(String filename) {
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream (new FileInputStream(filename));
            Object obj = null;
            while ((obj = inputStream.readObject()) != null) {
                if (obj instanceof Locadora) // read a generic object obj
                    System.out.println(((Locadora)obj).toString()); // cast to Cliente
            }
        } catch (EOFException ex) { // when EOF is reached
            System.out.println("End of file reached.");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally { //Close the ObjectInputStream
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }






    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
