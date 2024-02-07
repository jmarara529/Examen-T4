package ejercicio1;

public class ProductoMain {
    public static void main(String[] args) {
        Producto p = new Producto("teclado", 8.9);
        System.out.println(p);

        ProductoIva p2 = new ProductoIva("teclado", 10, 10);
        System.out.println(p2);

        ProductoGeneral pg = new ProductoGeneral("teclado", 20);
        System.out.println(pg);

        ProductoReducido pr = new ProductoReducido("teclado", 15);
        System.out.println(pr);
    }
}
