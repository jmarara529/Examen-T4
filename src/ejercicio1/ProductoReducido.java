package ejercicio1;

public final class ProductoReducido extends ProductoIva{
    public ProductoReducido(String descripcion, double precioBruto) {
        super(descripcion, precioBruto, 5);
    }
}
