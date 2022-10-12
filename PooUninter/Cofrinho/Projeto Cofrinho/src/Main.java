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

        while (erroOcorreu == 0) {
            try {
                System.out.println("Menu");
                System.out.println("----------");
                System.out.println("1 - Adicionar");
                System.out.println("2 - Remover");
                System.out.println("3 - Listar");
                System.out.println("4 - Converter tudo para Real");
                System.out.println("0 - Exit");
                System.out.println("----------");
                

                escolha = input.nextInt();

                while (escolha != 0) {
                    switch (escolha) {

                        case 1:
                            tipoMoeda = 0;
                            while (tipoMoeda > 3 || tipoMoeda <= 0) {
                                System.out.println("----------");
                                System.out.println("Escolha a moeda que deseja depoistar:");
                                System.out.println("1 - Real");
                                System.out.println("2 - Dolar");
                                System.out.println("3 - Euro");
                                System.out.println("----------");
                                tipoMoeda = input.nextInt();
                                System.out.println();
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
                            break;

                        case 2:
                        cofrinho.verificaVazio();
                            tipoMoeda = 0;
                            while (tipoMoeda > 3 || tipoMoeda <= 0) {
                                System.out.println("Escolha a moeda que deseja remover:");
                                System.out.println("1 - Real");
                                System.out.println("2 - Dolar");
                                System.out.println("3 - Euro");
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

                        default:
                            System.out.println("Opcao invalida tente novamente");
                            System.out.println();
                    }

                    System.out.println();
                    System.out.println("Menu");
                    System.out.println("----------");
                    System.out.println("1 - Adicionar");
                    System.out.println("2 - Remover");
                    System.out.println("3 - Listar");
                    System.out.println("4 - Converter tudo para Real");
                    System.out.println("0 - Exit");
                    System.out.println("----------");
                    escolha = input.nextInt();
                }
            } catch (Exception e) {
                System.out.println("Voce digitou alguma coisa errado, tente novamente");
                input.nextLine();
                erroOcorreu = 0;
            }
        }
        input.close();
    }

}