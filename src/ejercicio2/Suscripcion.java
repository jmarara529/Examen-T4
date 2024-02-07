package ejercicio2;

public class Suscripcion implements Comprable{
    private String descripcion;
    private int existencias;
    private double precio;

    public Suscripcion(String descripcion, int existencias, double precio) {
        this.descripcion = descripcion;
        this.existencias = existencias;
        this.precio = precio;
    }

    @Override
    public boolean hayUnidades(int cantidiad) {
        return Comprable.super.hayUnidades(cantidiad);
    }

    @Override
    public void cogerUnidad() throws Exception {
        if (!(existencias<1)){
            existencias--;
        } else {
            throw new Exception("NoHayExsistenciasException");
        }
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }
}
