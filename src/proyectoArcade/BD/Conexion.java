package proyectoArcade.BD;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Conexion {
    private static String url = "jdbc:sqlite:HighScore";
    private static Connection conexion = null;

    public static Connection conectar() {
        if (conexion!=null) return conexion;
        try {
            conexion = DriverManager.getConnection(url);
//            log( Level.INFO, "Conectada base de datos GDT_BD", null );
        } catch (SQLException e) {
            System.out.println(e.getMessage());
//            log( Level.WARNING, "Error en la conexión a la base de datos GDT_BD", null );
        }
        return conexion;
    }
}