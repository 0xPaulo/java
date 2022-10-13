public class Perguntas {

    // ------------FUNÇÕES---------------------------------------------
    public void menuPrincipal() {
        System.out.println();
        System.out.println("COFRINHO");
        System.out.println("---------------------------------------");
        System.out.println("1 - Adicionar Moeda");
        System.out.println("2 - Remover Moeda");
        System.out.println("3 - Listar Moedas");
        System.out.println("4 - Calcular total convertido para Real");
        System.out.println("5 - Sair");
        System.out.println("---------------------------------------");
    }

    public void menuDepositar() {
        System.out.println("-------------------------------------");
        System.out.println("Escolha a moeda que deseja depoistar:");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");
        System.out.println("-------------------------------------");
    }

    public void menuRemover() {
        System.out.println("-------------------------------------");
        System.out.println("Escolha a moeda que deseja remover:");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");
        System.out.println("-------------------------------------");
    }

    public void msgErro() {
        System.out.println();
        System.out.println("Voce digitou alguma coisa errado, tente novamente");
    }

    public void msgDefault() {
        System.out.println();
        System.out.println("Opcao invalida tente novamente");
    }
}
