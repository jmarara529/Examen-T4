package ejercicio2;

public interface Comprable {
    default boolean hayUnidades(int cantidiad){
        return true;
    }
    void cogerUnidad() throws Exception {

    }
    double getPrecioVenta(){
        return 0;
    }
}
