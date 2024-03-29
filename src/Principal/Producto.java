package Principal;

public class Producto {
    int codigo;
    String nombre;
    int cantidad;
    double costo;

    public Producto(int codigo, String nombre, int cantidad, double costo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Principal.Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", costo=" + costo +
                '}';
    }
}