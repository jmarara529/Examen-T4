package ejercicio1;

public final class ProductoGeneral extends ProductoIva{
    public ProductoGeneral(String descripcion, double precioBruto) {
        super(descripcion, precioBruto, 21);
    }
}
