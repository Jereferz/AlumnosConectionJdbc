import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
    private String url;
    private String usuario;
    private String contrasena;
    private Connection Cone;

    public Conection() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Connection getCone() {
        return Cone;
    }

    public void setCone(Connection cone) {
        this.Cone = cone;
    }

    public Conection(String url, String usuario, String contrasena) {
        this.url = url;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.CrearConection();
    }

    public void CrearConection() {
        try {
            this.Cone = DriverManager.getConnection(this.url, this.usuario, this.contrasena);
            System.out.println("OK:D");
        } catch (SQLException e) {
            System.out.println("No OKay D:");
            throw new RuntimeException(e);
        }
    }
    public void Desco() {
        try {
            this.Cone.close();
        } catch (SQLException var2) {
            throw new RuntimeException(var2);
        }
    }
}
