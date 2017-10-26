package veterinaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Conexion {
    private String rutaArchivoBD;
    private Connection conexion;
    
    public Conexion(String unaRutaArchivoBD) throws SQLException{
        rutaArchivoBD = unaRutaArchivoBD;
        crearTablaPerrosSiNoExiste();
    }
    
    private void conectar() throws SQLException{
        conexion = DriverManager.getConnection("jdbc:sqlite:" + rutaArchivoBD);
    }
    
    private void cerrar() throws SQLException{
        conexion.close();   
    }
    
    public void guardarPerro(Perro unPerro) throws SQLException{
        conectar();
        PreparedStatement sentencia = conexion.prepareStatement("INSERT INTO Perros (chip, nombre, raza) values (?,?,?)");
        sentencia.setInt(1, unPerro.getChip());
        sentencia.setString(2, unPerro.getNombre());
        sentencia.setString(3, unPerro.getRaza());
        sentencia.execute();
        cerrar();
    }
    
    public ArrayList<Perro> obtenerPerros() throws SQLException{
        conectar();
        PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM Perros");
        ResultSet resultado = sentencia.executeQuery();
        ArrayList<Perro> perros = new ArrayList<Perro>();
        while(resultado.next()){
            int unChip = resultado.getInt("chip");
            String unNombre = resultado.getString("nombre");
            String unaRaza = resultado.getString("raza");
            Perro unPerro = new Perro(unChip, unNombre, unaRaza);
            perros.add(unPerro);
        }
        cerrar();
        return perros;
    }
    
    private void crearTablaPerrosSiNoExiste() throws SQLException{
        conectar();
        PreparedStatement sentencia = conexion.prepareStatement("CREATE TABLE IF NOT EXISTS Perros"
                    + "(chip INTEGER PRIMARY KEY NOT NULL,"
                    + "nombre TEXT NOT NULL,"
                    + "raza TEXT NOT NULL"
                    + ")");
        sentencia.execute();
        cerrar();
    }
}
