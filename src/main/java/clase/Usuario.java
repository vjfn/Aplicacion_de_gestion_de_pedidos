package clase;

import java.util.ArrayList;

public class Usuario {

    private Integer id;
    private String nombre;
    private String contrasenha;
    private String email;
    private ArrayList<Pedido> pedido;

    public Usuario(Integer id, String nombre, String contrasenha, String email) {
        this.id = id;
        this.nombre = nombre;
        this.contrasenha = contrasenha;
        this.email = email;
    }
}
