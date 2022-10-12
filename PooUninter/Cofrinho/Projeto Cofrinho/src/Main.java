import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int erroOcorreu;
        double valorMoedaDeposito;
        double valorMoedaRetirada;
        double tipoMoeda;
        int escolha;
        erroOcorreu = 0;
        Scanner input = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        Perguntas perguntas = new Perguntas();

        while (erroOcorreu == 0) {
            try {
                perguntas.menuPrincipal();

                escolha = input.nextInt();

                while (escolha != 0) {
                    switch (escolha) {

                        case 1:
                            tipoMoeda = 0;
                            while (tipoMoeda > 3 || tipoMoeda <= 0) {
                                perguntas.menuDepositar();
                                tipoMoeda = input.nextInt();
                                System.out.println("----------");
                            }
                            System.out.println("Qual o valor que deseja depositar? ");
                            valorMoedaDeposito = input.nextDouble();
                            Moeda moeda = null;
                            if (tipoMoeda == 1) {
                                moeda = new Real(valorMoedaDeposito);
                            } else if (tipoMoeda == 2) {
                                moeda = new Dolar(valorMoedaDeposito);
                            } else if (tipoMoeda == 3) {
                                moeda = new Euro(valorMoedaDeposito);
                            }
                            cofrinho.adicionar(moeda);
                            System.out.println("Depositado com sucesso: " + valorMoedaDeposito);
                            break;

                        case 2:
                            cofrinho.verificaVazio();
                            tipoMoeda = 0;
                            while (tipoMoeda > 3 || tipoMoeda <= 0) {
                                perguntas.menuRemover();
                                tipoMoeda = input.nextInt();
                                System.out.println();
                            }
                            System.out.println("Qual o valor que deseja Retirar? ");
                            valorMoedaRetirada = input.nextDouble();

                            moeda = null;
                            if (tipoMoeda == 1) {
                                moeda = new Real(valorMoedaRetirada);
                            } else if (tipoMoeda == 2) {
                                moeda = new Dolar(valorMoedaRetirada);
                            } else if (tipoMoeda == 3) {
                                moeda = new Euro(valorMoedaRetirada);
                            }
                            cofrinho.remover(moeda);
                            break;

                        case 3:
                            cofrinho.listagemMoedas();
                            break;

                        case 4:
                            cofrinho.totalConvertido();
                            break;

                        case 5:
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Opcao invalida tente novamente");
                            System.out.println();
                    }

                    perguntas.menuPrincipal();
                    escolha = input.nextInt();
                }
            } catch (Exception e) {
                System.out.println("Voce digitou alguma coisa errado, tente novamente");
                System.out.println();
                input.nextLine();
                erroOcorreu = 0;
            }
        }
        input.close();
    }

}