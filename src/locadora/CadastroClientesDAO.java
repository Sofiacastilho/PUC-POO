package locadora;

import java.io.*;
import java.util.Scanner;

public class CadastroClientesDAO {

    public void cadastroCliente(){ //cadastra o cliente
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = obterValorString(scan);

        System.out.println("Cpf (Não digite caracteres especiais): ");
        String cpf = obterValorString(scan);
        if (cpf.length()!=11||cpf.contains("A")) {
            System.out.println("CPF inválido!");
        }else{
            System.out.println("Idade: ");
            int idade = Integer.parseInt(scan.nextLine());
            if (idade < 18) {
                System.out.println("Cadastro não autorizado!\nMotivo: Usuário menor de idade!");
            }else {
                System.out.println("Cadastro efetuado com sucesso!");
                CadastroClientes cliente = new CadastroClientes();
                cliente.setCpf(cpf);
                cliente.setNome(nome);
                cliente.setIdade(idade);
                gravar(cliente);
            }
        }
    }

    public String obterValorString(Scanner scan){

        String retorno = null;

        while (retorno == null || retorno.trim().equalsIgnoreCase("")){
            System.out.println("Digite algo válido.");
            retorno = scan.nextLine();
        }
        return retorno;
    }


    public void gravar(CadastroClientes pessoa){ //grava o cliente
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream outputStream = null;

        try{
            fileOutputStream = new FileOutputStream(pessoa.getCpf()+".txt");
            outputStream =  new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(pessoa);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }finally {
            try {
                if(outputStream !=null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public CadastroClientes obterPessoa(String cpf){ //puxa cadastro

        ObjectInputStream ois = null;
        FileInputStream fis = null;
        CadastroClientes pessoa = null;

        try {
            fis = new FileInputStream(cpf+ ".txt");
            ois = new ObjectInputStream(fis);
            pessoa = (CadastroClientes) ois.readObject();

        }catch (FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();

        }finally {

            try {
                if (fis != null) {
                    fis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return pessoa;
    }
}
