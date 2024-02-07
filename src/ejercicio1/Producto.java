package ejercicio1;

public class Producto {
    private final String descripcion;
    private final double precioBruto;

    public Producto(String descripcion, double precioBruto) {
        this.descripcion = descripcion;
        this.precioBruto = precioBruto;
    }

    public double getPrecioNeto(){
        return precioBruto;
    }
    public String toString(){
        return descripcion +": "+ String.format("%.2f",precioBruto)+ " € ";
    }
}
