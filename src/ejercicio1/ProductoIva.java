package ejercicio1;

public class ProductoIva extends Producto{
    private final double iva;

    public ProductoIva(String descripcion, double precioBruto, double iva) {
        super(descripcion, precioBruto);
        this.iva = iva;
    }

    @Override
    public double getPrecioNeto() {
        return super.getPrecioNeto() + (super.getPrecioNeto() *(iva/100));
    }

    @Override
    public String toString() {
        return super.toString()+ "+ "+ String.format("%.1f",iva)+"% = "+ getPrecioNeto() +"€" ;
    }
}
