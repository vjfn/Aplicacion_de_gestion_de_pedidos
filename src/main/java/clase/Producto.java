package clase;

public class Producto {

    private Integer id;
    private String nombre;
    private Double precio;
    private Integer cantidad_disponible;

    public Producto(Integer id, String nombre, Double precio, Integer cantidad_disponible) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad_disponible = cantidad_disponible;
    }

    public Producto() {
    }
}
