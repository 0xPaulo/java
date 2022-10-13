import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        double valorMoedaDeposito;
        double valorMoedaRetirada;
        double tipoMoeda;
        int escolha;
        String nome;
        Scanner input = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        Perguntas perguntas = new Perguntas();
        boolean continua = true;

        do {
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
                                nome = "Real";
                                System.out.println();
                                System.out.println("Foi depositado o Valor: " + nome + ": " + valorMoedaDeposito);
                            } else if (tipoMoeda == 2) {
                                moeda = new Dolar(valorMoedaDeposito);
                                nome = "Dolar";
                                System.out.println();
                                System.out.println("Foi depositado o Valor: " + nome + ": " + valorMoedaDeposito);
                            } else if (tipoMoeda == 3) {
                                moeda = new Euro(valorMoedaDeposito);
                                nome = "Euro";
                                System.out.println();
                                System.out.println("Foi depositado o Valor: " + nome + ": " + valorMoedaDeposito);
                            }
                            cofrinho.adicionar(moeda);

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
                                nome = "Real";
                                System.out.println();
                                System.out.println("Foi retirado: " + nome + ": " + valorMoedaRetirada);
                            } else if (tipoMoeda == 2) {
                                moeda = new Dolar(valorMoedaRetirada);
                                nome = "Dolar";
                                System.out.println();
                                System.out.println("Foi retirado: " + nome + ": " + valorMoedaRetirada);
                            } else if (tipoMoeda == 3) {
                                moeda = new Euro(valorMoedaRetirada);
                                nome = "Euro";
                                System.out.println();
                                System.out.println("Foi retirado: " + nome + ": " + valorMoedaRetirada);
                            }
                            cofrinho.remover(moeda);

                            break;

                        case 3:
                            System.out.println();
                            cofrinho.listagemMoedas();
                            break;

                        case 4:
                            System.out.println();
                            cofrinho.totalConvertido();
                            break;

                        case 5:
                            System.exit(0);
                            break;

                        default:
                            perguntas.msgDefault();
                    }
                    perguntas.menuPrincipal();
                    escolha = input.nextInt();
                }
            } catch (Exception erro) {
                perguntas.msgErro();
                input.nextLine();

                continua = true;
            }
        } while (continua);

        input.close();
    }

}
