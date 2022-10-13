public class Dolar extends Moeda {

    // --------CONSTRUTOR---------------
    public Dolar(double valor) {
        super(valor);
    }

    // --------FUNÇÕES------------------
    public double converter() {
        double convertido = valor * 5.20;
        return convertido;
    }

    void info() {
        System.out.println("Dolar: " + valor);
    }

    // -------VALIDAÇÃO------------------
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dolar other = (Dolar) obj;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        return true;
    }

}
