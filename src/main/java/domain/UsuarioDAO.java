package domain;

import clase.Usuario;

public interface UsuarioDAO {
    public Usuario loadUser(String mail, String password);
    public Usuario createUser(String mail, String password);
}
