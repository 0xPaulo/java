public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor);
    }

    public double converter() {
        double convertido = valor * 5.05;
        return convertido;
    }

    void info() {
        System.out.println("Euro: " + valor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Euro other = (Euro) obj;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        return true;
    }
}