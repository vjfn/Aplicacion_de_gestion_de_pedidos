package domain;

import clase.Item;
import clase.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemDAOImp implements ItemDAO{

    private static Connection connection;
    private final static String queryLoadAll = "select * from Item where codigo_pedido = ?";
    public ItemDAOImp(Connection conn) {
        connection = conn;
    }
    @Override
    public ArrayList<Item> loadAll(String codigoPedido) {
        //Se crea un ArryList de 'Item', 'salida', donde se cargarán cada uno de los items.
        ArrayList<Item> salida = new ArrayList<>();
        try {
            //Se prepara y ejecuta la consulta.
            PreparedStatement preparedStatement = connection.prepareStatement(queryLoadAll);
            preparedStatement.setString(1, codigoPedido);
            ResultSet resultSet = preparedStatement.executeQuery();

            //Por cada resultado de la consulta se crea un objeto 'Item'.
            while (resultSet.next()) {
                Item item = new Item();
                item.setId(resultSet.getInt("id"));
                item.setPedidoId(resultSet.getString("pedido_id"));
                item.setQty(resultSet.getInt("qty"));
                Integer productId = resultSet.getInt("producto_id");

                //Se carga la información de cada producto relacionado con cada item.
                ProductoDAOImp productoDAOImp = new ProductoDAOImp(DBConnection.getConnection());
                Producto producto = productoDAOImp.loadProduct(productId);
//                item.setProducto(producto);

                //Se carga cada item en salida.
                salida.add(item);
            }
        } catch (SQLException e) {
            // En caso de error al cargar los items se lanza una excepción.
            throw new RuntimeException(e);
        }
        return salida;
    }
}