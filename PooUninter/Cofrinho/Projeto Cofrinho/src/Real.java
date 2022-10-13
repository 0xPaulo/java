public class Real extends Moeda {

    // --------CONSTRUTOR---------------
    public Real(double valor) {
        super(valor);
    }

    // --------FUNÇÕES------------------
    public double converter() {
        double convertido = valor * 1;
        return convertido;
    }

    void info() {
        System.out.println("Real: " + valor);
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
        Real other = (Real) obj;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        return true;
    }
}
