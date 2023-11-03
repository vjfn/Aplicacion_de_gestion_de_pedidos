package clase;

public class Item {

    private Integer id;
    private String codigo_pedido;
    private Integer cantidad;
    private Producto producto;


    public Item(Integer id, String codigo_pedido, Integer cantidad, Producto producto) {
        this.id = id;
        this.codigo_pedido = codigo_pedido;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Item(){
    }

}
