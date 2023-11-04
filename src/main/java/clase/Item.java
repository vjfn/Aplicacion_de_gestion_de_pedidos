package clase;

public class Item {

    private Integer id;
    private String pedidoId;
    private Integer qty;
    private Producto productoId;


    public Item(Integer id, String pedidoId, Integer qty, Producto productoId) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.qty = qty;
        this.productoId = productoId;
    }

    public Item(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPedido_id() {
        return pedidoId;
    }

    public void setPedidoId(String pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Producto getProducto_id() {
        return Item.this.productoId;
    }

    public void setProducto_id(Producto productoId) {
        this.productoId = Item.this.productoId;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", pedidoId='" + pedidoId + '\'' +
                ", qty=" + qty +
                ", productoId=" + Item.this.productoId +
                '}';
    }
}
