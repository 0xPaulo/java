import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // -------------VARIÁVEIS------------------------

        double valorMoedaDeposito;
        double valorMoedaRetirada;
        double tipoMoeda;
        int escolha;
        String nome;
        boolean continua = true;

        // ----------CRIAÇÃO-DAS-INSTANCIAS-------------

        Scanner input = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        Perguntas perguntas = new Perguntas();

        // ---------INICIO-LOOP-MENU-PRINCIPAL----------

        do {
            try {
                perguntas.menuPrincipal();
                escolha = input.nextInt();

                while (escolha != 0) {
                    switch (escolha) {

                        // ----------------------ESCOLHA-1---------------------------------
                        case 1:
                            tipoMoeda = 0;
                            while (tipoMoeda > 3 || tipoMoeda <= 0) {
                                perguntas.menuDepositar();
                                tipoMoeda = input.nextInt();
                            }
                            System.out.println();
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

                        // -----------------------ESCOLHA-2------------------------------------------
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

                        // ----------------------ESCOLHA-3------------------------------------------
                        case 3:
                            System.out.println();
                            cofrinho.listagemMoedas();
                            break;

                        // ----------------------ESCOLHA-4-----------------------------------
                        case 4:
                            System.out.println();
                            cofrinho.totalConvertido();
                            break;

                        // ----------------------ESCOLHA-5----------------------------
                        case 5:
                            System.exit(0);
                            break;

                        default:
                            perguntas.msgDefault();
                    }
                    // ------------------------FIM-SWITCH-------------------
                    perguntas.menuPrincipal();
                    escolha = input.nextInt();
                }

                // ----------------------TRATANDO-ERROS---------
            } catch (Exception erro) {
                perguntas.msgErro();
                input.nextLine();
                continua = true;
            }
        } while (continua);

        // -----------------FIM-LOOP-MENU-PRINCIPAL-----
        input.close();
    }

}
