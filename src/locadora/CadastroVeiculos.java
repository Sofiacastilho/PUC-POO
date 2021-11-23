package locadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroVeiculos {

    private int tipoVeiculo;
    private float valorLocacaoDiaria;
    private String descricaoVeiculo;
    private String placaVeiculo;
    private int qtdPassageiros;
    private Boolean partidaEletricaBoolean;
    private int partidaEletrica;

    public void cadastroVeiculos() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Qual o tipo do veiculo?\n1)Carro\n2)Moto");
            tipoVeiculo = scan.nextInt();
            if (tipoVeiculo == 1) {
                System.out.println("Digite o valor de locação referente a um dia: ");
                valorLocacaoDiaria = scan.nextFloat();

                System.out.println("Digite a descrição do veículo: ");
                descricaoVeiculo = scan.nextLine();

                scan.next();

                System.out.println("Digite a placa do veículo: ");
                placaVeiculo = scan.nextLine();

                scan.next();

                System.out.println("Digite a quantidade de passageiros: ");
                qtdPassageiros = scan.nextInt();
            }else if(tipoVeiculo == 2) {
                System.out.println("Digite o valor de locação referente a um dia: ");
                valorLocacaoDiaria = scan.nextFloat();

                System.out.println("Digite a descrição do veículo: ");
                descricaoVeiculo = scan.nextLine();

                scan.next();

                System.out.println("Digite a placa do veículo: ");
                placaVeiculo = scan.nextLine();

                scan.next();

                System.out.println("Há partida elétrica?\n1)Sim\n2)Não");
                partidaEletrica = scan.nextInt();
                switch(partidaEletrica) {
                    case 1:{
                        partidaEletricaBoolean = true;
                        System.out.println("True");
                        break;
                    }
                    case 2:{
                        partidaEletricaBoolean = false;
                        System.out.println("False");
                        break;
                    }
                    default:
                        System.out.println("Digite uma opção válida!");
                }
            }else {
                System.out.println("Dígito inválido!");
            }
        }catch(InputMismatchException n) {
            System.out.println("Caracteres inválidos!");
        }

    }
    public float getValorLocacaoDiaria() {
        return valorLocacaoDiaria;
    }
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }
}