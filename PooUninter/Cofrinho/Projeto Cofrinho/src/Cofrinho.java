import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    public void adicionar(Moeda i) {
        listaMoedas.add(i);
    }

    public void remover(Moeda i) {
        listaMoedas.remove(i);
    }

    public boolean verificaRemover() {
        listaMoedas.isEmpty();
        return true;
    }

    public void verificaVazio() {
        if (listaMoedas.isEmpty())
            System.out.println("Sua conta esta vazia");
    }

    public void listagemMoedas() {
        if (listaMoedas.isEmpty())
            System.out.println("Sua conta esta vazia");
        for (Moeda i : listaMoedas) {
            i.info();
        }
    }

    public void totalConvertido() {
        double total = 0;
        if (listaMoedas.isEmpty())
        System.out.println("Sua conta esta vazia");
        for (Moeda i : listaMoedas) {
            total += i.converter();

        }

        System.out.println("Todo seu dinheiro convertido para reais: " + total);

    }

}
