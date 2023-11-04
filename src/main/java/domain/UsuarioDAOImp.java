package domain;

import clase.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAOImp implements UsuarioDAO{

    private static Connection connection;
    private static String loadUserSQL = "SELECT * FROM Usuario WHERE mail = ?";
    private static String createUserSQL = "INSERT INTO Usuario(mail, password, name) VALUES(?, ?, ?)";

    public UsuarioDAOImp(Connection conn) { connection = conn; }

    @Override
    public Usuario loadUser(String mail, String password) {
        Usuario usuario = new Usuario();
        try {
            PreparedStatement pS = connection.prepareStatement(loadUserSQL);
            pS.setString(1, mail);

            ResultSet loadedUser = pS.executeQuery();

            if (loadedUser.next()) {
                usuario.setId(loadedUser.getInt("id"));
                usuario.setName(loadedUser.getString("name"));
                usuario.setMail(loadedUser.getString("mail"));
                usuario.setPassword(loadedUser.getString("password"));

                if (!password.equals(usuario.getPassword())){
                    throw new RuntimeException("Password incorrecto");
                }
            } else {
                throw new RuntimeException("Email o contraseña incorrectos.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuario;
    }

    @Override
    public Usuario createUser(String mail, String password) {
        Usuario usuario = new Usuario();

        return usuario;
    }
}
