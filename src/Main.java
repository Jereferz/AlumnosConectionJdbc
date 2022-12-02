import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new ArrayList();
        new Alumno("Jeremias", "Fernandez", 42009051, 23);
        Conection conexion = new Conection("jdbc:mysql://localhost:3306/alumnos", "root", "");
        Connection con = conexion.getCone();
        String insertAlumno = "INSERT INTO alumno (Nombre, Edad, Dni, Apellido) VALUES (?,?,?,?)";

        try {
            Statement st = con.createStatement();
            String query = "UPDATE alumno SET Nombre='Ismael' WHERE Dni=70000000";
            st.execute(query);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conexion.Desco();
        }
    }
}