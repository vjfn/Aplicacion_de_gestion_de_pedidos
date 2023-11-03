package clase;

import java.util.ArrayList;

public class Pedido {

    private Integer id;
    private String codigo_pedido;
    private String fecha;
    private Integer usuarioId;
    private Integer total;
    private ArrayList<Item> items = new ArrayList<>();

    public Pedido(Integer id, String codigo_pedido, String fecha, Integer usuarioId, Integer total, ArrayList<Item> items) {
        this.id = id;
        this.codigo_pedido = codigo_pedido;
        this.fecha = fecha;
        this.usuarioId = usuarioId;
        this.total = total;
        this.items = items;
    }

    public Pedido() {
    }

}
