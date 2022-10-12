public class Real extends Moeda {

    public Real(double valor) {
        super(valor);
    }

    public double converter() {
        double convertido = valor * 1;
        return convertido;
    }

    public void info() {
        System.out.println("Real: " + valor);
    }

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
